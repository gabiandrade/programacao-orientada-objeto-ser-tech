package loja;

import java.util.Scanner;

public class Menu {

     public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Brinquedo: ");
        String nomeProduto = sc.nextLine();
        System.out.println("Digite a quantidade do Brinquedo: ");
        int quantidadeBrinquedo = sc.nextInt();
        System.out.println("Digite o preco do Brinquedo: ");
        double precoBrinquedo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o codigo de barras: ");
        String codigoBarras = sc.nextLine();
    }


}
