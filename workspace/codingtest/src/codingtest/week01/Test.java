package codingtest.week01;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		int[] numbers = {1,2,3,4,5};
		int[] answer = new int[5];
	        for (int i = 0;i<numbers.length ;i++){
	            answer[i]=numbers[i]*2;
	        }
	        System.out.println(Arrays.toString(answer));
	}

}
