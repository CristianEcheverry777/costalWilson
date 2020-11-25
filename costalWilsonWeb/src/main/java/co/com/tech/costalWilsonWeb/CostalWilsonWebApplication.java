package co.com.tech.costalWilsonWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@EnableAutoConfiguration //levanta contexto spring
//@ComponentScan(basePackages="co.com.tech.costalWilsonWeb") //busca 
//@EnableJpaRepositories(basePackages="co.com.udem.inmobiliaria.repositories") //
//@EnableTransactionManagement //manejar transaciones a bd y persistencia
//@EntityScan(basePackages="co.com.tech.costalWilsonWeb.entities") //escanear 
public class CostalWilsonWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostalWilsonWebApplication.class, args);
	}

}
