public class CicloFor {

     int vocales(String oracion) {
        System.out.println("La oracion es: " + oracion);
        int ContadorVocal = 0;
        for (int x = 0; x < oracion.length(); x++) {
            if ((oracion.toUpperCase().charAt(x) == 'A') || (oracion.toUpperCase().charAt(x) == 'E') ||
                    (oracion.toUpperCase().charAt(x) == 'I') || (oracion.toUpperCase().charAt(x) == 'O') ||
                    (oracion.toUpperCase().charAt(x) == 'U'))
                ContadorVocal++;
        }
        System.out.println("La cantidad de vocales es: " + ContadorVocal);
        return ContadorVocal;
    }

    public static void main(String[] args) {
        CicloFor ciclo = new CicloFor();
        ciclo.vocales("Hola Mundo");
    }
}
