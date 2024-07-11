package java_coding_challenge;

public class PrintMyNameReverseWayWithOutLooping {

	public static void main(String[] a) {
		String name = "Ruhul";
//		System.out.println(name);
		StringBuffer sb = new StringBuffer(name);
//		sb =sb.reverse();
		name = sb.reverse().toString();
//	sb=sb.reverse().toString();
		System.out.println(name);
	
		

	}
}
