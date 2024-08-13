package controller;

public class MultiplicacaoController {

	public MultiplicacaoController() {
		super();
	}
	
	public int Multiplicacao(int A, int B) {
		
		if (B == 0) {
			return 0;
		} else if (B == 1) {
			return A;
		} else {
			return A + Multiplicacao(A, B - 1);
		}
	}
}
