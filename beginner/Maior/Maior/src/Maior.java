/* Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da 
mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (a + b + abs * (a-b)) / 2;

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

Exemplos de Entrada	
7 14 106

Exemplos de Saída
106 eh o maior*/

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) throws Exception {

        int a, b, c, maiorAB, maiorFinal;
        
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        maiorAB = (a + b + Math.abs(a-b)) / 2;
        /* abs(a - b): Esta função abs retorna o valor absoluto da diferença entre a e b.
        O valor absoluto é a distância do número em relação ao zero, sem considerar o sinal. 
        Por exemplo, abs(5 - 3) é 2 e abs(3 - 5) também é 2*/
        maiorFinal = (maiorAB + c + Math.abs(maiorAB-c)) / 2;//repeti a formula usando o resultado anterior e repetindo para, o valor C restante


        System.out.println(maiorFinal + " eh o maior");

        scanner.close();
    }   
}
