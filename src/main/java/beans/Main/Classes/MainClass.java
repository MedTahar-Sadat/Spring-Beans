package beans.Main.Classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac= new AnnotationConfigApplicationContext(Configuration1.class);
		
		
		Collaborateur col = ac.getBean(Collaborateur.class);
		System.out.println(col);
		
		
		Periode p = ac.getBean(Periode.class);
		System.out.println(p);
		
		DemandeConge dc = (DemandeConge) ac.getBean(DemandeConge.class);
		dc.addColPer(col, p);
		System.out.println(dc);
		
	

		
	}

}
