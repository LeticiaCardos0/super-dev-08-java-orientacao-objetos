package encapsulamento;

import javax.swing.JOptionPane;

public class ImovelExecutor {
public void executor(){
        
    Imovel imovelLoriLori = new Imovel();
    imovelLoriLori.setQuantidadeQuartos(5);;
    imovelLoriLori.setEndereco("Rua");
    imovelLoriLori.setGaragem(true);
    imovelLoriLori.setQuantidadeBanheiros(5);;
    imovelLoriLori.setMetragem(200);;

    JOptionPane.showMessageDialog(null,
    "Imovel" + imovelLoriLori. getEndereco() +
    "\nQuantidade Quartos: " + imovelLoriLori.getQuantidadeQuartos() +
    "\nMetragem: " + imovelLoriLori.getMetragem() +
    "\nQuantidade Banheiro: " + imovelLoriLori.getQuantidadeBanheiros() +
    "\nPossui Garagem: " + imovelLoriLori.getGaragem()
    );

    } 
}
