package edu.training.jc.simpleNums;

import java.util.Scanner;

public class SimpleNum {
	private int simpleNum;
	
	public SimpleNum() {
		this.simpleNum = 2;
		//System.out.println("Инициализировано простое число по умолчанию: 2\n");
	}
	
	public SimpleNum(int simple_num) {
		if (simple_num <= 1) {
			throw new IllegalArgumentException("Некорректное значение.");
		}
		this.simpleNum = simple_num;
		//System.out.printf("Инициализировано простое число по заданному параметру: %d\n", simple_num);
	}
	
	public int getSimpleNum() {
		return this.simpleNum;
	}
	
	public void setSimpleNum(int simple_num) {
		this.simpleNum = simple_num;
	}
	
	public static boolean isSimpleNum(int simple_num) {
		if (simple_num <= 1) {
			System.out.println("Простое число не может быть равным или меньше единицы");
			return false;
		}
		
		for (int i = 2; i * i <= simple_num; i++) {
			if (simple_num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void display(String str) {
		System.out.print(str);
	}
	
	public static int input() {
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		while (!sc.hasNextInt()) {
			System.out.println("Некорректное значение.");
			sc.nextLine();
		}
		result = sc.nextInt();
		
		sc.close();
		return result;
	}
	
	public static int simpleSum(int simple_num) {
		int result = 0;
		
		for (int i = 2; i < simple_num; i++) {
			if (isSimpleNum(i)) {
				result += i;
			} else {
				continue;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		// ввод
		display("Введите число: ");
		SimpleNum prime_num = new SimpleNum(input());
		// вывод
		if (isSimpleNum(prime_num.getSimpleNum())) {
			System.out.printf("Число %d является простым.\n", prime_num.getSimpleNum());
			System.out.printf("Сумма всех чисел, меньших %d, равна %d", prime_num.getSimpleNum(), simpleSum(prime_num.getSimpleNum()));
			
		} else {
			System.out.printf("Число %d не является простым.\n", prime_num.getSimpleNum());
		}
		
		
	}
}
