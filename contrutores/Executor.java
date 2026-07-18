package contrutores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Executor {

    public void executar(){
        executarRemedio();
    }

    private void executarRemedio(){
        Remedio paracetamol = new Remedio("Paracetamol",500,true, LocalDate.of(2026, 12, 2026));

        String remedioGenerico = paracetamol.isGenerico() == true ? "Sim" : "Não";

        String nomeFabricante = paracetamol.getFabricante() == null ? paracetamol.getFabricante() : "Sem Fabricante";

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = formatador.format(paracetamol.getDataVencimento());

        System.out.println(String.format("""
            Remedio: %s
            Miligramagem: %s
            Generico: %s
            Data de Validade: %s
            Fabricante: %s            
            """,paracetamol.getNome(), paracetamol.getMiligramagem(), remedioGenerico, dataFormatada, nomeFabricante));
    }
}
