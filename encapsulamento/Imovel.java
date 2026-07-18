package encapsulamento;

/*
encapsulamento: define a visibilidade da parada (atributo/método/construto/classe)
- private (acessivel somente dentro da mesma classe)
- protected (acessivel somente dentro da propria package ou atraves de herença)
- public (acessivel em qualquer lugar)
*/

public class Imovel {
// Atributos devem ser privados
    private int quantidadeQuartos;
    private int quantidadeBanheiros;
    private int metragem;
    private boolean possuiGaragem;
    private String endereco;

    // SET: metodo que permite definir ou alterar o valor de um atributo
    public void setQuantidadeQuartos(int quantidadeQuartos){
        this.quantidadeQuartos = quantidadeQuartos;
    }
    // GET: meto que permite puxar o valor
    public int getQuantidadeQuartos(){
        return quantidadeQuartos;
    }

    public void setQuantidadeBanheiros(int quantidadeBanheiros){
        this.quantidadeBanheiros = quantidadeBanheiros;
    }
    public int getQuantidadeBanheiros(){
        return quantidadeBanheiros;
    }

    public void setMetragem(int metragem){
        this.metragem = metragem;
    }
    public int getMetragem(){
        return metragem;
    }
    public void setGaragem(boolean possuiGaragem){
        this.possuiGaragem = possuiGaragem;
    }
    public boolean getGaragem(){
        return possuiGaragem;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
}