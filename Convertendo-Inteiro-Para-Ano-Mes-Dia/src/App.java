import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int ano;
        int mes;
        int dia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para converter em Ano(s), Mês(es) e dia(s)");
        int numero = sc.nextInt();

        ano = numero/365;
        int restoAno = numero%365;
        mes = restoAno/30;
        int restoMes = restoAno%30;
        dia = restoMes%30;

        System.out.println("Os " + numero + " dias convertidos:");
        System.out.println(ano + " ano(s), " + mes + " mês(s) e " + dia + " dia(s)");


        sc.close();
    }
}
