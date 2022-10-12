package br.com.erickfreire.aritmeticamaiormenor;

import java.util.Scanner;

public class Aritmetica_Menor_Mayor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Programa en Java que calcula el valor aritmético, más pequeño y más grande: ");
		System.out.print("Introduzca el primer valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Introduzca el segundo valor: ");
		numero2 = entrada.nextInt();
		
		System.out.print("Introduzca el tercer valor: ");
		numero3 = entrada.nextInt();
		
		System.out.printf("Suma: %d%n",(numero1 + numero2 + numero3));
		System.out.printf("Promedio: %d%n",((numero1 + numero2 + numero3)/3));
		System.out.printf("Producto: %d%n",(numero1 * numero2 * numero3));
		
		if(numero1 > numero2)
			if(numero1 > numero3)
				System.out.printf("El numero %d es el mayor%n", numero1);
		
		if(numero2 > numero1)
			if(numero2 > numero3)
				System.out.printf("El numero %d es el mayor%n", numero2);
		
		if(numero3 > numero1)
			if(numero3 > numero2)
				System.out.printf("El numero %d es el mayor%n", numero3);
		
		if(numero1 < numero2)
			if(numero1 < numero3)
				System.out.printf("El numero %d es el menor%n", numero1);
		
		if(numero2 < numero1)
			if(numero2 < numero3)
				System.out.printf("El numero %d es el menor%n", numero2);
		
		if(numero3 < numero1)
			if(numero3 < numero2)
				System.out.printf("El numero %d es el menor%n", numero3);
		

	}

}
