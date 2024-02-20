package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.springboot.dao.PatientRepository;
import com.example.springboot.dao.UserRepository;
import com.example.springboot.entities.User;

@SpringBootApplication
public class PatientMedicineAppointmentSystemApplication  implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;
	
	private UserRepository userRepository ;
	
	private PasswordEncoder passwordEncoder;
	
	public void SpringMvcApplication(UserRepository userRepository,PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }
	

	public static void main(String[] args) {
		SpringApplication.run(PatientMedicineAppointmentSystemApplication.class, args);
	}
	public void run(String... args) throws Exception {
		/*
		patientRepository.save(new Patient(null,"ayoub",30,new Date(),false));
		patientRepository.save(new Patient(null,"amine",50,new Date(),false));
		patientRepository.save(new Patient(null,"yassine",9,new Date(),true));
		patientRepository.save(new Patient(null,"Mohammed",33,new Date(),true));
		patientRepository.save(new Patient(null,"karim",91,new Date(),false));
		*/
		userRepository.deleteAll();
		
		userRepository.save(new User());
		userRepository.save(new User());
		userRepository.save(new User());
		
		/*
		patientRepository.findAll().forEach(patient->{
			System.out.println(patient);
		});*/

}
}
