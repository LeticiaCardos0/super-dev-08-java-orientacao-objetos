
import javax.swing.JOptionPane;


public class JogoExecutor {

    public void excutar() {
        // Classe nomeObjeto = new Classe();
        // Instanciando (criar) um objeto da classe jogo

        Jogo counterStrike2 = new Jogo();
        counterStrike2.nome = "CS2";
        counterStrike2.preco = 0;
        counterStrike2.parcelamentoDisponivel = 0;
        counterStrike2.valorParcela = calcularValorParcela(counterStrike2);

        Jogo redDeadRedemption = new Jogo();
        redDeadRedemption.nome = "CS2";
        redDeadRedemption.preco = 0;
        redDeadRedemption.parcelamentoDisponivel = 0;
        redDeadRedemption.valorParcela = calcularValorParcela(redDeadRedemption);

        Jogo theWitcher3 = new Jogo();
        theWitcher3.nome = "CS2";
        theWitcher3.preco = 0;
        theWitcher3.parcelamentoDisponivel = 0;
        theWitcher3.valorParcela = calcularValorParcela(theWitcher3);

        JOptionPane.showMessageDialog(null,
                "=== Jogo 1 ==="  +
                "Nome: " + counterStrike2.nome + "\n"
                + "Preço: R$ " + counterStrike2.preco + "\n"
                + "Parcelamento: " + counterStrike2.parcelamentoDisponivel + "\n"
                + "Valor da Parcela: R$ " + counterStrike2.valorParcela + "\n\n"
                + "=== Jogo 2 ===\n"
                + "Nome: " + redDeadRedemption.nome + "\n"
                + "Preço: R$ " + redDeadRedemption.preco + "\n"
                + "Parcelamento: " + redDeadRedemption.parcelamentoDisponivel + "\n"
                + "Valor da Parcela: R$ " + redDeadRedemption.valorParcela + "\n\n"
                + "=== Jogo 3 ===\n"
                + "Nome: " + theWitcher3.nome + "\n"
                + "Preço: R$ " + theWitcher3.preco + "\n"
                + "Parcelamento: " + theWitcher3.parcelamentoDisponivel + "x\n"
                + "Valor da Parcela: R$ " + theWitcher3.valorParcela
            );
    }

    private double calcularValorParcela(Jogo jogo) {
        // Classe nomeObjeto = new Classe
        double valorParcela = jogo.preco / jogo.parcelamentoDisponivel;
        return valorParcela;
    }
}
