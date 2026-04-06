package model;

public class Cliente {
    private String nome;
    private String cpf;

    private Computador[] computadores = new Computador[10];
    private int qtdComprados = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void comprar(Computador pc) {
        if (qtdComprados < computadores.length) {
            computadores[qtdComprados] = pc;
            qtdComprados++;
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtdComprados; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

    public void mostrarCompras() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);

        for (int i = 0; i < qtdComprados; i++) {
            System.out.println("\nPC " + (i + 1) + ":");
            computadores[i].mostraPCConfigs();
        }

        System.out.println("\nTotal: " + calculaTotalCompra());
    }

    public Computador[] getComputadores() {
        return computadores;
    }
}