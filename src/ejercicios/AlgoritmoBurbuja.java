package ejercicios;

public class AlgoritmoBurbuja {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 2, 5};
        int aux = 0;  // ✅ Declaras aquí UNA VEZ

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    // ✅ Solo USAS aux, no lo declares de nuevo
                    aux = arr[j];           // Guardas el valor
                    arr[j] = arr[j+1];      // Intercambias
                    arr[j+1] = aux;         // Completas el intercambio
                }
            }
            Recursos.mostrarArray(arr);
        }
    }
}