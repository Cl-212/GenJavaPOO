package POO;

public class Cliente {

	private String nome;
	private int idade;
	private int numeroConta;
	private int idadeConta;
	private int contato;

	public Cliente(String nome, int idade, int numeroConta, int idadeConta, int contato) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.numeroConta = numeroConta;
		this.idadeConta = idadeConta;
		this.contato = contato;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getIdadeConta() {
		return idadeConta;
	}

	public void setIdadeConta(int idadeConta) {
		this.idadeConta = idadeConta;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}

	public void imprimirInfoCliente() {
		System.out.println("\nO cliente " + nome + " tem " + idade + " anos e possui uma conta de numero: "
				+ numeroConta + " a " + idadeConta + " anos" + ".\nTelefone para contato: " + contato);
	}
}
