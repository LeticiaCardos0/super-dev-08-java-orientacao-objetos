package contrutores;

import java.time.LocalDate;

public class Remedio {
    private String nome;
    private int miligramagem;
    private boolean generico;
    private LocalDate dataVencimento;
    private String fabricante;

    //Constructor : criar um objeto com informacoes qua sao obrigatorias para o funcionamento correto
    public Remedio(String nome,int miligramagem, boolean generico, LocalDate dataVencimento){
        this.nome = nome;
        this.miligramagem = miligramagem;
        this.generico = generico;
        this.dataVencimento = dataVencimento;
    }

    public String getNome(){
        return nome;
    }

    //Neste cenario n queremos permitir o usuario alterar as informacoes obrigatorias entao nao é necessario criar o set

    public int getMiligramagem(){
        return miligramagem;
    }

    public boolean isGenerico(){
        return generico;
    }
    public LocalDate getDataVencimento(){
        return dataVencimento;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    








}
