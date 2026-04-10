/*
Crie um array de números inteiros com 6 posições e preencha-o com números digitados pelo usuário. 
No final, o programa deve contar e mostrar quantos números pares foram digitados.
Dica: Um número é par se o resto da divisão por 2 for zero (numero % 2 == 0).
*/ 

import java.util.Scanner; 

public class ExArrayE{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in); 

            int[] nums = new int[6];
            int pares = 0;
            for(int i = 0; i < nums.length; i++){
                nums[i] = teclado.nextInt(); 
            }

            for(int i = 0; i < nums.length; i++){ 
                if(nums[i] % 2 == 0){
                    pares++;
                }
            }

            System.out.println("Foram digitados " + pares + " numeros pares");

        teclado.close();
    }
}







