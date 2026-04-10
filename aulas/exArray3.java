import java.util.Scanner;
import java.util.Arrays;

public class exArray3{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        String[] cores = new String[]{"Amarelo", "verde", "rosa"};
        System.out.println(Arrays.toString(cores));

        System.out.println("Digite uma nova cor para substituir a primeira: "); 
        String novaCor = teclado.next();

        cores[0] = novaCor;
        System.out.println("Cores atualizadas: " + Arrays.toString(cores));

        teclado.close();
    }
}