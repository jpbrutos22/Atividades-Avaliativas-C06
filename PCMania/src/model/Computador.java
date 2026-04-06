package model;

public class Computador {
    private String marca;
    private float preco;

    private HardwareBasico[] hardwares = new HardwareBasico[3];
    private SistemaOperacional sistema;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public void addHardware(HardwareBasico hw, int posicao) {
        this.hardwares[posicao] = hw;
    }

    public void setSistemaOperacional(SistemaOperacional sistema) {
        this.sistema = sistema;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);

        for (HardwareBasico hw : hardwares) {
            if (hw != null) {
                System.out.println(hw.getNome() + " - " + hw.getCapacidade());
            }
        }

        if (sistema != null) {
            System.out.println("SO: " + sistema.getNome() + " (" + sistema.getTipo() + " bits)");
        }

        if (memoriaUSB != null) {
            System.out.println("USB: " + memoriaUSB.getNome() + " - " + memoriaUSB.getCapacidade());
        }
    }
}