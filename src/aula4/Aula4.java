package aula4;

import javax.swing.JOptionPane;

public class Aula4 {

	public static void main(String[] args) {
		
		String digito1 = JOptionPane.showInputDialog(null, "Informe o primeiro n�mero");
		String operacao = JOptionPane.showInputDialog(null, "Informe a opera��o (- , + , x, /");
		String digito2 = JOptionPane.showInputDialog(null, "Informe o segundo n�mero");
		
		Integer resultado = 0;
		
		if(operacao.equals("-")) {
			resultado = Integer.parseInt(digito1) - Integer.parseInt(digito2);
		} else if ( operacao.equals("+")) {
			resultado = Integer.parseInt(digito1) + Integer.parseInt(digito2);
		} else if ( operacao.equals("x")) {
			resultado = Integer.parseInt(digito1) * Integer.parseInt(digito2);
		}else if(operacao.equals("/")) {
			resultado = Integer.parseInt(digito1) / Integer.parseInt(digito2);
		}
			
		JOptionPane.showMessageDialog(null, resultado);

	}

}
