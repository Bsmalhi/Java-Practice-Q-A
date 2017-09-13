package com.practice;

import java.util.Scanner;

public class FibonnaciSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a;
		System.out.print("Please enter the number to find fibonnaci Sequence: ");
		a = scan.nextLong();
		scan.close();
		for (long i = 1; i <= a; i++)
			System.out.print(fibSeq(i) + " ");
	}

	public static long fibSeq(long i) {
		if ((i == 0) || (i == 1))
			return i;

		return fibSeq(i - 1) + fibSeq(i - 2);
	}

}
