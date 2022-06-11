 class contaCorrente {
    //Datas Variaveis
    private String numeroConta;
    private String nome;
    private float saldo;

    //Getters and Setters

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Métodos
    public void deposito(float deposito) {
        this.saldo = saldo + deposito;
    }

    public void saque(float saque) {
        this.saldo = saldo - saque;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }
}
