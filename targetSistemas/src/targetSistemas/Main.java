package targetSistemas;

import java.util.Scanner;
import targetSistemas.Fibonacci;
import targetSistemas.InvertString;

public class Main {
    
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int number = sc.nextInt();
        
        boolean isFibonacci = Fibonacci.isFibonacci(number);
        
        if (isFibonacci) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
        
        System.out.print("Agora, escreva uma palavra para fazer a inversão da mesma: ");
        String word = sc.next();
        
        String newWord = InvertString.inverterString(word);
        
        System.out.println(word + " => " + newWord);
        
        sc.close();
        
    }
	    
}
