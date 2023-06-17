import java.util.Scanner;

/**
 * Desafio_DDD
 */
public class Desafio_DDD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do DDD para sua ligação:");
        int ddd = sc.nextInt();

        switch (ddd) {
            case 81:
                System.out.println("Pernambuco");
                break;
        
            case 71:
                System.out.println("Bahia");
                break;
        
            case 51:
                System.out.println("Brasília");
                break;
        
            case 11:
                System.out.println("São Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 61:
                System.out.println("Rio Grande do Sul");
                break;
            
            default:
                System.out.println("DDD não cadastrado");
                break;
        }


        

        sc.close();


    }
}