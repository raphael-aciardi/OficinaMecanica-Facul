package modelo;

public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal();


        Cliente cliente1 = new Cliente("João Silva", "12345678900");
        Cliente cliente2 = new Cliente("Maria Oliveira", "98765432100");
        Cliente cliente3 = new Cliente("Carlos Pereira", "11223344556");


        Veiculo veiculo1 = new Veiculo();
        veiculo1.setPlaca("ABC-1234");
        veiculo1.setModelo("Fiat Uno");
        veiculo1.setAno(2010);
        veiculo1.setFabricante("Fiat");
        veiculo1.setCor("Branco");

        Veiculo veiculo2 = new Veiculo();
        veiculo2.setPlaca("XYZ-5678");
        veiculo2.setModelo("Volkswagen Gol");
        veiculo2.setAno(2015);
        veiculo2.setFabricante("Volkswagen");
        veiculo2.setCor("Preto");

        Veiculo veiculo3 = new Veiculo();
        veiculo3.setPlaca("LMN-9101");
        veiculo3.setModelo("Chevrolet Onix");
        veiculo3.setAno(2018);
        veiculo3.setFabricante("Chevrolet");
        veiculo3.setCor("Vermelho");

        principal.cadastrarCliente(cliente1);
        principal.cadastrarCliente(cliente2);
        principal.cadastrarCliente(cliente3);

        principal.registrarEntradaVeiculo(veiculo1);
        principal.registrarEntradaVeiculo(veiculo2);
        principal.registrarEntradaVeiculo(veiculo3);


        principal.listarClientes();
        principal.listarVeiculosEmManutencao();


        principal.realizarManutencao();

    }
}