import java.util.Scanner;

public class BEE1101{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in); 

        while(true){
            int M = teclado.nextInt(); 
            int N = teclado.nextInt();

            if(N <= 0 || M <= 0){
                break;
            }

             int maior, menor;
        

        if(N < M){
            maior = M; 
            menor = N;
        }
        else{
            maior = N; 
            menor = M;
        }
    
        int soma = 0; 

        for(int contador = menor; contador <= maior; contador++){ 
            System.out.print(contador + " "); 
            soma = soma + contador;
        }
        System.out.println("Sum=" + soma);
        }

        teclado.close();

    }
}