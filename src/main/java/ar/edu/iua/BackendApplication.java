package ar.edu.iua;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.crypto.password.PasswordEncoder;



@SpringBootApplication
public class BackendApplication extends SpringBootServletInitializer implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	public static void main(String[] args) {
	
		SpringApplication.run(BackendApplication.class, args);

	}
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	public void run(String... args) throws Exception {
		
		log.info("Estamos en la version con mysql 57");
	}
}

/*
Modelo
  | -- > Persistencia
----------------------------
Negocio
----------------------------
Servicios WEB (REST)
  | --> servicio 1   |
  | --> servicio 2   | seguridad
  | --> servicio N   V
*/
