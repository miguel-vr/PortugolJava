package br.com.portugol.exercicios;

import java.util.Scanner;

public class equacaoxy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		System.out.println("Digite o valor de A: ");
		a = input.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = input.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = input.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = input.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = input.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = input.nextDouble();
		
	
		
		x = (((c*e)-(b*f))/(a*e)-(b*d));
		y = (((a*f)-(c*d))/((a*e)-(b*d)));
		
		System.out.println("Valor de X: " + x + " & " + "Valor de Y: " + y);
		
		
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
