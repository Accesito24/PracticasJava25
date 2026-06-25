package dam.practicas.examen.examen3;

public enum TipoCombustible {
    DIESEL,
    GASOLINA,
    ELECTRICO;

    // Permite parsear desde String de forma segura
    public static TipoCombustible fromString(String valor) {
        for (TipoCombustible t : values()) {
            if (t.name().equalsIgnoreCase(valor)) {
                return t;
            }
        }
        throw new IllegalArgumentException("Combustible no válido: " + valor +
                ". Solo se admiten: Diesel, Gasolina, Electrico.");
    }
}
