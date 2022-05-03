package List_4;
import java.util.Scanner;
public class List_4c {

	public static void main(String[] args) {
		
				
		int opcao, n, sentenca=0;
		Scanner ler  = new Scanner(System.in);
		String Frase;
		System.out.println("Digite uma frase: ");
		Frase=ler.nextLine();
		
		do {
		//Frase=Frase.split(",");
			
			System.out.println("(1) Número de sentenças (ponto final, exclamação e interrogação) ");
			System.out.println("(2) Número de Palavras ");
			System.out.println("(3) Número de Vogais ");
			System.out.println("(4) Número de Consoantes ");
			System.out.println("(5) Sair ");
			opcao=ler.nextInt();
		
			switch(opcao) 
				{
				case 1:
					n = Frase.length(); //tamanho da string
					for (int i=0; i<n; i++) {
				if((Frase.charAt(i) == '.') || (Frase.charAt(i) == '!') || (Frase.charAt(i) == '?')) 
					sentenca++;
					}
				System.out.println("Numero de sentença é: "+sentenca);
				
				break;
					
				case 2:
					int var = Frase.split(" ", -1).length - 1;
					System.out.println((var+1) + " palavras");
				break;
			
				case 3:
					n = Frase.length(); //tamanho da string
					for (int i=0; i<n; i++) {
				if((Frase.charAt(i) == 'a') || (Frase.charAt(i) == 'e') || (Frase.charAt(i) == 'i') || (Frase.charAt(i) == 'o') || (Frase.charAt(i) == 'u')) 
					sentenca++;
					}
				System.out.println("Numero de vogais é: "+sentenca);
				break;
			
				case 4:
				break;
			
				default:
					System.out.print("Finalizado");
					break;
				
			}		
		}while(opcao!=5);
	}
}
