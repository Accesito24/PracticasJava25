package ejercicios;

public class Recursos {

    public static int numAleatorio(int hasta) {
        return (int) (Math.random() * hasta) + 1;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    // ✅ ESTOS MÉTODOS DEBEN ESTAR DENTRO DE LA CLASE
    public static void rellenarMatrizAleatoria(int[][] matriz, int max) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Recursos.numAleatorio(max);
            }
        }
    }

    public static void rellenarArrayAleatoria(int[] array, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Recursos.numAleatorio(max);
        }
    }
}
