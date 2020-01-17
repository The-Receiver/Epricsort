/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epricsort;

/**
 *
 * @author eric
 */
public class Epricsort {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		
		int[] tosort = {60,62,41,15,52,47,45,49};
		epricsort(tosort);
		System.out.println();
		for (int i = 0; i < tosort.length; i++){
			System.out.print(tosort[i] + " ");
		}

	}
	
	static void epricsort(int[] hello){
		int consec = 0;
		int wall = hello.length;
		
		while (consec != (wall - 1)){
			consec = 0;
			for (int i = consec; i < (wall-1); i++){
				int first = hello[i];
				int next = hello[i+1];
				if (first > next){
					swap(i, i+1, hello);
					consec = 0;
				}
				else
					consec++;
			}

		}
	
	}
	
	static void swap(int i, int j, int[] arr) {
		 int t = arr[i];
		 arr[i] = arr[j];
		 arr[j] = t;
	}
	
	
}
