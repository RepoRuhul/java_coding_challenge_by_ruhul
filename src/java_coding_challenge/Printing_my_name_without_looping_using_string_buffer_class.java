package java_coding_challenge;

// print your name reverse way without looping
//so we can use string buffer class or string builder class
public class Printing_my_name_without_looping_using_string_buffer_class {

	public static void main(String[] args) {
		String name = "Ruhul";
		System.out.println(name);// this is regular print
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());// this is reverse printing

	}

}
