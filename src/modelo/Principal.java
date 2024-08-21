package modelo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    private List<Cliente> clientes;
    private List<Veiculo> veiculosEmManutencao;

    public Principal() {
        this.clientes = new ArrayList<>();
        this.veiculosEmManutencao = new ArrayList<>();
    }


    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso: " + cliente.getNome());
    }


    public void registrarEntradaVeiculo(Veiculo veiculo) {
        veiculosEmManutencao.add(veiculo);
        System.out.println("Veículo registrado para manutenção: " + veiculo.getPlaca());
    }

    public void realizarManutencao() {
        for (Veiculo veiculo : veiculosEmManutencao) {
            System.out.println("Realizando manutenção no veículo: " + veiculo.getPlaca());

        }
        veiculosEmManutencao.clear();
        System.out.println("Manutenção concluída para todos os veículos.");
    }


    public void listarClientes() {
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
        }
    }


    public void listarVeiculosEmManutencao() {
        System.out.println("Veículos em manutenção:");
        for (Veiculo veiculo : veiculosEmManutencao) {
            System.out.println("Placa: " + veiculo.getPlaca() + ", Modelo: " + veiculo.getModelo());
        }
    }
}

