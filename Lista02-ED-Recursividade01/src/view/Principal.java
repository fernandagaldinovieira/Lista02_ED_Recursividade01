package view;

import javax.swing.JOptionPane;

import controller.MultiplicacaoController;

public class Principal {

	public static void main(String[] args) {

		MultiplicacaoController multiplicacaoController = new MultiplicacaoController();
		
		int A, B;
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int resultado = multiplicacaoController.Multiplicacao(A, B);
		
		System.out.println("A multiplica��o de " + A + " e " + B + " � igual a: " + resultado);
	}

}
