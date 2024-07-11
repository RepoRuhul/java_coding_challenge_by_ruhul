package java_coding_challenge;

// print your name reverse way without looping
//so we can use string buffer class or string builder class
//we are creating the object of stringbuffer class or stringbuilder class
//we are using here reverse()
public class Printing_my_name_reverse_way_without_looping_using_string_builder_class {

	public static void main(String[] args) {
		String name = "Ruhul";
//		System.out.println(name);// this is regular print
		StringBuilder sb = new StringBuilder(name);
		System.out.println(sb.reverse());// this is reverse printing
//		name=sb.reverse().toString();//stringbuilder convert to string
//		System.out.println(name);
	}

}
