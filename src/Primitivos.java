public class Primitivos {
    public static void main(String[] args) {
        /*Números enteros
         * - byte
         * - short
         * - int
         * - long = debe de contener la letra L al final del número*/

        /*Números Reales
         * - float = debe de llevar la letra f al final del número
         * - double*/
        byte numeroByte = 7; // -128 a 127
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte es " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte es " + Byte.MIN_VALUE);

        short numeroShort = 32000; //-32768 a 32767
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor máximo de un short es " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short es " + Short.MIN_VALUE);

        int numeroInt = 2147483647; //-2147483648 a 2147483647
        System.out.println("numeroShort = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor máximo de un int es " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int es " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L; // -9223372036854775808 a 9223372036854775807
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor máximo de un long es " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long es " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775807L;
    }
}
