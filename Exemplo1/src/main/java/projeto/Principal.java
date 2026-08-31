package projeto;

public class Principal {

	public static void main(String[] args) {
		
		Banco b3 = new Banco ("Kennedy", "1111", 15);
		
		System.out.println(b3.getNome());
		b3.setNome("Isabelle");
		System.out.println(b3.getNome());
		
	}

}
