import java.util.Scanner;

public class BEE1179{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int[] par = new int[5]; 
        int[] impar = new int[5]; 
        int contaPar = 0; 
        int contaImpar = 0; 
        int num = 0;

        for(int i = 0; i < 15; i++){
            num = teclado.nextInt(); 

            if(num % 2 == 0){
                par[contaPar] = num;
                contaPar++;

                 if(contaPar == 5){
                for(int contador = 0; contador < 5; contador++){
                    System.out.println("par[" + contador + "] = " + par[contador]);
                }
                contaPar = 0;
            }
        }
            else if(num % 2 != 0){
                impar[contaImpar] = num;
                contaImpar++;
                if(contaImpar == 5){
                for(int contador = 0; contador < 5; contador++){
                    System.out.println("impar[" + contador + "] = " + impar[contador]);
                }
                contaImpar = 0;
            }

        }
        }

        for(int i = 0; i < contaImpar; i++){
            System.out.println("impar[" + i + "] = " + impar[i]);
        }

        for(int i = 0; i < contaPar; i++){
            System.out.println("par[" + i + "] = " + par[i]);
        }

        teclado.close();

    }
}