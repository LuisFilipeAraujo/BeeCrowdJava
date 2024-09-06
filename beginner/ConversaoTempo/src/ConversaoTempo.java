/* Conversão de Tempo

Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada
556

Exemplo de Saída
0:9:16*/

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int N, horas, minutos, segundos;

        N = ler.nextInt();
    
        horas = N / 3600;
        minutos = (N % 3600) / 60;
        segundos = N % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);

        ler.close();
    }
}
