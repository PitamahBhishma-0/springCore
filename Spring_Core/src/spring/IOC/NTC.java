package spring.IOC;

public class NTC implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling through NTC");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing through NTC");
	}

}
