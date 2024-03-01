package primeiro_projeto;
import java.util.Scanner;
public class atividade_2 {

	public static void main(String[] args) {
		//Variáveis
		Double horatrab, valorhora,salbruto,salliquido,inss;
		//Instanciar classe  Scanner 
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados 
		System.out.println("informe suas horas trabalhadas:") ;
		horatrab = ler.nextDouble();
		
		System.out.println("informe o seu valo hora:");
		valorhora =ler.nextDouble();
	
		
		//Processamento 
		salbruto = horatrab*valorhora;
		inss = salbruto * 0.12;
		salliquido = salbruto-inss;
		
		System.out.println("O seu salario bruto é de: "+salbruto);
		System.out.println("O valor do inss é de: "+inss);
		System.out.println("O seu salario liquido é de: "+salliquido);
		ler.close();
		// TODO Auto-generated method stub

	}

}
