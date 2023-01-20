package lk.ac.pdn.scs.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import lk.ac.pdn.scs.model.User;
import lk.ac.pdn.scs.repository.UserRepository;

@Controller
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	
	
	public UserController() {
	
	}

	@GetMapping("/home")
	public String viewHomePage() {
		return "index"; //name of home page
	}
	
	@GetMapping("/signup")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup"; //name of  file
	}
	
	@PostMapping("/registration")
	public String processRegister(@RequestBody User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getU_password());
		user.setU_password(encodedPassword);
		
		userRepo.save(user);
		
		return "login";
	}
	

}
