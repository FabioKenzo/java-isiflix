/*
Crie um array do tipo double com 4 posições para armazenar as notas de um aluno.
Peça para o usuário digitar as 4 notas.
No final, o programa deve mostrar a primeira e a última nota digitada.
Dica: Lembre-se que a primeira posição é [0] e a última, em um array de 4 espaços, é [3].
*/ 

import java.util.Scanner;

public class ExArrayA{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in); 

        double[] notas = new double[4];

        for(int i = 0; i < 4; i++){
            notas[i] = teclado.nextDouble();
        }

        System.out.printf("Primeira nota: %.2f\n", notas[0]);
        System.out.printf("Segunda nota: %.2f\n", notas[3]);


        teclado.close();
    }
}