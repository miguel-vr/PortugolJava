package br.com.portugol.exercicios;

import java.util.Scanner;

public class formulaP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		    double x1, x2, y1, y2, distancia;
		 
		    System.out.println("Digite x1: ");
		    x1 = input.nextDouble();
		    
		    System.out.println("Digite x2: ");
		    x2 = input.nextDouble();
		    
		    System.out.println("Digite y1: ");
		    y1 = input.nextDouble();
		    
		    System.out.println("Digite y2: ");
		    y2 = input.nextDouble();
		    
		    distancia = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);             
		    System.out.println("A distância é de" + distancia);
	
		input.close();

	}

}
