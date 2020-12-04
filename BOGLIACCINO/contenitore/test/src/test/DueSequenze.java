package test;

import java.util.Scanner;
import java.util.ArrayList;

public class DueSequenze {
	
	public static void compareArrays(String[] a, String[] b) {
		String result = "NO";
		for (int i = 0; i<a.length; i++){
			for (int j = 0; j<b.length; j++){
				if(a[i].equals(b[j])) result = "OK";
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		
		String[] sequenza1 = new String[5];
		String[] sequenza2 = new String[5];
		Scanner input = new Scanner(System.in);
		
		System.out.println("inserisci una parola nella prima sequenza");
		for(int i = 0; i<sequenza1.length;i++) sequenza1[i] = input.next();
		
		System.out.println("inserisci una parola nella seconda sequenza");
		for(int i = 0; i<sequenza1.length;i++) sequenza2[i] = input.next();
		
		compareArrays(sequenza1,sequenza2);

	}
}
