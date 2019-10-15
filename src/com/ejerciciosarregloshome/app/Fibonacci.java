package com.ejerciciosarregloshome.app;

public class Fibonacci {

	public static void main(String[] args) {
		  int i;
		  int n=100;
		  //int vect[n];
		  long[] vect= new long [n];
		  vect[0] = 0;
		  vect[1] = 1;
		  
		  
		  
		  for (i=2; i<n; i++)
		  {
		    vect[i] = vect[i-1] + vect[i-2];
		  }
		  
		  for (i=0; i<n; i++)
		  {
		    System.out.println("Index: \t");
		    System.out.println(i);
		    System.out.println("\t\t\tfibonacci:\t");
		    System.out.println(vect[i]);
		  }

	}

}
