package br.com.portugol.exercicios;

import java.util.Scanner;

public class carroCusto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double custoFabrica, custoFinal;
		
		System.out.println("Informe o custo de f�brica do ve�culo: ");
		custoFabrica = input.nextDouble();
		
		custoFinal = custoFabrica + (0.28 * custoFabrica) + (0.45 * custoFabrica);
		custoFinal = custoFinal + (0.45 * custoFinal);
		System.out.println("Ocusto para o consumidor final � de: " + custoFinal);
		
		input.close();

	}

}
