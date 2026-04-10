public class ExForEach2{
    public static void main(String args[]){

        int[] numeros = {3, 7, 2, 9, 5}; 
        int soma = 0;

        for(int elemento: numeros){
            soma = soma + elemento;
        }

        System.out.println("A soma é de: " + soma);
    }
}