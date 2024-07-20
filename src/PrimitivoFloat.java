public class PrimitivoFloat {
    public static void main(String[] args) {
        float realFloat = 1.0f; // Debe de llevar siempre la f.
        System.out.println("realFloat = " + realFloat);
        // Constantes
        System.out.println("float corresponde en byte a: " + Float.BYTES);
        System.out.println("float corresponde en bites a: " + Float.SIZE);
        System.out.println("Máximo valor para float: " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a: " + Double.BYTES);
        System.out.println("double corresponde en bites a: " + Double.SIZE);
        System.out.println("Máximo valor para double: " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double: " + Double.MIN_VALUE);

        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
