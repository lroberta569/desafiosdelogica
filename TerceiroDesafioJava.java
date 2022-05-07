import java.util.Scanner;

public class TerceiroDesafioJava {

	public static void main(String[] args) {
		
		  Scanner ler = new Scanner(System.in);
		  
	        int i,aux,cont = 0;
	        
	        System.out.println("Digite o tamanho da lista: ");
	        int n = ler.nextInt();
	        
	        System.out.println("Digite o numero alvo: ");
	        int k = ler.nextInt();
	        
	        int numeros[] = new int[n];
	        
	        for(i=0;i<n;i++){
	        	numeros[i] = ler.nextInt();
	        }
	        for (i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (numeros[i] < numeros[j]) {
	                    aux = numeros[i];
	                    numeros[i] = numeros[j];
	                    numeros[j] = aux;
	                }
	            }
	        }
	        for (i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (numeros[i] - numeros[j] == k) {
	                    cont++;
	                }
	            }
	        }
	        System.out.printf("%d\n",cont);
	}
}


