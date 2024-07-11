package java_coding_challenge;

public class Printin_my_name_vertically_reverse_way_creating_a_void_type_method {
	
	
	public static void print_name_vertically_using_my_method(String name) {
		for (int i=name.length()-1; i>=0;i--) {
			System.out.println(name.charAt(i));
			
		}
		
	}
	
	public static void main(String[] args) {
		String name = "Ruhul";
		print_name_vertically_using_my_method(name);
		
		
		
	}
}
