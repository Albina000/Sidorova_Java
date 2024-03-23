package ru.albina.zadaniya;

import java.util.Scanner;

public class Zadanie_2_2 {
	public String Zadan_2_2 (String a, String b) {
		
		if(a.equals(b)){
		      return ("Строки идентичны.");
		} else
			
		return "Строки неидентичны.";
		
	}

	public static void main(String[] args) {
		Zadanie_2_2 z = new Zadanie_2_2();
		
		Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String a = in.nextLine();
        
        System.out.print("Введите вторую строку: ");
        String b = in.nextLine();
        
		System.out.println(z.Zadan_2_2(a,b));
	}

}
