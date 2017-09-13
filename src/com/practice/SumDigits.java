package com.practice;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.print("Please enter a num for sum of the digits: ");
		int num = d.nextInt();
		d.close();
		System.out.println("Sum of the digits: " + addNum(num));
	}

	public static int addNum(int num) {
		int sum = 0;
		if ((num == 0) || (num == 1))
			return num;

		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}

		return sum;
	}

}
