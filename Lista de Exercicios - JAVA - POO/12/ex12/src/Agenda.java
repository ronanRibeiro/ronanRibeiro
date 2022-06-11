public class Agenda {
    //Variaveis
    String[] nome = new String[10];
    int[] idade = new int[10];
    float[] altura = new float[10];

    //Getters and Setter

    public String getNome(int i) {
        return this.nome[i];
    }

    public void setNome(String nome, int i) {
        this.nome[i] = nome;
    }

    public int getIdade(int i) {
        return this.idade[i];
    }

    public void setIdade(int idade, int i) {
        this.idade[i] = idade;
    }

    public float getAltura(int i) {
        return this.altura[i];
    }

    public void setAltura(float altura, int i) {
        this.altura[i] = altura;
    }


    //Métodos
    public void armazenarPessoa(String nome, int idade, float altura) {
        for (int i = 0; i<10; i++) {
            if (this.nome[i] == null) {
                this.nome[i] = nome;
                this.idade[i] = idade;
                this.altura[i] = altura;
                break;
            } else {
                System.out.println("A agenda está cheia.");
            }
        }
    }
    
    public void removerPessoa(String nome) {
        for (int i = 0; i<10; i++) {
            if (this.nome[i] != null && getNome(i).equals(nome)) {
                this.nome[i] = null;
                this.idade[i] = 0;
                this.altura[i] = 0;
                break;
            } else if (i == 9) {
                System.out.println("Essa pessoa não está registrada na agenda.");
            }
        }
    } 
    
    public int buscarPessoa(String nome) {
        int aux = -1;
        for (int i = 0; i<10; i++) {
            if (this.nome[i] != null && getNome(i).equals(nome)) {
                aux = i;
            }
        }
        return aux+1;
    } 

    public void imprimirAgenda() {
        for (int i = 0; i<10; i++) {
            if (nome[i] != null) {
                System.out.printf("\n%d - %s, %d anos, %.2f m.", i+1, nome[i], idade[i], altura[i]);
            }            
        }
    } 

    public void imprimirPessoa(int i) {
        System.out.printf("\n%d - %s, %d anos, %.2f m.", i, nome[i-1], idade[i-1], altura[i-1]);
    } 
}
