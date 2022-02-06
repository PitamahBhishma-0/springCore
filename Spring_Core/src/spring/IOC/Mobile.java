package spring.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// WE HAVE ACHIEVED IOC SINCE WE HAVE NOT CREATED POJO(PLAIN OLD JAVA OBJECT) WE HAVE ASKED SPRING TO CREATE IT USING CONFIG FILE IN 
//LINE 24 WE HAVE USED ApplicationContext FOR ACHEIVING IOC .
public class Mobile {

	public static void main(String[] args) {
		/*
		 * CLASS REFRENCE------------------- BAD METHOD NTC ntc=new NTC();
		 * ntc.calling();
		 */
		/*
		 * INTERFENCE REFRENCE---------------------GOOD SOFTWARE_ENGINERING PRACTICE Sim
		 * ntc=new NTC(); ntc.calling();
		 */

		// USE OF FUCKING SPRING

		ApplicationContext context = new ClassPathXmlApplicationContext("beans_IOC.xml");
		System.out.println("Config loaded");
		// CALLING OF BEANS FOR PARTICULAR CLASS USING CLASS REFRENCE APPROACH

		NTC NT = (NTC) context.getBean("sim"); // ---------- here we are using casting method to get bean of NTC class
		NT.calling();
		NT.data();
		NTC nt = context.getBean("sim", NTC.class); // ------------- here we are not casting the type to NTC to get bean
		nt.calling();
		nt.data();

		// CALLING OF BEANS FOR PARTICULAR CLASS USING INTERFACE REFRENCE
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();

		/*
		 * WHILE USING CLASS REFERENCE METHOD WE HAVE TO CHANGE THE CODE IF WE WANT TO
		 * USE ANOTHER SIM SERVICE PROVIDER AND CONFIGURE THE
		 * CONFIGURATIONFILE(bean.xml) which is against the spring. BUT IF WE USE THE
		 * INTERFACE APPROACH, CALLING THE BEAN WE HAVE TO CHANGE ONLY THE CONFIG FILE
		 * IF WE WANT TO ADD OTHER SERVICE PROVIDER
		 */

	}

}
