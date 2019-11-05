
package ud3.ed;

/**
 * @author GJZS
 */
public class UD3ED {
    public static void main (String [] args) {
        String Estudiante = "Gabriela Zavala";
        int valor1 = 5;
        int valor2 = 20;
        
      System.out.println("Estudiante "+ args[0] + " : ");
      System.out.println(veredicto(args[1], args[2]));
    }
    private static String veredicto (String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
        
        }
  
     }   
   