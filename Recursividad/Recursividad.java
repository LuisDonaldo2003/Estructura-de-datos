public class Recursividad {
      int VocalPrincipal(String oracion) {
         System.out.println("La oracion es: " + oracion);
        return ConteoVocal(oracion,0);
    }

      int ConteoVocal(String oracion,int conteo) {
        if (conteo >=oracion.length()) {
            return 0;
        }else {
            char x=oracion.toUpperCase().charAt(conteo);
            if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
                return 1+ConteoVocal(oracion,conteo+1);
            }else {
                return ConteoVocal(oracion,conteo+1);
            }
        }
     }
    public static void main(String[] args){
         Recursividad union = new Recursividad();
         System.out.println("La cantidad de vocales es: "+ union.VocalPrincipal("Luis Donaldo"));
    }

}
