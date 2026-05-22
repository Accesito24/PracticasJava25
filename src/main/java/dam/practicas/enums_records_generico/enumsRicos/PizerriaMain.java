package dam.practicas.enums_records_generico.enumsRicos;

public class PizerriaMain {
    public static void main(String[] args) {
        TamanoPizza familiar1 = TamanoPizza.FAMILIAR;
        TamanoPizza mediana1 = TamanoPizza.MEDIANA;

        for (TamanoPizza t :TamanoPizza.values()) {
            System.out.println(t.CalcularArea());
        }



    }
}
