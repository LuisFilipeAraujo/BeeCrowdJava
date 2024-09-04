/* Dois carros (X e Y) partem em uma mesma direção. O carro X 
sai com velocidade constante de 60 Km/h e o carro Y sai 
com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se 
distanciar 30 quilômetros do carro X, ou seja, consegue se 
afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo
leva (em minutos) para o carro Y tomar essa distância do 
outro carro.

Entrada
O arquivo de entrada contém um número inteiro.

Saída
Imprima o tempo necessário seguido da mensagem "minutos".

Exemplo de Entrada	
30

Exemplo de Saída
60 minutos*/
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int tempoNecessario; //tempo em minutos
        int distancia;
        distancia = scan.nextInt();
        
        tempoNecessario = distancia*2;

        System.out.print(tempoNecessario + " minutos");
        scan.close();
    }
}
