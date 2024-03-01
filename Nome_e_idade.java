package primeiro_projeto;
import java.util.Scanner;
public class Nome_e_idade {

	public static void main(String[] args) {
		//Variáveis
		String nome,idade,conj;
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println("Informe o seu nome:") ;
		nome = ler.nextLine();
		
		System.out.println("Informe a sua idade") ;
		idade = ler.next();
		
		//Processamento
		
		//Saída
		System.out.println("Seu nome é " + nome + " e você tem " +idade + " anos ");

		// TODO Auto-generated method stub

	}

}
