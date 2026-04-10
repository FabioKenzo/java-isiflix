import java.util.Scanner;


public class Leitura{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        
        /*int a; 
        float b; 
        double c; 

        System.out.println("Por favor, digite um numero inteiro: ");
        a = teclado.nextInt();
        System.out.println("Voce digitou o valor " + a);
        System.out.println("Por favor, digite um numero float: ");
        b = teclado.nextFloat();
        System.out.println("Voce digitou o valor " + b);
        System.out.println("Digite um valor double "); 
        c = teclado.nextDouble();
        System.out.printf("Voce digitou o valor %.3f\n ", c);
        */

        String nome; 
        int codigo;
        double salario;

        System.out.println("Digite seu codigo: ");
        codigo = Integer.parseInt(teclado.nextLine()); 
        //codigo = teclado.nextInt();
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();//o nextLine pega tudo que digitar até o enter agora se fosse apenas next pegaria a primeira palavra até o enter então não pegaria um nome composto por exemplo
        System.out.println("Digite seu salrio: ");
        salario = Double.parseDouble(teclado.nextLine());
        System.out.println("Seu codigo, nome e salario: " + codigo + " - " + nome + " - R$ " + salario);




        teclado.close();



    }
}