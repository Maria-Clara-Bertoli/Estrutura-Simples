package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroSete {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe o tamanho do lado do quadrado: ");
		double lado = valor.nextDouble();
		System.out.println("A �rea do quadrado � " + ati.AreaQuadrado(lado));

	}

}
