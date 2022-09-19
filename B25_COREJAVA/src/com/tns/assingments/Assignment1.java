// 	Program to display lights ON and lights OFF

package com.tns.assingments;
import java.util.Scanner;
public class Assignment1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		if(time>=18&&time<24)        
		{
			System.out.println("Lights ON");
		}
		else if(time>=0&&time<18) {
			System.out.println("Lights OFF");
		}

	}

}
