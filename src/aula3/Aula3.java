package aula3;

public class Aula3 {

	public static void main(String[] args) {
		
		String nome = "Ricardo";
		
		//operador lógico "or" === ||
		if (nome.equals("Ricardo ") || nome.equals("Marina")) {
			
			System.out.println("O nome é um dos dois");
			
		} else if (nome.equals("Marina")){
			
			System.out.println("O nome é Marina");
			
		} else if (nome.equals("Fabiane")) {
			
			System.out.println("O nome é Fabiane");
			
		} else {
			
			System.out.println("Ninguém");
			
		}
		
	}

}
