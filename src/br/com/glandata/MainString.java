package br.com.glandata;

public class MainString {

	public static void main(String[] args) {

		String textoDinamico = "Olá Camila \n";
		String momentoDia = "tarde";

		if (momentoDia.equals("manha")) {
			textoDinamico = textoDinamico + "Bom dia! ";

		} else if (momentoDia.equals("tarde")) {
			textoDinamico = textoDinamico + "Boa tarde! ";

		} else {
			textoDinamico = textoDinamico + "Boa noite! ";
		}

		textoDinamico = textoDinamico + "\nBem vinda!"; // Cria cópia da variável atualizada em memória

		System.out.println(textoDinamico);
	}

}
