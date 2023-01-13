package lk.ac.pdn.scs.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="u_id", nullable=false, unique=true)
		private int u_id;
		
		@Column(name="u_fname", nullable=false)
		private String u_fname;
		

		@Column(name="u_lname", nullable=false)
		private String u_lname;
		
		@Column(name="u_email", nullable=false, unique=true)
		private String u_email;
		
		@Column(name="u_password", nullable=false, length=64 )
		private String u_password;
		
		@Column(name="u_address", nullable=false)
		private String u_address;
		
		@Column(name="u_mobile")
		private String u_mobile;
		
		@Column(name="u_dob", nullable=false)
		private String u_dob;
		
		@Column(name="u_gender", nullable=false)
		private String u_gender;
		
		
		
		@OneToMany(targetEntity=Appointment.class, cascade=CascadeType.ALL)
		@JoinColumn(name="u_id", referencedColumnName = "u_id")
		private List<Appointment> appointments;
		
		@OneToMany(targetEntity=VaccineDose.class, cascade=CascadeType.ALL)
		@JoinColumn(name="u_id", referencedColumnName = "u_id")
		private List<VaccineDose> vaccineDoses;
		

		
		public String getU_password() {
			return u_password;
		}


		public void setU_password(String u_password) {
			this.u_password = u_password;
		}


		public List<Appointment> getAppointments() {
			return appointments;
		}


		public void setAppointments(List<Appointment> appointments) {
			this.appointments = appointments;
		}


		public List<VaccineDose> getVaccineDoses() {
			return vaccineDoses;
		}


		public void setVaccineDoses(List<VaccineDose> vaccineDoses) {
			this.vaccineDoses = vaccineDoses;
		}


		
		


		public int getU_id() {
			return u_id;
		}


		public void setU_id(int u_id) {
			this.u_id = u_id;
		}


		public String getU_fname() {
			return u_fname;
		}


		public void setU_fname(String u_fname) {
			this.u_fname = u_fname;
		}


		public String getU_lname() {
			return u_lname;
		}


		public void setU_lname(String u_lname) {
			this.u_lname = u_lname;
		}


		public String getU_email() {
			return u_email;
		}


		public void setU_email(String u_email) {
			this.u_email = u_email;
		}


		public String getU_address() {
			return u_address;
		}


		public void setU_address(String u_address) {
			this.u_address = u_address;
		}


		public String getU_mobile() {
			return u_mobile;
		}


		public void setU_mobile(String u_mobile) {
			this.u_mobile = u_mobile;
		}


		public String getU_dob() {
			return u_dob;
		}


		public void setU_dob(String u_dob) {
			this.u_dob = u_dob;
		}


		public String getU_gender() {
			return u_gender;
		}


		public void setU_gender(String u_gender) {
			this.u_gender = u_gender;
		}


		

}
