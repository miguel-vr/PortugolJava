package br.com.portugol.exercicios;

import java.util.Scanner;

public class dias {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		int idade_anos, idade_meses, idade_dias, total_dias;
		
		
		System.out.println("Digite a quantidade de dias:");
		total_dias = input.nextInt();
		
		
		idade_anos = total_dias / 365; 
		total_dias = total_dias % 365;
		
		idade_meses = total_dias / 30; 
		total_dias = total_dias % 30; 
		idade_dias = total_dias; 
		
		System.out.println("A idade � " + idade_anos);
		System.out.println("A quantidade de meses � " + idade_meses);
		System.out.println("A quantidade de dias � " + idade_dias );
		input.close();
		
		input.close();
	}
}