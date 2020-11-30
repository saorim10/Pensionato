package application;

import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import entities.Quartos;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quartos[] vetor = new Quartos[10];
		
		cabec();
		System.out.print("Quantos Apartamentos você quer alugar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Locação: " + i + ": ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quartos Livres: ");
			
			for(int j = 0; j < vetor.length; j++) {
				if(vetor[j] == null) {
					System.out.print("(" + (j+1) + ") ");
				}
			}
			
			System.out.println();
			System.out.print("Número do Apartamento: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			vetor[quarto-1] = new Quartos(nome, email);
		}
		
		cabec();
		System.out.println("Quartos Alugados:");
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] != null) {
				System.out.println("Quarto: " + (i+1) + ": " + vetor[i]);
			}
		}
		
		sc.close();
	}
	
	public static void cabec() {
		System.out.println();
		System.out.println("ALUGUEL DE APARTAMENTOS PARA ESTUDANTES");
		System.out.println("=======================================");
		System.out.println();
	}
	
}
