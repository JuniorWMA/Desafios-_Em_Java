import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Calcular o consumo médio de um automóvel
        
        //entrada: distância total(km) e o total de combustível gasto

        //saída: valor do consumo médio com duas casas após a vírgula.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double distancia;
        double litros;
        double resultado;

        System.out.println("Digite a distância percorrida em km: ");
        distancia = sc.nextInt();
        System.out.println("Digite a quantidade de litros de combustível: ");
        litros = sc.nextDouble();

        resultado = distancia/litros;

        System.out.printf("Seu carro fez %.2f km/l", resultado);
        

        sc.close();


    }
}
