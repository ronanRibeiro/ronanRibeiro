public class IngressoVip extends Ingresso {
        //Variaveis
        private float adicionalVip = 150;

        //Métodos
        public void imprimirValorVip () {
            System.out.printf("nO ingresso VIP custa %.2f R$", valor + adicionalVip);
        }
}
