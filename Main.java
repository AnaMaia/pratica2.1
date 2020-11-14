package Interface;
import java.util.Scanner;
import Interface.SistemaPetShop;


public class Main {
	
	private static SistemaPetShop pet = new SistemaPetShop();
	private static Scanner leitor = new Scanner(System.in);
	
	public static void main(String [] args) {
		int op = -1;
		
		while(op != 0){
			System.out.println("Escolha uma op��o");
			System.out.println("0 - sair");
			System.out.println("1 - cadastrar veterin�rio");
			System.out.println("2 - mostrar veterin�rio");
			System.out.println("3 - cadastrar endere�o do veterin�rio");
			System.out.println("4 - cadastrar animal");
			System.out.println("5 - mostrar animais");
			System.out.println("6 - cadastrar dono");
			System.out.println("7 - cadastrar endere�o dono");
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
				pet.CadastrarEndere�oVeterinario();
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
				pet.CadastrarEndere�oDono();
			default:
				System.out.println("valor inv�lido");
			}
			
		}
		
		
	}
	
	


}
