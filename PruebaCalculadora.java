public class PruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(5, 3);
        int resultadoSuma = calculadora.sumar();
        System.out.println("El resultado de la suma es: " + resultadoSuma);
    }
}
