package loja;

import loja.domain.Brinquedo;

import java.util.Locale;
import java.util.Scanner;

public class LojaAda {

    static void main() {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.UK);
        System.out.println("Digite o nome do Brinquedo: ");
        String nomeProduto = sc.nextLine();
        System.out.println("Digite a quantidade do Brinquedo: ");
        int quantidadeBrinquedo = sc.nextInt();
        System.out.println("Digite o preco do Brinquedo: ");
        double precoBrinquedo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o codigo de barras: ");
        String codigoBarras = sc.nextLine();

        Brinquedo brinquedo = new Brinquedo();
        brinquedo.setNomeBrinquedo(nomeProduto);
        brinquedo.setQuantidadeEstoque(quantidadeBrinquedo);
        brinquedo.setCodigoBarras(codigoBarras);
        brinquedo.setPrecoBrinquedo(precoBrinquedo);

        brinquedo.mostrarInformacoes();

        Brinquedo brinquedo1 = new Brinquedo(nomeProduto, quantidadeBrinquedo, precoBrinquedo, codigoBarras);

        System.out.println(brinquedo1);


    }
}
