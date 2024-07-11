package day2;

public class D2_8_methodToAddHighestAndLowestNumber {
	//create the method to print lowest and highest number
	public static void findHighestAndLowestNumbers(int arr[]){
		int lowestNumber=arr[0];
		int hiestNumber=arr[0];
		int sumOfLowestAndHighest;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<lowestNumber) {
				lowestNumber=arr[i];
			}else if(arr[i]>hiestNumber) {
				hiestNumber=arr[i];
			}
		}	
		
		sumOfLowestAndHighest=lowestNumber+hiestNumber;
		
		System.out.println("sumOfLowestAndHighest:"+sumOfLowestAndHighest);	
		
	}

	public static void main(String[] args) {
		//have some numbers in an array		
		int[] arr= {300,2,8,1,100,25,3};		
		//calling the method
		findHighestAndLowestNumbers(arr);
		
	}

}
