package composicao;

public class Executor {

    public void executar(){
        executarCadastro();

        }
        private void executarCarro(){
        Motor motorPalio = new Motor();
        motorPalio.setCilindradas(150);
        motorPalio.setCombultivel("Flex");

        Carro palio = new Carro();
        palio.setModelo("Flex");
        palio.setCor("Azul");
        palio.setMotor(motorPalio);
        palio.setEscada(true);
        }

        private void executarCadastro(){
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome("Leticia");
        novaPessoa.setCpf("111.111.111-22");
        novaPessoa.setIdade(22);
        
        Endereco novoEndereco = new Endereco();
        novoEndereco.setRua("Rua Erwin");
        novoEndereco.setNumero("467");
        novoEndereco.setCidade("Blumenau");
        }
    }


