import java.util.Scanner;

public class Lanche {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int codigo, quantidade;
    double total, valor;

    codigo = scan.nextInt();
    quantidade = scan.nextInt();

    valor = 0;

    switch (codigo) {
      case 1:
        valor = 4.00;
        break;
      case 2:
        valor = 4.50;
        break;
      case 3:
        valor = 5.00;
        break;
      case 4:
        valor = 2.00;
        break;
      case 5:
        valor = 1.50;
        break;
    }

    total = quantidade * valor;

    System.out.printf("Total: R$ %.2f\n", total);
    scan.close();

  }
}