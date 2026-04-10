import java.util.Scanner;

public class Treinando{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);


         //System.out.print("Olá, mundo!");

            /*int a, b, c;
            float d; 
            double e; 
            a = 10; 
            b = 5; 
            c = a + b; 

            System.out.println("O valor de c é = " + c);

            c = a / b; 
            System.out.println("O valor de c é = " + c);

            c = a * b; 
            System.out.println("O valor de c é = " + c);

             c = a % b; 
            System.out.println("O resto da conta é de = " + c);

            c = a * b + 10; 
            System.out.println("O valor de c é = " + c);

            d = 10.0f;
            System.out.println("O valor de d é = " + d);

            d = 10.0f / 2; 
            System.out.println("O valor de d é = " + d);
            */

        
        
        /*int a;
        float b;
        double c; 

        System.out.println("Digite um número inteiro: "); 
        a = teclado.nextInt();
        System.out.println("Voce digitou o numero: " + a);
       
        System.out.println("Digite um numero float: "); 
        b = teclado.nextFloat(); 
        System.out.println("Voce digitou o numero float : " + b);

        System.out.println("Digite um valor double :");
        c = teclado.nextDouble();
        System.out.printf("Voce digitou o numero:%.3f\n " , c);
        */

       String nome;
       int codigo;
       double salario;

       System.out.println("Por favor digite seu nome: "); 
       nome = teclado.nextLine();
       System.out.println("Seu nome é: " + nome);

       System.out.println("Digite seu código: ");
       codigo = Integer.parseInt(teclado.nextLine());
       System.out.println("Seu codigo é: " + codigo);


       System.out.println("Digite o seu salario: R$ "); 
       salario = Double.parseDouble(teclado.nextLine());
       System.out.println("Seu salário é de: R$ " + salario);




    

        


        teclado.close();

    }
}