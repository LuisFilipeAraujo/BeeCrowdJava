/*Salário com Bônus

Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês 
(em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão 
(double) com duas casas decimais, representando o salário fixo do vendedor e montante total das 
vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido. */

import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args){

        String nome;
        double salario;
        double valorTotalVendas;//total em dinheiro
        double salarioFinal;//salario com adição dos 15% por vendas
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = teclado.nextLine();

        System.out.print("Salario em reais: R$ ");
        salario = teclado.nextDouble();

        System.out.print("Total de vendas efetuadas em reais: R$ ");
        valorTotalVendas = teclado.nextDouble();

        salarioFinal = salario + (valorTotalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f", salarioFinal);

        teclado.close();
    }
}
