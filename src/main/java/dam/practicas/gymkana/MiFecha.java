package dam.practicas.gymkana;

import java.awt.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.Period;

public class MiFecha {
    public static void main(String[] args) {

        LocalDate fechaNacimiento = LocalDate.of(2006, 03, 24);
        Locale idioma = Locale.forLanguageTag("es");


        System.out.println("dia: " + fechaNacimiento.getDayOfMonth());
        System.out.println("mes: " + fechaNacimiento.getMonthValue());
        System.out.println("año: " + fechaNacimiento.getYear());
        System.out.print("\n");
        System.out.println("Mes: " + fechaNacimiento.getMonth().getDisplayName(TextStyle.FULL, idioma).toUpperCase());
        System.out.println("Dia: " + fechaNacimiento.getDayOfWeek().getDisplayName(TextStyle.FULL, idioma).toUpperCase());
    }
    public class MiEdad {

    }
}
