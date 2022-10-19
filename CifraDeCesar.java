package CrifaLevel1;

import java.util.Scanner;

public class CifraDeCesar {

	Scanner t = new Scanner(System.in);
	protected String alfabeto = "abcdefghijklmnopqrstuvwxyz";

	String cifrarCesar(String palavra, int senha) {

		char caracter;
		int indice = -1;
		int x = 0;
		String palavracorreta = "";

		for (int i = 0; i < palavra.length(); i++) {
			indice = -1;
			while (indice == -1) {
				if (palavra.charAt(i) == alfabeto.charAt(x)) {
					indice = alfabeto.indexOf(alfabeto.charAt(x));
					x = 0;
				} else {
					x = x + 1;
				}
			}

			caracter = palavra.charAt(i);
			caracter = alfabeto.charAt((indice + senha) % 26);
			palavracorreta += caracter;
		}
		t.close();
		return palavracorreta;
	}

	String decifrarCesar(String palavra, int senha) {

		char caracter;
		int indice = -1;
		int x = 0;
		String palavracorreta = "";
		senha = 26 - (senha % 26);

		for (int i = 0; i < palavra.length(); i++) {
			indice = -1;
			while (indice == -1) {
				if (palavra.charAt(i) == alfabeto.charAt(x)) {
					indice = alfabeto.indexOf(alfabeto.charAt(x));
					x = 0;
				} else {
					x = x + 1;
				}
			}

			caracter = palavra.charAt(i);
			caracter = alfabeto.charAt((indice + senha) % 26);
			palavracorreta += caracter;
		}
		t.close();
		return palavracorreta;

	}

}
