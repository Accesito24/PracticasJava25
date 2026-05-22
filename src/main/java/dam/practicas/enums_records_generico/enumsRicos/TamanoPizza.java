package dam.practicas.enums_records_generico.enumsRicos;


public  enum TamanoPizza {
    FAMILIAR(40, 14.99),
    MEDIANA(30, 9.99),
    PEQUEÑA(20, 6.99);

    private final int diametro;
    private final double precioBase;

    private TamanoPizza(int diametro, double precioBase) {
        this.diametro = diametro;
        this.precioBase = precioBase;
    }


    public int getDiametro() {return diametro;}
    public double getPrecioBase() {return precioBase;}

    public double CalcularArea(){
        int radio = diametro/2;
        return Math.PI * (radio + radio);

    }
}

