import javax.swing.JOptionPane;

public class FabricanteExecutor{
    public void excutar(){
        Fabricante wonit = new Fabricante();
        wonit.nome = "Wonit";
        wonit.cnpj = "81.385.593/0002-34";
        wonit.faturamento = 190900.90;
        wonit.percentual = 20;
        wonit.valorLucro = calculoLucro(wonit);


        JOptionPane.showMessageDialog(null,
            "=== Empresa 1 ==="  +
            "\nNome: " + wonit.nome + "\n"
            + "CNPJ: " + wonit.cnpj + "\n"
            + "Faturamento: R$ " + wonit.faturamento + "\n"
            + "Percrentual de Lucro " + wonit.percentual + "%" + "\n" 
            + "Valo Lucro: " + wonit.valorLucro);
    }

    private double calculoLucro(Fabricante fabricante){
        double valorLucro = fabricante.faturamento * (fabricante.percentual / 100.00);
        return valorLucro;
    }

}