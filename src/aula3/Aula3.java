package aula3;

public class Aula3 {

	public static void main(String[] args) {
		
		String nome = "Ricardo";
		
		//operador l�gico "or" === ||
		if (nome.equals("Ricardo ") || nome.equals("Marina")) {
			
			System.out.println("O nome � um dos dois");
			
		} else if (nome.equals("Marina")){
			
			System.out.println("O nome � Marina");
			
		} else if (nome.equals("Fabiane")) {
			
			System.out.println("O nome � Fabiane");
			
		} else {
			
			System.out.println("Ningu�m");
			
		}
		
	}

}
