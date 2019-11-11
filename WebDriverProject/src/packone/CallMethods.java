package packone;

public class CallMethods {

	public static void main(String[] args) {
		
		Methods m=new Methods();
		m.launchApp("http://facebook.com");
		m.elementsCount("a", 20);
		m.elementsCount("img", 4);
		m.elementsCount("select", 3);
		m.closeApp();
		m.launchApp("http://yahoomail.com");
		m.closeApp();
		

	}

}
