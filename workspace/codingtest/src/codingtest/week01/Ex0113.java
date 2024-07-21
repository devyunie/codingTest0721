package codingtest.week01;

public class Ex0113 {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "abcd";
		System.out.println(str1 == str2); //주소 & 값이 같으면 True 아니면 False
		
		String str3 =new String("abcd");
		String str4 = new String("abcd");
		//객체를 생성하여 각가 str3 str4로 생성하였고 이것은 서로 다른 메모리 주소를 할당 받기 때문에 False반환
		System.out.println(str3 == str4);
		System.out.println(str1 == str4); 
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str4));
	}
}
