public class ParesEImparesArreglos {

    public static void main(String[] args) {
        int[] numeros = {12, 7, 24, 19, 8, 31, 42, 5, 16, 23};

        int contadorPares = 0;
        int contadorImpares = 0;

        // Recorrer el arreglo para clasificar cada número
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++; 
            } else {
                contadorImpares++;
            }
        }

        System.out.print("Contenido del arreglo: [ ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : " "));
        }
        System.out.println("]");

        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
    }
    
}
