/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epricsort;

import java.util.Random;

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
		
		//testrandom(32);
		//testrandom(64);
		
		//Total time: 1 second
		//testrandom(16384);
		
		//Total time: 4 seconds
		//testrandom(32768);
		
		//Total time: 13, 17 seconds
		//testrandom(65536);
		
		//Total time: 55 seconds
		//testrandom(131072);
			

	}
	
	public static void testsort(int[] test){
		epricsort(test);
		System.out.println();
		for (int i = 0; i < test.length; i++){
			//System.out.print(test[i] + " ");
		}
	
	}
	
	public static void testrandom(int n){
		int[] test = new int[n];
		Random rng = new Random();
		
		for(int i = 0; i < test.length; i++) {
		test[i] = rng.nextInt(100);
		}
	
		testsort(test);
	
	}
	
	static void epricsort(int[] hello){
		int consec = 0;
		int wall = hello.length;	
		while (consec != (wall - 1)){
			consec = 0;
			for (int i = consec; i < (wall-1); i++){
				int first = hello[i];
				int next = hello[i+1];
				if (first > next)
					swap(i, i+1, hello);
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
