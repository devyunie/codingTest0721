package codingtest.week01;

/*
 * 반복문
 */
public class Ex0106 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);

		}
		System.out.println("-----------");
		for (int i = 0; i < 5; ++i) {
			System.out.println(i);
		}
//		for (;;) {
//			System.out.println("==");
//		}
		System.out.println("----------------");
		String[] arrays = { "a", "b", "c", "d" };
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}
		String str = "abcd";
		System.out.println(str.length());
		for (String arr : arrays) {
			System.out.println(arr);
		}
		System.out.println("=============");
		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for(int number : numbers) {
			System.out.println(number);
		}
	}

}
