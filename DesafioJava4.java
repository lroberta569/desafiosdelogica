import java.util.Scanner;

public class DesafioJava4 {

	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
		 
		 System.out.println("Digite a quantidade de frases:");
	        int N = leitor.nextInt();
	        
	        for (int i = 0; i < N; i++) {
	        	System.out.println("Digite a frase: ");
	            String frase = readLine(leitor);
	            StringBuilder frase1 = new StringBuilder(frase.substring(0, frase.length() / 2));
	            StringBuilder frase2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
	            frase1.reverse();
	            frase2.reverse();
	            System.out.println(frase1.toString() + frase2.toString());
	        }
	    }

	    public static String readLine(Scanner leitor) {
	        String frase = leitor.nextLine();
	        while (frase.isEmpty())
	            frase = leitor.nextLine();
	        return frase;
	    }

	}


