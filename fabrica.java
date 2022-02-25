package br.com.portugol.exercicios;

import java.util.Scanner;

public class fabrica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 int segundos, minutos, horas, totalSegundos, sobraHoras, sobraMinutos;
		
		System.out.println("Calcular Tempo de Evento"); 
		
		System.out.println("Informe o tempo em segundos -");
		totalSegundos = input.nextInt();
		horas = totalSegundos / 3600;
		sobraHoras = totalSegundos - (horas * 3600);
		minutos = sobraHoras / 60;
		segundos = sobraHoras - (minutos * 60);
		System.out.println("Tempo do Evento: " + horas + " h " + minutos + " min " + segundos+ " seg ");

		input.close();
		
		

	}

}
