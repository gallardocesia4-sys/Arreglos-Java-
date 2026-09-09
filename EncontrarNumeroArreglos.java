import java.util.Scanner;

public class EncontrarNumeroArreglos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {12, 45, 7, 23, 89, 34, 56, 90, 3, 67};

        System.out.print("Introduce un número entero para buscar en el arreglo: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true; 
            }
        }
        if (encontrado) {
            System.out.println("¡El número " + numeroBuscado + " SÍ se encuentra en el arreglo!");
        } else {
            System.out.println("El número " + numeroBuscado + " NO se encuentra en el arreglo. :( ");
        }

        scanner.close();
    }
}
