package listas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExercicioArray {
    public void executar(){
        executorExercicio1();
    }

    public void executorExercicio1(){

        ArrayList<Double> precos = new ArrayList<>();

        precos.add(5.30);
        precos.add(6.40);
        precos.add(3.55);
        precos.add(5.37);
        precos.add(7.33);

        System.out.println("Preço 1: R$" + precos.get(0));
        System.out.println("Preço 2: R$" + precos.get(1));
        System.out.println("Preço 3: R$" + precos.get(2));
        System.out.println("Preço 4: R$" + precos.get(3));
        System.out.println("Preço 5: R$" + precos.get(4));

        double somaValores = precos.get(0) + precos.get(1) + precos.get(2) + precos.get(3) + precos.get(4);

        System.out.println("Soma dos valores é: R$" + somaValores);

        precos.remove(4);

        System.out.println("O tamanho do Array é: " + precos.size());
    }

    public void executarExercicio2() {
    ArrayList<Integer> numeros = new ArrayList<>();

    // Leitura dos números
    for (int i = 0; i < 10; i++) {
        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um número:")
        );
        numeros.add(numero);
    }

    int quantidadePares = 0;
    int quantidadePositivos = 0;
    int quantidadeAcimaDe10 = 0;
    int quantidadeImpares = 0;
    int somaPositivos = 0;

    // Processamento
    for (int numero : numeros) {

        if (numero % 2 == 0) {
            quantidadePares++;
        } else {
            quantidadeImpares++;
        }

        if (numero > 0) {
            quantidadePositivos++;
            somaPositivos += numero;
        }

        if (numero > 10) {
            quantidadeAcimaDe10++;
        }
    }

    // Exibição
    JOptionPane.showMessageDialog(null,
            "Quantidade de números pares: " + quantidadePares +
            "\nQuantidade de números positivos: " + quantidadePositivos +
            "\nQuantidade de números acima de 10: " + quantidadeAcimaDe10 +
            "\nQuantidade de números ímpares: " + quantidadeImpares +
            "\nSoma dos números positivos: " + somaPositivos);
}
}
