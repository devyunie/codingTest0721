package codingtest.week01;

public class Ex0112 {

	public static void main(String[] args) {
		String str = "Good Morning";
		System.out.println("charAt : " + str.charAt(7));
		System.out.println("startWith: " +str.startsWith("Good"));
		System.out.println("endWith: "+ str.endsWith("ng"));
		System.out.println("equals: "+ str.equals("Good morning"));
		System.out.println("indexOf: "+ str.indexOf("M"));
		System.out.println("lastIndesOf: "+ str.lastIndexOf("n"));
		System.out.println("length: "+ str.length());
		System.out.println("----------------------a");
		System.out.println("replace: " + str.replace("Good","a"));
		System.out.println("replace: " + str.replace("o","a"));
		System.out.println("replace: " + str.replace("[Good]","a"));
		
		System.out.println("replaceAll: " + str.replaceAll("Good", "a"));
		System.out.println("replaceAll: " + str.replaceAll("o", "a"));
		System.out.println("replaceAll: " + str.replaceAll("[Good]", "a")); //대괄호 -> 정규식 OR -> G,o,d 이면 해당 문자를 a로 바꾼다 
		System.out.println("replaceAll: " + str.replaceAll("[^G]", "a"));// 꺽쇠가 대괄호 안에 있으면 Not G가 아닌수 전부다 바꾼다
		System.out.println("replaceAll: " + str.replaceAll("^[G]", "a")); //G로 시작하는 문자
		System.out.println("replaceAll: " + str.replaceAll("[g]$", "a")); //g로 끝나는 문자
		
	}

}
