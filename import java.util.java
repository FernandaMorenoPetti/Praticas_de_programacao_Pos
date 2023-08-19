import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numeros = new float[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextFloat();
        }

        float maior = numeros[0];
        float menor = numeros[0];
        float soma = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            soma += numeros[i];
        }

        float media = soma / 10;

        System.out.print("Números digitados: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);

        scanner.close();
    }
}

