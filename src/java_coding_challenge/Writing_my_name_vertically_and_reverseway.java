package java_coding_challenge;

public class Writing_my_name_vertically_and_reverseway {
	
	public static void main( String[] args) {
		String name = "Ruhul";
		
		for (int i=name.length()-1; i>=0; i--) {
			System.out.println(name.charAt(i));
		}
		
	}

}
