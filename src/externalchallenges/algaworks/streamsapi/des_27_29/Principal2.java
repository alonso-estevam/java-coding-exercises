package externalchallenges.algaworks.streamsapi.des_27_29;

import externalchallenges.algaworks.streamsapi.des_27_29.comercial.Cliente;
import externalchallenges.algaworks.streamsapi.des_27_29.comercial.ServicoDeVenda;
import externalchallenges.algaworks.streamsapi.des_27_29.comercial.Venda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal2 {
// TODO: Refatorar - imprimir clientes distintos (com vendas fechadas) e ordenados pelo nome
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();
/*
        List<Cliente> clientes = new ArrayList<>();
        for (Venda venda : vendas) {
            if (venda.isFechada() && !clientes.contains(venda.getCliente())) {
                clientes.add(venda.getCliente());
            }
        }
        clientes.sort(Comparator.comparing(Cliente::nome));

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
 */
        vendas.stream()
                .map(Venda::getCliente)
                .map(Cliente::nome)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

}
