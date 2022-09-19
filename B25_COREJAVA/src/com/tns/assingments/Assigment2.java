// program for maultiple of 3

package com.tns.assingments;
import java.util.Scanner;
public class Assigment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%3==0) {
			System.out.println("it is a multiple of 3");
		}
		else {
			System.out.println("it is not a multiple of 3");
		}

	}

}
