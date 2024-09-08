/*Idade em Dias

Leia um valor inteiro correspondente à idade de uma 
pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere 
todo ano com 365 dias e todo mês com 30 dias. Nos 
casos de teste nunca haverá uma situação que permite 
12 meses e alguns dias, como 360, 363 ou 364. Este é 
apenas um exercício com objetivo de testar raciocínio 
matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.

Exemplo de Entrada	
400

Exemplo de Saída
1 ano(s)
1 mes(es)
5 dia(s) */
import java.util.Scanner;

public class IdadeEmDias1020 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int entrada, anos, meses, dias;

        entrada = scan.nextInt();
        anos = entrada/365;
        meses = (entrada%365)/30;
        dias = (entrada%365)%30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        scan.close();
    }
}
