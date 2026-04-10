import java.util.Scanner;

public class BEE1132{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int maior = 0; 
        int menor = 0;
        int soma = 0;
        int n1 = teclado.nextInt(); 
        int n2 = teclado.nextInt(); 

        if(n1 < n2){
            maior = n2; 
            menor = n1;
        }
        else{
            maior = n1; 
            menor = n2;
        }

        for(int i = menor; i <= maior; i++){
            if(i % 13 != 0){
                soma = soma + i;
            }
            else if(i % 13 != 0){
                soma = soma + i;
            }
        }

        System.out.println(soma);
        

        teclado.close();


    }
}