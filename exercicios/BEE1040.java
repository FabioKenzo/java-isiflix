import java.util.Scanner;

public class BEE1040{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    float N1, N2, N3, N4, media, notaExame, mediaFinal;
    N1 = teclado.nextFloat(); 
    N2 = teclado.nextFloat();
    N3 = teclado.nextFloat();
    N4 = teclado.nextFloat();

    media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10f;
    System.out.printf("Media: %.1f\n", media);

    if(media >= 7){
        System.out.println("Aluno aprovado.");
    }
    else if(media < 5){
        System.out.println("Aluno reprovado.");
    }
    else if(media >=5 && media <=6.9){
        System.out.println("Aluno em exame.");
        notaExame = teclado.nextFloat();
        System.out.printf("Nota do exame: %.1f\n", notaExame);

        mediaFinal = (media + notaExame) / 2.0f; 

        if(mediaFinal >= 5.0f){
            System.out.println("Aluno aprovado.");
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }
        else{
            System.out.println("Aluno reprovado.");
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }
    }

    teclado.close();

    }
}