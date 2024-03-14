package targetSistemas;

public class InvertString {
	
	public static String inverterString(String str) {
        // Converte a string para um array de caracteres
        char[] characters = str.toCharArray();
        
        // Índices para início e fim do array
        int i = 0;
        int j = characters.length - 1;
        
        // Inverte os caracteres trocando de posição
        while (i < j) {
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
            i++;
            j--;
        }
        
        // Converte o array de caracteres de volta para uma string
        return new String(characters);
    }

}
