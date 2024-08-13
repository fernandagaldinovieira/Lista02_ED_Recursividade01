package view;

import javax.swing.JOptionPane;

import controller.MultiplicacaoController;

public class Principal {

	public static void main(String[] args) {

		MultiplicacaoController multiplicacaoController = new MultiplicacaoController();
		
		int A, B;
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int resultado = multiplicacaoController.Multiplicacao(A, B);
		
		System.out.println("A multiplicação de " + A + " e " + B + " é igual a: " + resultado);
	}

}
