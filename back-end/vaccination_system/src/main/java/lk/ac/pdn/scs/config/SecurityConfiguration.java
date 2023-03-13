package lk.ac.pdn.scs.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import lk.ac.pdn.scs.services.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private UserService userService;

	
	/*
	 * @Bean public static PasswordEncoder passwordEncoder(){ return new
	 * BCryptPasswordEncoder(); }
	 */
	 

	
	  @Bean 
	  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception { 
		  http.csrf().disable() .authorizeHttpRequests((authorize) ->
	  authorize.antMatchers("/register/**").permitAll()
	  .antMatchers("/index").permitAll() .antMatchers("/users").hasRole("ADMIN")
	  ).formLogin( form -> form .loginPage("/login") .loginProcessingUrl("/login")
	  .defaultSuccessUrl("/users") .permitAll() ).logout( logout -> logout
	  .logoutRequestMatcher(new AntPathRequestMatcher("/logout")) .permitAll() );
		  return http.build();
	  }
	  
	  
	  @Autowired 
	  public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception { 
		  
		  auth .userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder()); 
	  }
	 
}