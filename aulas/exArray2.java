import java.util.Scanner;

public class exArray2{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in); 

        int[] nums = new int[5]; 
        int soma = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número: ");
            nums[i] = teclado.nextInt();
            soma = soma + nums[i];
        }

        System.out.println("A soma dos numeros é: " + soma);
        
        teclado.close();
    }
}