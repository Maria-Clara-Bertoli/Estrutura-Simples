package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroTres {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe o primeiro valor: ");
		float valor1 = valor.nextFloat();
		System.out.println("Informe o segundo valor: ");
		float valor2 = valor.nextFloat();
		System.out.println("A soma � " + ati.Soma(valor1, valor2));
	}

}
