package java_coding_challenge;
//Q:Print your name vertically [they are not mention: character by character]
//
// String name="Ruhul"
//loop through
//charAt(0)
//length()
//
//use System.out.println()
public class D1_1_PrintNameVertically {
	
	public static void main(String[] args) {
	String name="Ruhul";	
		//System.out.println(name.length());//5
		//System.out.println(name.charAt(0));//A	
		
		//Note: we should not take index 5---it will give exception as we dont have
	for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}

		
	}

}
