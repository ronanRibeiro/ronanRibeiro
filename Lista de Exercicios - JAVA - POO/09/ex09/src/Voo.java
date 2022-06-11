import java.util.Arrays;

public class Voo {
    //Variaveis
    String numeroVoo;
    Data data;
    boolean[] cadeira = new boolean[100];

    //Getters and Setters

    public String getNumeroVoo() {
        return this.numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean[] getCadeira() {
        return this.cadeira;
    }

    public void setCadeira(boolean[] cadeira) {
        this.cadeira = cadeira;
    }


    //Construtor
    public Voo (String numeroVoo, Data data) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        Arrays.fill(this.cadeira, Boolean.FALSE);
    }

    //Métodos
    public int proximoLivre () {
        for (int i = 0; i < 100; i++) {
            if (cadeira[i] == false) {
                return i+1;
            }
        }
        return 0;
    }

    public boolean verifica(int i) {
        return cadeira[i-1];
    }

    public boolean ocupa(int i) {
        if (cadeira[i-1] == true) {
            return false;
        } else {
            cadeira[i-1] = true;
            return true;
        }
    }

    public String vagas () {
        String texto = "Cadeiras desocupadas: ";
        int qntd = 0;
        for (int i = 0; i < 100; i++) {
            if (cadeira[i] == false) {
                texto = texto + (i+1) +", ";
                qntd++;
            }
        }
        if (qntd > 0) {
            return texto.substring(0,texto.length()-2);
        } else {
            return "Não tem assentos disponíveis";
        }
        
    }
}
