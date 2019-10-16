package com.ejerciciosarregloshome.app;
import java.util.Random;

public class SumaInversaVectores {

	public static void main(String[] args) {
		
		int suma=0;
		int numerosGenerados=0;
		
		
		Random randomValores = new Random();
		int [] miArreglo =new int [10];
		for(int i=0;i<miArreglo.length;i++)
		{
			int n= randomValores.nextInt(10);
			miArreglo[i]= n;
			
			System.out.println(miArreglo[i]);
		}
		System.out.println(" _______");
		
		int [] miArreglo2 =new int [10];
		for(int j=0;j<miArreglo2.length;j++)
		{
			int n= randomValores.nextInt(10);
			miArreglo2[j]= n;
			
			System.out.println(miArreglo2[j]);
		}
		
		int []miArreglo3 =new int[10];
				for (int i=0;i<miArreglo3.length;i++)
				{
					miArreglo3[i] = miArreglo[i] + miArreglo2[i];
					
					System.out.println(miArreglo[i]+"+ "+miArreglo2[i]+"= "+miArreglo3[i]);
				}
			

	}

}
