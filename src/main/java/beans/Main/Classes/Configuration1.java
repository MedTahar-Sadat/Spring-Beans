package beans.Main.Classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("beans.Main.Classes")
public class Configuration1 {

	@Bean
	public Collaborateur collaborateur() {
		return new Collaborateur();
		
	}
	
	
	
	@Bean
	public Periode periode() {
	 return new Periode();
	}
	
	@Bean
	public DemandeConge DemandeConge() {
		return new DemandeConge(null, null);
	}
	
	
}