package Classes;

public class Veterinario {
	private String nome;
	private float salario;
	Endereco endereco = new Endereco();
	private int quantidadeAnimais = 0;
	private Animal[] Animais = new Animal[quantidadeAnimais];
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public Animal[] getAnimais() {
		return Animais;
	}
	public void setAnimais(Animal[] animais) {
		quantidadeAnimais++;
		
	}
	public void adiciona(Animal animal) {
		Animais[quantidadeAnimais] = animal;
		quantidadeAnimais++;
	}
	public int getQuantidadeAnimais() {
		return quantidadeAnimais;
	}
	public void setQuantidadeAnimais(int quantidadeAnimais) {
		this.quantidadeAnimais = quantidadeAnimais;
	}
	
}
