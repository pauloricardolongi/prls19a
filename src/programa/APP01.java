package programa;

import java.util.Scanner;

import servicos.PrintServico;

public class APP01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		
		PrintServico<String> ps = new PrintServico<>();
		
		System.out.print("Quantos valore vai digitar");
		int n= sc.nextInt();
		
		
				
		for(int i=0; i < n; i++) {
		String  valor= sc.next();
            ps.addValor(valor);
		}
		ps.print();
		String x=  ps.primeiro();
		System.out.println(" Primeiro: "+ x);
	    
		 sc.close();
	}
	

}
