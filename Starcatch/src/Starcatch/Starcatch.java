package Starcatch;

public class Starcatch {

	public static void square() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void right_half_triangle_1() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void right_half_triangle_2() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j < i+1) {
				System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

	public static void left_half_triangle_1() {

		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void left_half_triangle_2() {

		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > 0; j--) {
				if (j > i+1) {
				System.out.print(" ");
				} else {
				System.out.print("*");
				}
			}
			System.out.println("");
		}

	}
	
	public static void triangle_1() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void triangle_2() {

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 9; j++) {
				if (j < 4-i || i+5 < j+1) {
				System.out.print(" ");
				} else {
				System.out.print("*");
				}
			}
			System.out.println("");
		}

	}
	
	public static void diamond_1() {

		// 윗 부분 삼각형 출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// 아랫 부분 삼각형 출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for (int j = (3-i)*2 -1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
	
	public static void diamond_2() {

		for (int i = 1; i < 8; i++) {
			for (int j = 0; j < 9; j++) {

				// i가 작으면 양쪽 끝 조건식 만족
				// i가 커지면 가운데 조건식 만족
				if (j < 5-i || j < i-3 || 12 < j+i+1 || i+4 < j+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {

		// 출력 하고싶은 도형의 주석 지우고 F11
		// 1은 for문 2개 사용, 2는 if문 사용
		
		// square();
		// right_half_triangle_1();
		// right_half_triangle_2();
		// left_half_triangle_1();
		// left_half_triangle_2();
		// triangle_1();
		// triangle_2();
		// diamond_1();
		// diamond_2();

	}

}