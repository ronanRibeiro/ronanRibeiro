public class Invoice {
    //Variáveis
    private String numeroItem;
    private String descricao;
    private int quantidadeItem;
    private double precoUnitarioItem;

    //Getters e Setters
    public String getNumeroItem() {
        return this.numeroItem;
    }

    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeItem() {
        return this.quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getPrecoUnitarioItem() {
        return this.precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        this.precoUnitarioItem = precoUnitarioItem;
    }

    //Construtor
    public Invoice(String numeroItem, String descricao, int quantidadeItem, double precoUnitarioItem) {
        this.numeroItem = numeroItem;
        this.descricao = descricao;
        if (quantidadeItem < 0) {
            this.quantidadeItem = 0;
        } else {
            this.quantidadeItem = quantidadeItem;
        }
        if (precoUnitarioItem < 0) {
            this.precoUnitarioItem = 0;
        } else {
            this.precoUnitarioItem = precoUnitarioItem;
        }
    }

    //Métodos
    public double getInvoiceAmount() {
        return quantidadeItem*precoUnitarioItem;
    }
}
