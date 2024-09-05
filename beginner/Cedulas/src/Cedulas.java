/*Cédulas
Leia um valor inteiro. A seguir, calcule o menor número
 de notas possíveis (cédulas) no qual o valor pode ser 
 decomposto. As notas consideradas são de 100, 50, 20, 
 10, 5, 2 e 1. A seguir mostre o valor lido e a relação
de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro 
N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a 
quantidade mínima de notas de cada tipo necessárias, 
conforme o exemplo fornecido. Não esqueça de imprimir 
o fim de linha após cada linha, caso contrário seu 
programa apresentará a mensagem: “Presentation Error”.

Exemplo de Entrada	
576

Exemplo de Saída
576
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00*/

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        int cedulas100, cedulas50, cedulas20, cedulas10, cedulas5, cedulas2, cedulas1;
        int resto100, resto50, resto20, resto10, resto5, resto2;
        
        
        cedulas100 = entrada/100;
        resto100 = entrada % 100;
        
        cedulas50 = resto100/50;
        resto50 = resto100 % 50;

        cedulas20 = resto50/20;
        resto20 = resto50 % 20;

        cedulas10 = resto20/10;
        resto10 = resto20 % 10;

        cedulas5 = resto10/5;
        resto5 = resto10 % 5;

        cedulas2 = resto5/2;
        resto2 = resto5 % 2;

        cedulas1 = resto2/1;
        
        System.out.println(entrada);
        System.out.println(cedulas100 + " nota(s) de R$ 100,00");
        System.out.println(cedulas50 + " nota(s) de R$ 50,00");
        System.out.println(cedulas20 + " nota(s) de R$ 20,00");
        System.out.println(cedulas10 + " nota(s) de R$ 10,00");
        System.out.println(cedulas5 + " nota(s) de R$ 5,00");
        System.out.println(cedulas2 + " nota(s) de R$ 2,00");
        System.out.println(cedulas1 + " nota(s) de R$ 1,00");

        scan.close();
    }
}
