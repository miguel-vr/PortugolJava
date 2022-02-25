package br.com.portugol.exercicios;

import java.util.Scanner;

public class anos {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int dias, meses, anos, diasMes = 30, diasAnos = 365;
		 
		
		System.out.println("Informe a sua idade.");
		System.out.print("Anos: ");
		anos = input.nextShort();
		
		System.out.print("Meses: ");
		meses = input.nextShort();
		
		System.out.print("Dias: ");
		dias = input.nextShort();
		
		dias += (anos * diasAnos) + (meses * diasMes);
		
		System.out.println("\n\nA sua idade em dias é " + dias);
		
		input.close();
	}
}