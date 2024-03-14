package targetSistemas;

import java.util.Scanner;
import targetSistemas.Fibonacci;

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
        
        sc.close();
        
    }
	    
}
