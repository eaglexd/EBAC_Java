package modulo7;
/**
 * Cria��o de uma classe para o Exercicio do M�dulo 7
 * Classe criada do objeto real: M�quina de vendas autom�ticas de refrigerante
 * Classe referente as latas
 * @author Adler Felippe Marques
 *
 */

public class ExercicioMod7 {
	/**
	 * Declaring vars
	 */
	private int quantidadeRecipiente;
	private String marca;
	private String nome;
	
	/**
	 * Getters and Setters creation
	 * 	 * @return
	 */
	public int getQuantidadeRecipiente() {
		return quantidadeRecipiente;
	}
	public void setQuantidadeRecipiente(int quantidadeRecipiente) {
		this.quantidadeRecipiente = quantidadeRecipiente;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Cadastrando a marca
	 * @param marca
	 */
	public void cadastrarMarca(String marca) {
		setMarca(marca);
				
	}
	
	public void imprimirMarca() {
		System.out.println(this.marca);
	}

}
