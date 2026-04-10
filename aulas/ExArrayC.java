 /*
 Crie um array de números inteiros (int) com 5 posições e peça para o usuário digitar 5 valores. 
 No final, o programa deve percorrer o array e dizer qual foi o maior número digitado.
Dica: Comece assumindo que o maior número é o que está na primeira posição (posicao[0]) e compare com os outros.

 */
import java.util.Scanner; 

public class ExArrayC{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        

        int[] valores = new int[5]; 

        for(int i = 0; i < valores.length; i++){
            valores[i] = teclado.nextInt();
        }

        int maior = valores[0]; 

        for(int i = 1; i < valores.length; i++){
            if(valores[i] > maior){
                maior = valores[i];
            }
        }

        System.out.println("O maior valor é: " + maior);


        teclado.close(); 

    }
}