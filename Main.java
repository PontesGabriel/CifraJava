package CrifaLevel1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		CifraDeCesar c1 = new CifraDeCesar();
		System.out.println("Voc� deseja cifrar ou decifrar uma palavra?");
		System.out.println("1 - Cifrar");
		System.out.println("2 - Decifrar");

		switch (t.nextInt()) {
		case 1:
			System.out.println("Digite a palavra que voc� quer cifrar e uma senha n�merica.");
			System.out.printf("Resultado: " + c1.cifrarCesar(t.next(), t.nextInt()));
			break;
		case 2:
			System.out.println("Digite a palavra cifrada e sua respectiva senha n�merica.");
			System.out.printf("Resultado: " + c1.decifrarCesar(t.next(), t.nextInt()));
			break;
		}
	}
}
