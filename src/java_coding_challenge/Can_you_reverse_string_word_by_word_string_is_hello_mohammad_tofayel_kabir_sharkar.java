package java_coding_challenge;
//put the string in string variable
// create a no return type static method(outside of the main method) with string args
//in the body call the split()
public class Can_you_reverse_string_word_by_word_string_is_hello_mohammad_tofayel_kabir_sharkar {
	
	public static void reverseStringWordbyWord(String str) {
		
		String [] words = str.split(" ");
		
		for (int i=words.length-1; i>=0; i--) {
			System.out.print(words[i] +", ");	
			
		}
		
	}
	public static  void main(String[] args) {
		String str = "hello mohammad tofael kabir sharkar";
	//	System.out.println(str.split(" "));
		 reverseStringWordbyWord(str);
	}

}
