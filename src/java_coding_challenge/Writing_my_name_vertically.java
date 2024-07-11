//Q:Print your name vertically [they are not mention: character by character]

package java_coding_challenge;

public class Writing_my_name_vertically {

	public static void main(String[] args) {
		String name = "Ruhul Kuddus Rana";
		//System.out.println(name);// regular checking
		//System.out.println( name.length());
		//System.out.println(name.charAt(4));
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
			
		}

	}

}
