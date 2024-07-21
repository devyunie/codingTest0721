package codingtest.week01;

/*
 * 조건문 switch
 * 정수형, char, String 
 */
public class Ex0105 {

	public static void main(String[] args) {
		int i = 3;
		switch (i) {
		case 1:
			System.out.println(String.format("%d숫자입니다. ",i));
			break;
		default:
			System.out.println("숫자를 알수없음");
			break;
		}
		char ch = 'b';
		
		switch(ch) {
		case 'a':
			System.out.println(String.format("%s", String.valueOf(ch)));
			break;
		case 'b': 
			System.out.println(String.format("%s", String.valueOf(ch)));
			break;
		case 'c': 
			System.out.println(String.format("%s", String.valueOf(ch)));
			break;
		default:
			System.out.println("===============");
			break;
		}
		
		String str ="S";
		switch(str) {
		case "A":
			System.out.println(str);
			break;
		case "B":
			System.out.println(str);
			break;
		default:
			System.out.println("해당 알파벳이 없다");
			break;
		}
	}

}
