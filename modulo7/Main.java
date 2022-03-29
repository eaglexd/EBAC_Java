package modulo7;
// Author: Adler Marques
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.cadastrarEndereco("Rua Albino, 1");
		cliente.setCodigo(1);
		
		System.out.println(cliente.getCodigo());
		cliente.imprimirEndereco();


	}

}
