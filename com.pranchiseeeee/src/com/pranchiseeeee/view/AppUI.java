package com.pranchiseeeee.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppUI {

	private static Scanner sc = new Scanner(System.in);

	public static String inputString() {
		return sc.nextLine();
	}

	public static int inputInteger() {
		int num = 0;
		try {
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("정수로 입력해 주세요.");
		} finally {
			sc.nextLine();
		}

		return num;
	}


	//시작 화면 출력
	public static void startScreen() {
		System.out.println("\n========== 프렌차이즈 관리 ==========");
		System.out.println("### 1. 본사 직원 관리 시스템");
		System.out.println("### 2. 매장 관리 시스템");
		System.out.println("### 3. 메뉴 관리 시스템");
		System.out.println("### 4. 매출 관리 시스템");
		System.out.println("### 5. 시스템 종료");
		System.out.println("--------------------------------------");
		System.out.print(">>> ");
	}

	//직원 관리 시스템 화면 출력
	public static void staffManagementScreen() {
		
	}
	
	
	
	
	//매장 관리 시스템 화면 출력
	public static void shopManagementScreen() {
		
	}
	
	
	//메뉴관리 시스템
	public static void menuManagementScreen() {
		
	}
	
	//매출 관리 시스템
	public static void salesManagementScreen() {
		
	}
	
	
	
	
	
	
	
}