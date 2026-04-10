import java.util.Scanner;

public class BEE1177{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int T = teclado.nextInt();    

        int[] N = new int[1000];
        int aux = 0;

        for(int i = 0; i < N.length; i++){
            N[i] = aux;
            aux++;
            System.out.println("N[" + i + "] = " + N[i]);

            if(aux == T){
                aux = 0;
                
            }
        }

        teclado.close();

    }
}