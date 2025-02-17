package Java;

public class singleton {

	public static singleton s = null;
	
	private singleton() {
		
	}
	
	int a = 10;
	public static  singleton getinstance() {
		
		if(s==null) {
			
			s= new singleton();
		}
		return s;
		
	}
}

