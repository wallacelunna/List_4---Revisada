package List_4;
import java.util.Scanner;
public class List_4b {

	public static void main(String[] args) {
		
		Scanner Cc = new Scanner(System.in);
		
		String[] Chave = new String[10];
		
		int ContAzul=0, ContVermelho=0, ContVerde=0;
		
		for(int i=0;i<10;i++){
			
			System.out.println("\nQual a cor da chaves: " );
			Chave[i]=Cc.next();
		
			if(Chave[i].equals("Azul") || Chave[i].equals("azul")){
				System.out.println("Vá para a porta Azul.");
				ContAzul++;
			}
			else if(Chave[i].equals("Verde") || Chave[i].equals("verde")){
					System.out.println("Vá para a porta Verde.");
					ContVerde++;
			}
			else if(Chave[i].equals("Vermelha") || Chave[i].equals("vermelha") ){
					System.out.println("Vá para a porta Vermelha.");
					ContVermelho++;
			}
			
		}
		Cc.close();
		System.out.println(ContAzul + " pessoa possui a chave Azul\n"+  ContVerde + " pessoa possui a chave Verde\n" +  +ContVermelho + " pessoa  possui a chave Vermelha\n");
	}

}
