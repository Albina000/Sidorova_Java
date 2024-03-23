package ru.albina.zadaniya;
import java.util.Scanner;


public class Zadanie_2_1 {
	public String Zadan_2_1 (int a, int b) {
		
		int summa;
		int raznosty;
		int umnogenie;
		int delenie_celaya_chasty;
		int delenie_ostatok;
		
		// Операции сложения, вычитания, деления и умножения с целыми числами
		summa = a +b;
		raznosty = a - b;
		umnogenie = a * b;
		delenie_celaya_chasty = a / b;
		delenie_ostatok = a % b;
				
		System.out.println("a + b = " + summa);
		System.out.println("a - b = " + raznosty);
		System.out.println("a * b = " + umnogenie);
		System.out.println("a / b = " + delenie_celaya_chasty);
		System.out.println("a % b = " + delenie_ostatok);
		
		
		// Сравнение целых чисел.
		if (a == b) {
			return ("a = b");
		};
		
		if (a > b) {
			return ("a > b");
		} else {
			return ("a < b");
		}
		
		
		
	}	


	public static void main(String[] args) {
		Zadanie_2_1 z = new Zadanie_2_1();
		
		Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int num1 = in.nextInt();
        
        System.out.print("Введите второе целое число: ");
        int num2 = in.nextInt();
        
		System.out.println(z.Zadan_2_1(num1,num2));
	}

}
