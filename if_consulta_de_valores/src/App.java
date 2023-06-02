import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //ler 4 valores inteiros, se B for maior que C e se D for maior que A, e a soma de C com D for maior que a soma de A com B e se D e C forem positivos.

        //Saída: valores aceitos e valores não aceitos

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;

        System.out.println("Digite o valor de A:");
        a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        b = sc.nextInt();
        System.out.println("Digite o valor de C:");
        c = sc.nextInt();
        System.out.println("Digite o valor de D:");
        d = sc.nextInt();

        if (b > c && d > a) {
            if(c + d > a + b){
                if (d > 0 && c > 0) {
                    System.out.println("Valores aceitos");
                }
                
            }
            
        } else {
            System.out.println("Valores não aceitos");
        }

        sc.close();
    }
}
