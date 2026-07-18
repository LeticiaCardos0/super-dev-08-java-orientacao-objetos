package listas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListSimples {
    public void executar(){
        exemploLIstaString();
    }

    public void exemploLIstaString(){
        //CRUD
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Leticia"); // C -> Create
        nomes.add("Lorenzo");
        nomes.add( "Gustavo");
        nomes.add("Judity");

        //Atualizar nome = Update
        nomes.set(2, "Gustavo Silva");

        //Remover elemento = Delete
        nomes.remove(3);

        //Acessar um item do array
        String primeiroNome = nomes.get(0);

        //Descobrir a quantidade de elementos no array
        int quantidadeNomes = nomes.size();
        
        //Acessar o Array
        System.out.println("Quantidade de nomes: " + quantidadeNomes);
        System.out.println("Primeiro Nome: " + primeiroNome );
        System.out.println("Segundo Nome: " + nomes.get(1));
        System.out.println("Terceiro Nome: " + nomes.get(2));
        System.out.println("Quarto Nome: " + nomes.get(3));

    }

    public void exemploListaComFor() {

    ArrayList<String> palavras = new ArrayList<>();

    palavras.add(JOptionPane.showInputDialog("Digite uma palavra"));


    String menorPalavra = "";
    int quantidadeCaracteresMenorPalavra = Integer.MAX_VALUE;

    for (int i = 0; i < palavras.size(); i++) {

        String palavraAtual = palavras.get(i);

        if (palavraAtual.length() < quantidadeCaracteresMenorPalavra) {
            quantidadeCaracteresMenorPalavra = palavraAtual.length();
            menorPalavra = palavraAtual;
        }
    }

    JOptionPane.showMessageDialog(null,
            "Menor palavra: " + menorPalavra);
}


}
