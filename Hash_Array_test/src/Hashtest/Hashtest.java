package Hashtest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashtest {

	public static void map1() {

		System.out.println();
		System.out.println("< Hash 첫 번째 문제 >");
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
			
		map1.put(1, "첫 번째 타자");
		map1.put(2, "두 번째 타자");
		map1.put(3, "세 번째 타자");
		map1.put(4, "네 번째 타자");
		map1.put(5, "다섯 번째 타자");

		for (int i = 1; i <= map1.size(); i++) {
		    System.out.println(map1.get(i));
		}
		
	}
	
	public static void map2() {

		System.out.println();
		System.out.println("< Hash 두 번째 문제 >");

		Map<String, String> map2 = new HashMap<String, String>();

		map2.put("1", "첫 번째 타자");
		map2.put("2", "두 번째 타자");
		map2.put("3", "세 번째 타자");
		map2.put("4", "네 번째 타자");
		map2.put("5", "다섯 번째 타자");

		for (int i = 1; i <= map2.size(); i++) {
		    System.out.println(map2.get(i + ""));
		}
		
	}
	
	public static void map3() {

		System.out.println();
		System.out.println("< Hash 세 번째 문제 >");

		Map<Object, String> map3 = new HashMap<Object, String>();

		map3.put("1", "첫 번째 타자");
		map3.put(2, "두 번째 타자");
		map3.put("3", "세 번째 타자");
		map3.put(4, "네 번째 타자");
		map3.put("5", "다섯 번째 타자");

		for (int i = 1; i <= map3.size(); i++) {
			if (map3.get(i) != null) {
		        System.out.println(map3.get(i));
		        
			    } else {
				System.out.println(map3.get(i + ""));
			}
			
		}
		
	}
	
	public static void main(String[] args) {

		System.out.println("출력을 보고싶은 문제 번호를 입력해주세요. (1~3만 입력)");
		
		Scanner sc = new Scanner(System.in);
		int check = sc.nextInt();
		
		
		switch (check) {
		
		case 1: map1(); break;
		case 2: map2(); break;
		case 3: map3(); break;
		default: System.out.println("오류가 발생하였습니다. 다시 시도해주세요.");
		}

		sc.close();
		
	}

}