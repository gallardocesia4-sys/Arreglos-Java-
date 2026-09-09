public class NumeroMayorArreglos {

    public static void main(String[] args) {

        int[] numeros = {14, 52, 8, 91, 33, 67, 4, 85};

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i]; 
            }
        }

        System.out.print("Contenido del arreglo: [ ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : " "));
        }
        System.out.println("]");

        System.out.println("El número mayor es: " + mayor);
    }
    
}
