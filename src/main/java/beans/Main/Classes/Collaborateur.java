package beans.Main.Classes;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Collaborateur {
		
		@Value("SADAT")
		private String nom;
		
		@Value("MOHAND TAHAR")
		private String prenom;
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		
		   @Override
		   public String toString() {
		      return ToStringBuilder.reflectionToString(this);
		     }
		
		
		
}
