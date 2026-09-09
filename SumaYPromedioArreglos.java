public class SumaYPromedioArreglos {

    public static void main(String[] args) {
        int[] numeros = {15, 8, 22, 10, 5};
        
        int suma = 0;

        // Recorrer el arreglo para acumular la suma
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        
        System.out.println(" RESULTADOS ");
        
        // Mostrar los valores del arreglo
        System.out.print("Valores en el arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : "\n"));
        }

    
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
    
}
