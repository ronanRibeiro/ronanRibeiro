public class Carro {
    //Variaveis
    private Double tanque = 0.0;
    private Double distancia = 0.0;

    //Getters and Setters
    public Double getTanque() {
        return this.tanque;
    }

    public void setTanque(Double tanque) {
        this.tanque = tanque;
    }

    public Double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }  

    //Métodos
    public void abastecer(Double tanque) {
        if (tanque >=0) {
            if (this.tanque + tanque <= 50) {
                this.tanque = this.tanque+tanque;
            } else {
                System.out.println("\nA quantidade de gasolina abastecida é maior que a capacidade do tanque. \nAssim, o carro foi abastecido até o seu limite de 50L.");
                this.tanque = 50.0;
            }
        } else {
            System.out.println("\nAicione uma quantidade positiva para abastecer.");
        }        
    }

    public void mover(Double distancia) {
        if (this.tanque-(distancia/15) < 0) {
            setDistancia(this.distancia+this.tanque*15);
            setTanque(0.0);
            System.out.printf("\nO carro não consegue percorrer os %.2f Km com a gasolina que tem.\n Assim, ele andou %.2f Km e está com o tanque vazio.", distancia, getDistancia());            
        } else {
            setTanque(this.tanque-(distancia/15));
            setDistancia(this.distancia+distancia);
        }
    }
    
}
