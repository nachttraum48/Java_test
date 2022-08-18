package Arraytest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraytest {

	public static void arr1() {
		
		System.out.println();
		System.out.println("< Array 첫 번째 문제 출력 >");

		List<Integer> arr1 = new ArrayList<Integer>();

		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);

		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}

		System.out.println(arr1);
		
	}
	
	public static void arr2() {
		
		System.out.println();
		System.out.println("< Array 두 번째 문제 출력 >");

		List<Integer> arr2 = new ArrayList<Integer>();

		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);

		for (int i = 0; i < arr2.size(); i++) {
			if (arr2.get(i) % 2 == 0) {
				System.out.println(arr2.get(i));
			}
			
		}
		
	}
	
	public static void arr3() {
		
		System.out.println();
		System.out.println("< Array 세 번째 문제 출력 >");

		List<Integer> arr3 = new ArrayList<Integer>();

		arr3.add(1);
		arr3.add(2);
		arr3.add(3);
		arr3.add(4);
		arr3.add(5);

		for (int i = 0; i < arr3.size(); i++) {
			if (arr3.get(i) % 2 == 0) {
				System.out.println(arr3.get(i) * 2);
			}

		}
		
	}
	
	public static void arr4() {

		System.out.println();
		System.out.println("< Array 네 번째 문제 출력 >");

		List<String> arr4 = new ArrayList<String>();

		arr4.add("1");
		arr4.add("2");
		arr4.add("3");
		arr4.add("4");
		arr4.add("5");

		for (int i = 0; i < arr4.size(); i++) {
			if (Integer.parseInt(arr4.get(i)) % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.print(arr4.get(i) + "  (+2 해준 값: ");
				System.out.println((Integer.parseInt(arr4.get(i)) + 2) + ")");
			}

		}
		
	}
	
	public static void arr5() {

		System.out.println();
		System.out.println("< Array 다섯 번째 문제 출력 >");

		List<String> arr5 = new ArrayList<String>();

		arr5.add("사과");
		arr5.add("수박");
		arr5.add("바나나");
		arr5.add("참외");
		arr5.add("딸기");

		for (int i = 0; i < arr5.size(); i++) {
			if (arr5.get(i).equals("사과") || arr5.get(i).equals("딸기")) {
				System.out.println(arr5.get(i) + "는 맛있어요.");

			} else if (arr5.get(i).equals("수박")) {
				String replacedText = arr5.get(i).replace("수박", "아보카도");
				System.out.println(replacedText);

			} else
				System.out.println(arr5.get(i));

		}
		
	}
	
	public static void arr6() {

		System.out.println();
		System.out.println("< Array 여섯 번째 문제 출력 >");

		List<Integer> arr6 = new ArrayList<Integer>();

        // 임의의 숫자 10개 지정
		arr6.add(10);		arr6.add(12);		arr6.add(23);		arr6.add(31);		arr6.add(48);
		arr6.add(51);		arr6.add(56);		arr6.add(70);		arr6.add(79);		arr6.add(89);

		int i = 0;

		while (i < arr6.size() - 1) {
			int a = arr6.get(i);
			i++;
			int b = arr6.get(i);
			System.out.println(String.format("%d은(는) %d보다 %d만큼 작습니다.", a, b, b-a));
			
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("출력을 보고싶은 문제 번호를 입력해주세요. (1~6만 입력)");
		
		Scanner sc = new Scanner(System.in);
		int check = sc.nextInt();
		
		
		switch (check) {
		
		case 1: arr1(); break;
		case 2: arr2(); break;
		case 3: arr3(); break;
		case 4: arr4(); break;
		case 5: arr5(); break;
		case 6: arr6(); break;
		default: System.out.println("오류가 발생하였습니다. 다시 시도해주세요.");
		}

		sc.close();
		
	}

}