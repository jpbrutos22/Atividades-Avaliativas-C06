package main;

import java.util.Scanner;
import model.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("João Paulo", "15402178682"); //DADOS DO CLIENTE (EU)

        // ================= PROMOÇÃO 1 =================
        Computador pc1 = new Computador("Apple", 2288); //MARCA E PREÇO(MATRÍCULA)

        pc1.addHardware(new HardwareBasico("Pentium Core i3", 2200), 0);
        pc1.addHardware(new HardwareBasico("Memória RAM", 8), 1);
        pc1.addHardware(new HardwareBasico("HD", 500), 2);

        pc1.setSistemaOperacional(new SistemaOperacional("macOS Sequoia", 64));
        pc1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));


        // ================= PROMOÇÃO 2 =================
        Computador pc2 = new Computador("Samsung", 3522);

        pc2.addHardware(new HardwareBasico("Pentium Core i5", 3370), 0);
        pc2.addHardware(new HardwareBasico("Memória RAM", 16), 1);
        pc2.addHardware(new HardwareBasico("HD", 1000), 2);

        pc2.setSistemaOperacional(new SistemaOperacional("Windows 10", 64));
        pc2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));


        // ================= PROMOÇÃO 3 =================
        Computador pc3 = new Computador("Dell", 7966);

        pc3.addHardware(new HardwareBasico("Pentium Core i7", 4500), 0);
        pc3.addHardware(new HardwareBasico("Memória RAM", 32), 1);
        pc3.addHardware(new HardwareBasico("SSD", 512), 2);

        pc3.setSistemaOperacional(new SistemaOperacional("Windows 11", 64));
        pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));


        int opcao;

        do {
            System.out.println("\n===== PC MANIA =====");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha: ");

            opcao = sc.nextInt(); //FAZ A ESCOLHA DAS PROMOÇÕES

            switch (opcao) {
                case 1:
                    cliente.comprar(pc1);
                    System.out.println("PC 1 adicionado!");
                    break;

                case 2:
                    cliente.comprar(pc2);
                    System.out.println("PC 2 adicionado!");
                    break;

                case 3:
                    cliente.comprar(pc3);
                    System.out.println("PC 3 adicionado!");
                    break;

                case 0:
                    System.out.println("\nFinalizando compra...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        // ================= FECHAMENTO =================
        cliente.mostrarCompras();

        sc.close();
    }
}