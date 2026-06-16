package dam.practicas.examen.practicaExamenHospital;

public class Main {
    public static void main(String[] args) {
        // 1. Inicializar el hospital y el personal
        Hospital hospital = new Hospital("Hospital Galileo");

        Medico medico1 = new Medico("12345678A", "Dr. Carlos Heredia", "Urgencias", 2500);
        Medico medico2 = new Medico("87654321B", "Dra. Ana Martínez", "Pediatría", 2300);
        Enfermero enfermero1 = new Enfermero("11223344C", "Enfermero Juan López", "Planta 1", 5);

        // Arreglado: Ahora usa "agregarPersonal" en vez de "addPersonal"
        hospital.agregarPersonal(medico1);
        hospital.agregarPersonal(medico2);
        hospital.agregarPersonal(enfermero1);

        // Crear consultas: una pequeña (capacidad 2) y otra grande
        Consulta consultaPequena = new Consulta("Consulta 101 (Pequeña)", 2, medico2);
        Consulta consultaGrande = new Consulta("Consulta 102 (Grande)", 10, medico1);

        // Arreglado: Ahora usa "agregarConsulta" en vez de "addConsulta"
        hospital.agregarConsulta(consultaPequena);
        hospital.agregarConsulta(consultaGrande);

        // 2. Control de aforo y captura de la excepción personalizada
        Paciente p1 = new Paciente("1111", "Lucas Garmendia", "Gripe leve", 23);
        Paciente p2 = new Paciente("2222", "Sofía Valentina", "Revisión anual", 74);
        Paciente p3 = new Paciente("3333", "Mateo Romero", "Esguince de tobillo", 19);

        System.out.println("--- INICIANDO REGISTRO DE PACIENTES ---");
        try {
            consultaPequena.agregarPaciente(p1);
            consultaPequena.agregarPaciente(p2);
            // Esto va a hacer saltar la excepción
            consultaPequena.agregarPaciente(p3);
        } catch (AforoCompletoException e) {
            // Se muestra el error en rojo por consola sin detener la ejecución de los siguientes métodos
            System.err.println(e.getMessage());
        }

        // Colocamos al tercer paciente en la grande para que aparezca en el informe final
        try {
            consultaGrande.agregarPaciente(p3);
        } catch (AforoCompletoException e) {
            System.err.println(e.getMessage());
        }

        // 3. Ejecutar informe de Paciente de Riesgo
        hospital.mostrarPacienteMasMayor();

        // 4. Calcular nóminas
        System.out.println("\n--- ESTADÍSTICAS FINANCIERAS ---");
        System.out.println("Gasto total en nóminas este mes: " + hospital.calcularTotalNominas() + "€");

        // 5. Exportar los datos a archivo plano (.txt)
        hospital.exportarPacientes();
    }
}