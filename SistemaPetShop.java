package Interface;
import java.util.Scanner;
import Classes.Animal;
import Classes.Dono;
import Classes.Endereco;
import Classes.Veterinario;

public class SistemaPetShop {
	private Veterinario Veterinarios[] = new Veterinario[50];
	private int quantidadeVeterinarios=0;
	Scanner leitor = new Scanner (System.in);

	//MÉTODOS 
	
	public void CadastrarVeterinario() { //certo
		
		System.out.println("Digite o nome do veterinario: ");
		String nome = leitor.nextLine();
		Veterinarios[quantidadeVeterinarios].setNome(nome);
	
		System.out.println ("Insira o salario do Veterinario");
		float salario = leitor.nextFloat();
		Veterinarios[quantidadeVeterinarios].setSalario(salario);

		quantidadeVeterinarios++;
	}
	
	public void MostrarVeterinarios(){ //certo
		for(int i=0; i< quantidadeVeterinarios; i++) {
			System.out.println("Codigo "+i);
			System.out.println(Veterinarios[i].toString());
		}
		
	}
	public Veterinario escolherVeterinario(){ //certo
		System.out.println("Escolha um veterinario: ");
		MostrarVeterinarios();
		
		int escolha = leitor.nextInt();
		
		if(escolha <= quantidadeVeterinarios) {
			return Veterinarios[escolha];
		}else {
			System.out.println("Numero inválido");
			return null;
		}
		
		
	}

		
	public void CadastrarEndereçoVeterinario(){
		MostrarVeterinarios();
		escolherVeterinario();
		
	}
	public void CadastrarEndereçoDono(){
		
		
	}
	
	public Animal CadastrarAnimal() { //certo
		MostrarVeterinarios();
		Veterinario aux = escolherVeterinario();
		
		Animal a = new Animal();
		
		
		System.out.println("Digite o nome do animal: ");
		String nome = leitor.nextLine();
		a.setNome(nome);
		
		System.out.println("Digite a especie do animal: ");
		String especie = leitor.nextLine();
		a.setEspecie(especie);
		
		System.out.println("Digite a desc do animal: ");
		String desc = leitor.nextLine();
		a.setDescricao(desc);
		
		aux.adiciona(a); 
		
		return a;
			
	}
	
	
	public void MostrarAnimais(){ //certo
		MostrarVeterinarios();
		Veterinario aux = escolherVeterinario();
		for(int i=0;i<aux.getQuantidadeAnimais(); i++) {
			System.out.println("Codigo "+i);
			System.out.println(aux.getAnimais().toString());
		}
		
	}

	public void CadastrarDono(){
		Dono d = new Dono();
		
		System.out.println("Digite o nome do dono: ");
		String nome = leitor.nextLine();
		d.setNome(nome);
		
		cadastrarEndereco();
		
		System.out.println("Digite o cpf do dono: ");
		int cpf = leitor.nextInt();
		d.setCpf(cpf);
		
	}
	
	public void cadastrarEndereco() {
		Endereco e = new Endereco();
		
		System.out.println("digite o nome da rua: ");
		String rua = leitor.nextLine();
		e.setRua(rua);
		
		System.out.println("digite o num da casa: ");
		int num = leitor.nextInt();
		e.setNumero(num);
		
		System.out.println("digite o bairro: ");
		String bairro = leitor.nextLine();
		e.setBairro(bairro);
		
		System.out.println("digite a cidade: ");
		String cidade = leitor.nextLine();
		e.setCidade(cidade);
		
		System.out.println("digite o estado: ");
		String estado = leitor.nextLine();
		e.setEstado(estado);
		
		System.out.println("digite a cidade: ");
		int cep = leitor.nextInt();
		e.setCep(cep);
		}
	
	
	
	

}
