package modulo7;
/**
 * 
 * @author Adler Felippe Marques
 *
 */
public class Cliente {

	/**
	 * Declara��o das vari�veis
	 */
	private int codigo;
	private String nome;
	private String endereco;
	
	/**
	 * Cria��o dos Getters and Setters
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
	 * Metodo para cadastrar o endere�o do cliente
	 * @param endereco
	 */
	
	public void cadastrarEndereco(String endereco) {
		setEndereco(endereco);
				
	}
	
	/**
	 * M�todo apenas para imprimir o endere�o
	 */
	
	public void imprimirEndereco() {
		System.out.println(this.endereco);
	}
	
	
	
	
	
		
	

}
