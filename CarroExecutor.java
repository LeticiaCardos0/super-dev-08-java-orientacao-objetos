
import javax.swing.JOptionPane;

public class CarroExecutor {
    public void executar(){

    Carro uno = new Carro();
    uno.motor = 3.5;
    uno.modelo = "Uno com escada";
    uno.cor = "Claro";
    uno.isEletrico = false;
    uno.marca = "Fiat";
    uno.aro = 14;

    //atualizando 
    uno.motor = 7.0;
    uno.modelo = "Uno com escada dupla";
    uno.cor = "Relampago do marquinos";

    //Criar objeto e para perguntat para o usuario os dados

    Carro carro1 = new Carro();
    carro1.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
    carro1.cor =  JOptionPane.showInputDialog("Digite a cor do carro");
    carro1.isEletrico = Boolean.parseBoolean(JOptionPane
        .showInputDialog("Carro eletrico? [true/false]"));
    carro1.motor = Double.parseDouble(JOptionPane
        .showInputDialog("Digite a potencia do carro"));
    carro1.marca = JOptionPane.showInputDialog("Digite a marca do carro");
    carro1.aro = Integer.parseInt(JOptionPane
        .showInputDialog("Digite o tamanho do aro do carro")); 

        JOptionPane.showMessageDialog(null,
                "=== Carro 1 ==="  + "\n" +
                "Modelo: " + uno.modelo + "\n" +
                "Cor: " + uno.cor + "\n" +
                "Eletrico: " + uno.isEletrico + "\n" +
                "Motor: " + uno.motor + "\n" +
                "Marca: " + uno.marca + "\n" +
                "Aro: " + uno.aro + "\n\n" +
                "=== Carro 2 ==="  + "\n" +
                "Modelo: " + carro1.modelo + "\n" +
                "Cor: " + carro1.cor + "\n" +
                "Eletrico: " + carro1.isEletrico + "\n" +
                "Motor: " + carro1.motor + "\n" +
                "Marca: " + carro1.marca + "\n" +
                "Aro: " + carro1.aro

            );
    }

    
}