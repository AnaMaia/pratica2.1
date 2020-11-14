package Interface;
import java.util.Scanner;
import Interface.SistemaPetShop;


public class Main {
	
	private static SistemaPetShop pet = new SistemaPetShop();
	private static Scanner leitor = new Scanner(System.in);
	
	public static void main(String [] args) {
		int op = -1;
		
		while(op != 0){
			System.out.println("Escolha uma opção");
			System.out.println("0 - sair");
			System.out.println("1 - cadastrar veterinário");
			System.out.println("2 - mostrar veterinário");
			System.out.println("3 - cadastrar endereço do veterinário");
			System.out.println("4 - cadastrar animal");
			System.out.println("5 - mostrar animais");
			System.out.println("6 - cadastrar dono");
			System.out.println("7 - cadastrar endereço dono");
			op = leitor.nextInt();
			
			switch(op) {
			case 0:
				break;
			case 1:
				pet.CadastrarVeterinario();
				break;
			case 2:
				pet.MostrarVeterinarios();
				break;
			case 3:
				pet.CadastrarEndereçoVeterinario();
				break;
			case 4:
				pet.CadastrarAnimal();
				break;
			case 5:
				pet.MostrarAnimais();
				break;
			case 6:
				pet.CadastrarDono();
				break;
			case 7:
				pet.CadastrarEndereçoDono();
			default:
				System.out.println("valor inválido");
			}
			
		}
		
		
	}
	
	


}
