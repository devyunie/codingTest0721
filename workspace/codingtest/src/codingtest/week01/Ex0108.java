package codingtest.week01;

public class Ex0108 {

	public static void main(String[] args) {
		ep : //라벨 브레이크
		while (true) {
			for (int i = 0; i < 100; i++) {
				if (i == 70) {
					break ep;
				}
				System.out.println(i);
			}
		}
	}

}
