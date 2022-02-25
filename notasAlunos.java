package br.com.portugol.exercicios;

import java.util.Scanner;

public class notasAlunos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double nota1, nota2, nota3, media = 0;
		
		
		System.out.println("Digite o valor da nota 1: ");
		nota1 = input.nextDouble();
		
		System.out.println("Digite o valor da nota 2: ");
		nota2 = input.nextDouble();
		
		System.out.println("Digite o valor da nota 3: ");
		nota3 = input.nextDouble();
		
		media = ((nota1*2)+(nota2* 3)+(nota3*5))/ 10;
		System.out.println("A média  é: " + media);
		
		input.close();
		
		
	}

}
