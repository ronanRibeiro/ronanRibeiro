public class CalculadoraCientifica extends Calculadora {
        //Variáveis
        Double num1;
        Double num2;

        //Métodos
        public Double potencia(Double num1, Double num2) {
            return Math.pow(num1, num2);
        }
    
        public Double raizQuadrada(Double num1) {
            return Math.sqrt(num1);
        }
}
