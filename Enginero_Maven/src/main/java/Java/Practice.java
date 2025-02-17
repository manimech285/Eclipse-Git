package Java;



public class Practice {
	
	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http:\\192.168.2.14");
//		
		int given =2345678;
		
		int reversed =0;
		
		while(given!=0) {
			
			reversed=reversed*10;//0
			reversed=reversed+given%10;//3
			given=given/10;//12
			
		}
		System.out.println(reversed);
	}
	

	
	
	
	
	
	}
	
