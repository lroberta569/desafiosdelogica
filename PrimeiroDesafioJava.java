import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeiroDesafioJava {
	
	public static void main(String[] args) throws Exception {
		
		Scanner ler = new Scanner(System.in);        
		
	    int n;
	    
	    System.out.println("Informe o tamanho do lista:");
	    n = ler.nextInt();
	               
	    ArrayList<Integer> entrada = new ArrayList<Integer>();
	    ArrayList<Integer> numerosPares = new ArrayList<Integer>();
	    ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
	
	    System.out.println("Informe os numeros da lista:");
	    for (int i = 0; i < n; i++) {
	        ler = new Scanner(System.in);
	        entrada.add(ler.nextInt());
	        
	        if (entrada.get(i) % 2 == 0) { 
	        	numerosPares.add(entrada.get(i));
	        } else {
	        	numerosImpares.add(entrada.get(i));
	        }       
	    }
	    
	    Collections.sort(numerosPares);    
	    Collections.sort(numerosImpares);        
	    Collections.reverse(numerosImpares);
	
	    System.out.println("Numeros pares:");
	    for (int par : numerosPares) {
	        System.out.println(par);
	    }
	
	    System.out.println("Numeros impares:");
	    for (int impar : numerosImpares) {
	        System.out.println(impar);
	    }
	    
	    ler.close();
	}
}


