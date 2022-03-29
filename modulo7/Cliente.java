package modulo7;
/**
 * 
 * @author Adler Felippe Marques
 *
 */
public class Cliente {

	/**
	 * Declaração das variáveis
	 */
	private int codigo;
	private String nome;
	private String endereco;
	
	/**
	 * Criação dos Getters and Setters
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/**
	 * Metodo para cadastrar o endereço do cliente
	 * @param endereco
	 */
	
	public void cadastrarEndereco(String endereco) {
		setEndereco(endereco);
				
	}
	
	/**
	 * Método apenas para imprimir o endereço
	 */
	
	public void imprimirEndereco() {
		System.out.println(this.endereco);
	}
	
	
	
	
	
		
	

}
