import java.util.Locale;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java \nArley Santiago Macías Maya");
        
        // Ejemplo de Variables
        /* Las variables deben de iniciar en minúscula, si es una palabra compuesta, se debe de colocar
        * la segunda palabra al iniciar en Mayúscula*/
        String saludar = "Hola mundo desde Java con ejemplos de variables" +
                "\nArley Santiago Macías Maya";
        // toUpperCase() sirve para colocar el texto del String en mayúscula
        System.out.println("saludar = " + saludar.toUpperCase());
        
        int numero = 10;
        System.out.println("numero = " + numero);

        // Ejemplo de flujo de control con variables
        boolean valor = true;
        if(valor){
            System.out.println("valor = " + valor);
            int numero2 = 10;
        }
        // Variable dinámica
        var numero3 = 15;
        
        String nombre;
        nombre ="Santiago";
        if (numero == 10){
            nombre = "Santi";
        }
        System.out.println("nombre = " + nombre);

        /*Secuencia de escape
        * \b retroceso
        * \n Salto de linea
        * \r Retorno de carro
        * \t Tabulador
        * \\ Diagonal invertida
        * \" Comillas dobles*/
    }
}