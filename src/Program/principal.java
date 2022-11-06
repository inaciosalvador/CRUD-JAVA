package Program;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===================");
		System.out.println(" BEM VINDO AO MAPET ");
		System.out.println("===================");
		System.out.println("");
		
		System.out.println("1 - Fazer login");
		System.out.println("2 - Cadastre-se");

		int escolha;
		escolha = sc.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("Insira seu email:");
			System.out.println("Senha: ");
			break;
		case 2:
			System.out.println("Nome:");
			System.out.println("Email: ");
			System.out.println("Senha: ");

			break;
		}

		sc.close();

	}

}
