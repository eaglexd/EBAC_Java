package modulo7;
/**
 * 
 * @author Waldler
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		ExercicioMod7 exercicio = new ExercicioMod7();
		
		cliente.cadastrarEndereco("Rua Albino, 1");
		cliente.setCodigo(1);
		
		System.out.println(cliente.getCodigo());
		cliente.imprimirEndereco();
		
		exercicio.cadastrarMarca("Coca-Cola");
		exercicio.imprimirMarca();
		


	}

}
