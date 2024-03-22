package ru.albina.hello_world;

public class Zadanie_2_3 {
	public void Zadan_2_3 (int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println (nums[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		Zadanie_2_3 z = new Zadanie_2_3();
		
		int[] mas = new int[] { 1,2,3,4,5,6,7,8,9,10};
			
		z.Zadan_2_3(mas);
	}

}
