package modulo5;
import java.util.Scanner;
// Author: Adler Felippe Marques
// Date: 20/03/2022
public class exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por Favor, Digite seu Nome: ");
		String name = entrada.nextLine();
		System.out.println("Olá "+name+" Bem Vindo!!!");
		
		entrada.close();
	}

}
