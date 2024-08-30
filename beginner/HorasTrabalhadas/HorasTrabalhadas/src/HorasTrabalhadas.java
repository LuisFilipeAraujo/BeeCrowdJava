import java.util.Scanner;

public class HorasTrabalhadas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int workerNumber;
        int workedHours;
        double amoutPerHour;
        double salary;

        System.out.print("Qual o numero do funcionario: ");
        workerNumber = scan.nextInt();

        System.out.print("Numero de horas trabalhadas: ");
        workedHours = scan.nextInt();

        System.out.print("Valor em reais pago por hora: ");
        amoutPerHour = scan.nextDouble();

        salary = (workedHours * amoutPerHour);

        System.out.println("NUMBER = " + workerNumber);
        System.out.printf("SALARY = R$ %.2f\n", salary);

        scan.close();
    }
}
