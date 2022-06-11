/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 16 - Construa uma classe para representar um carro. O tanque de combustível do carro armazena no máximo 50 
litros de gasolina. O carro consome 15 km/litro. Deve ser possível:
    a. Abastecer o carro com certa quantidade de gasolina;
    b. Mover o carro em uma determinada distância (medida em km);
    c. Retornar a quantidade de combustível e a distância total percorrida.
No programa principal, crie 2 carros. Abasteça 20 litros no primeiro e 30 litros no segundo. Desloque o 
primeiro em 200 km e o segundo em 400 km. Exiba na tela a distância percorrida e o total de combustível 
restante para cada um.
*/

public class App {
    public static void main(String[] args) throws Exception {

        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.abastecer(20.0);
        c2.abastecer(30.0);

        c1.mover(200.0);
        c2.mover(800.0);

        
        System.out.printf("\nO primeiro carro percorreu %.2f Km e tem %.1f L no tanque.", c1.getDistancia(), c1.getTanque());
        System.out.printf("\nO primeiro carro percorreu %.2f Km e tem %.1f L no tanque.", c2.getDistancia(), c2.getTanque());
    }
}