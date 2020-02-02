package beans.Main.Classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class DemandeConge {
	
	@Autowired
	 List<Collaborateur> colaborateurs=new ArrayList <Collaborateur>();
	@Autowired
	 List <Periode> periodes= new ArrayList <Periode>();
	 
	 
	public DemandeConge(List<Collaborateur> colaborateurs, List<Periode> periodes) {
		super();
		this.colaborateurs = colaborateurs;
		this.periodes = periodes;
	}

public boolean addColPer(Collaborateur c , Periode p )
		{
			boolean result=true;
			{
				if(!colaborateurs.contains(c) && !periodes.contains(p)) {colaborateurs.add(c);
																		periodes.add(p);
																		result= true;}
				else {
					result = false;
					}
				}
			return result;
			}


@Override
public String toString() {
   return ToStringBuilder.reflectionToString(this);
}
	 
	 

	 
	 
}
