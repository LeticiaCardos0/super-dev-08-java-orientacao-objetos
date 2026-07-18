package composicao;

public class Motor {

    private double ciclindradas;
    private String combustivel;

    public void setCilindradas(double ciclindradas) {
        this.ciclindradas = ciclindradas;
    }
    public double getCilindradas(){
        return ciclindradas;
    }

    public void setCombultivel(String combustivel){
        this.combustivel = combustivel;
    }
    public double getCombustivel(){
        return ciclindradas;
    }
    @Override
    public String toString(){
        return String.format("""
        Combustivel: %s
        Cilindradas: %s
        """,combustivel,ciclindradas);   
    }
}