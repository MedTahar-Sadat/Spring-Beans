package beans.Main.Classes;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Periode {
	
	@Value("28/06/2020")
	private String dateDebut;
	@Value("30")
	private int nbJours;
	
	@Override
	public String toString() {
	return ToStringBuilder.reflectionToString(this);
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public int getNbJours() {
		return nbJours;
	}
	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}
	
}
