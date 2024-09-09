/*beecrowd | 1044
Múltiplos

Leia 2 valores inteiros (A e B). Após, o programa 
deve mostrar uma mensagem "Sao Multiplos" ou 
"Nao sao Multiplos", indicando se os valores lidos 
são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme 
descrito acima.

Exemplo de Entrada	
6 24
6 25 

Exemplo de Saída
Sao Multiplos
Nao sao Multiplos */
import java.util.Scanner;

public class Multiplos1044 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int A,B;

        A = teclado.nextInt();
        B = teclado.nextInt();

        if((A%B)==0 || (B%A)==0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }

        teclado.close();
    }
}
