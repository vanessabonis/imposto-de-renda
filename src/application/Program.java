package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de Contribuintes > ");
		int n = sc.nextInt();
		
		//lista-de-contribuintes
		List<Contribuinte> list = new ArrayList<Contribuinte>();
		for(int i=1; i<=n; i++) {
			System.out.println("Contribuinte # " + i);
			System.out.print("PF ou PJ (f/j) > ");
			//charArt(0) pega primeira letra
			char type = sc.next().charAt(0);
			System.out.println();
			System.out.print("Nome > ");
			String nome = sc.nextLine();
			System.out.print("Renda Anual > ");
			Double rendaAnual = sc.nextDouble();
			
			System.out.println();
			if(type == 'f') {
				System.out.print("GASTOS COM SAÚDE > ");
				Double gastos = sc.nextDouble();
				//instanciar-pessoa-fisica
				PessoaFisica x = new PessoaFisica(nome, rendaAnual, gastos);
				//add na lista - pode juntar
				list.add(x);
			}else {
				System.out.print("NUMERO DE FUNCIONARIOS > ");
				Integer numFuncionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}//if-else	
		}//for
		
		System.out.println();
		System.out.println("IMPOSTO PAGO: ");
		
		//for-each pra printar a lista
		for(Contribuinte c : list) {
			System.out.println(c.getNome() + ": $ " + String.format("%.2f", c.impostoDeRenda()));
		}//for-each

		sc.close();
	}//main
}//class-program
