package br.com.portugol.exercicios;

import java.util.Scanner;

public class exabc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double D,R,S;
		int a,b,c;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = input.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		b = input.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		c = input.nextInt();
		
		R = (a+b)^2;
		S = (b+c)^2;
		D = (R+S)/2;
		
		System.out.println("O resultado do calculo �: " + D);
		
	
		input.close();
	}

}
