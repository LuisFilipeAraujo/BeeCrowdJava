/*Gasto de Combustível

Timelimit: 1
Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, 
ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. 
Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). 
Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. 

Mostre o valor com 3 casas decimais após o ponto.

Entrada
O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o 
segundo é a velocidade média durante a mesma (em km/h).

Saída
Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal

Exemplo de Entrada:10, 85	Exemplo de Saída:70.833

 */
import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int tempoGasto, velocidadeMedia; //tempo em horas e a velocidadeMedia é em km/h
        double distanciaPercorrida, litrosNecessarios;

        tempoGasto = teclado.nextInt();
        velocidadeMedia = teclado.nextInt();

        distanciaPercorrida = tempoGasto * velocidadeMedia;

        litrosNecessarios = distanciaPercorrida / 12.0; //12 pois segundo o enunciado o carro faz isso por litro
        
        System.out.printf("%.3f\n", litrosNecessarios);

        teclado.close();
    }
}
