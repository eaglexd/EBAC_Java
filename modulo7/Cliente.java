package modulo7;
//Author: Adler Marques
public class Cliente {
	
	//DECLARANDO VARIAVEIS
	private int codigo;
	private String nome;
	private String endereco;
	
	// CRIA��O DOS GETTERS AND SETTERS
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
	
	//CADASTRAR ENDERE�O
	
	public void cadastrarEndereco(String endereco) {
		setEndereco(endereco);
				
	}
	
	//IMPRIMIR ENDERE�O
	
	public void imprimirEndereco() {
		System.out.println(this.endereco);
	}
	
	
	
	
	
		
	

}
