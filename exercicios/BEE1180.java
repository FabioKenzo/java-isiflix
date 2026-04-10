import java.util.Scanner;

public class BEE1180{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in); 

        int N = teclado.nextInt(); 

        int[] X = new int[N]; 

        for(int i = 0; i < N; i++){
            X[i] = teclado.nextInt();
        }

        int menor = X[0]; 
        int posicao = 0; 

        for(int i = 1; i < N; i++){
            if(X[i] < menor){
                menor = X[i]; 
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);

        teclado.close();
    }
}