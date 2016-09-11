package ca.gtConsulting.poc;

public class StringPOC {

	public static void main(String[] args){
		String str = "This is %s a test";
		String formattedStr = String.format(str, "Very Big");
		
		System.out.println(formattedStr);
		
	        str = "change 1";	
		str = "This is %s more tests %s";
	}
}
