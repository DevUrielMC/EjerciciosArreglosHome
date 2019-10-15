package com.ejerciciosarregloshome.app;



public class PromedioVector {

	public static void main(String[] args) {

	final int ELEMENTS_ARRAY=100;
	
	int i=0;
	long suma=0;
	long prom=0;
	
	int[] array= new int [ELEMENTS_ARRAY];
	
	

	for(i=0; i<ELEMENTS_ARRAY;i++)
	{
		suma = suma + array[i];
	}
	prom = suma /ELEMENTS_ARRAY;

	System.out.println(prom);

	}

}
