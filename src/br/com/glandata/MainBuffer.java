package br.com.glandata;

public class MainBuffer {

	public static void main(String[] args) {

		StringBuffer textoDinamico = new StringBuffer();
		textoDinamico.append("Ol� Camila \n");

		String momentoDia = "noite";

		if (momentoDia.equals("manha")) {
			textoDinamico.append("Bom dia! ");

		} else if (momentoDia.equals("tarde")) {
			textoDinamico.append("Boa tarde! ");

		} else {
			textoDinamico.append("Boa noite! ");
		}

		textoDinamico.append("\nBem vinda!"); //Atualiza a mesma vari�vel em mem�ria

		System.out.println(textoDinamico);

	}

}
