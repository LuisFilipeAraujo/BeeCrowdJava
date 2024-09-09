/* Sequencia IJ 1

Você deve fazer um programa que apresente a sequencia 
conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo

Exemplo de Entrada

Exemplo de Saída
I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0


while (i < 5) {
  System.out.println(i);
  i++;
}

*/

public class SequenciaIJ1095 {
  public static void main(String[] args) throws Exception {
    int I = 1;
    int J = 60;

    while (J>=0) {

      System.out.println("I=" + I + " J=" + J);
      I += 3;
      J -= 5;

    }

  }
}
