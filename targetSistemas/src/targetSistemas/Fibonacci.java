package targetSistemas;

public class Fibonacci {
	
	public static boolean isFibonacci(int n) {
        // Primeiros termos do Fibonacci
        int a = 0;
        int b = 1;
        
        // Verifica, inicialmente, se o número é um dos primeiros termos da sequência.
        if (n == a || n == b) {
            return true;
        }
        
        // Calcula os números seguintes da sequência de Fibonacci até encontrar um número maior ou igual a n
        while (b < n) {
        	
            int temp = a + b;
            a = b;
            b = temp;
            
            // Se encontrarmos o número n, retorna verdadeiro
            if (b == n) {
                return true;
            }
        }
        
        //Se não encontrarmos o número n, retorna falso
        return false;
    }
	
}
