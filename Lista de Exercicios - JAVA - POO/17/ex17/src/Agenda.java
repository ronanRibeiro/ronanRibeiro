/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 17 -  O agendamento de compromissos é uma das tarefas mais comuns para profissionais. Um sistema com essa 
finalidade deve ser capaz de gerenciar compromissos, atribuindo a cada um o seu tipo (reunião, pagamento, 
entrega de projeto); data; nome do participante ( pessoa, empresa etc) alguém com quem acontecerá é o 
compromisso) e seu telefone. Desenvolva um sistema que seja capaz de fazer operações básicas como 
agendar, remover e alterar compromissos e exibir compromissos por participante e por data.
*/

import java.util.LinkedList;

public class Agenda {
    //Variaveis
    private LinkedList<String> nome = new LinkedList<String>();
    private LinkedList<String> tipo = new LinkedList<String>();
    private LinkedList<String> telefone = new LinkedList<String>();
    private LinkedList<Data> data = new LinkedList<Data>();

    //Getters and Setter

    //Métodos
    public void armazenar(String nome, String tipo, String telefone, String dataString) {
        this.nome.addLast(nome);
        this.tipo.addLast(tipo);
        this.telefone.addLast(telefone);
        Data d = new Data(dataString);
        this.data.addLast(d);
    }
    
    public void remover(int i) {
        this.nome.remove(i);
        this.tipo.remove(i);
        this.telefone.remove(i);
        this.data.remove(i);
    } 
    
    public void alterar(String nome, String tipo, String telefone, String dataString, int i) {
        this.nome.set(i, nome);
        this.tipo.set(i, tipo);
        this.telefone.set(i, telefone);
        Data d = new Data(dataString);
        this.data.set(i, d);
    } 

    public void exibirPessoa(String nome) {
        for (int i = 0; i < this.nome.size(); i++) {
            if (this.nome.get(i).equals(nome)) {
                System.out.printf("\nNome: %s", this.nome.get(i));
                System.out.printf("\nTipo: %s", this.tipo.get(i));
                System.out.printf("\nTelefone: %s", this.telefone.get(i));
                System.out.printf("\nData: %s", this.data.get(i).getDataString());
            }            
        }
    }

    public void exibirData(String dataString) {
        for (int i = 0; i < this.nome.size(); i++) {
            if (this.data.get(i).getDataString().equals(dataString)) {
                System.out.printf("\nNome: %s", this.nome.get(i));
                System.out.printf("\nTipo: %s", this.tipo.get(i));
                System.out.printf("\nTelefone: %s", this.telefone.get(i));
                System.out.printf("\nData: %s", this.data.get(i).getDataString());
            }            
        }
    } 

    public void exibirTudo() {
        for (int i = 0; i < this.nome.size(); i++) {
            System.out.printf("\nNome: %s", this.nome.get(i));
            System.out.printf("\nTipo: %s", this.tipo.get(i));
            System.out.printf("\nTelefone: %s", this.telefone.get(i));
            System.out.printf("\nData: %s", this.data.get(i).getDataString());        
        }
    } 


}
