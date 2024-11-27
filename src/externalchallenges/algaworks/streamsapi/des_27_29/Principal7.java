package externalchallenges.algaworks.streamsapi.des_27_29;

import externalchallenges.algaworks.streamsapi.des_27_29.comercial.Cliente;
import externalchallenges.algaworks.streamsapi.des_27_29.comercial.ServicoDeVenda;
import externalchallenges.algaworks.streamsapi.des_27_29.comercial.Venda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal7 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        Map<String, Long> vendasRealizadasPorCliente = new HashMap<>();
//
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                String nomeCliente = venda.getCliente().nome();
//                Long quantidadeVendas = vendasRealizadasPorCliente.get(nomeCliente);
//                if (quantidadeVendas == null) {
//                    quantidadeVendas = 0L;
//                }
//
//                vendasRealizadasPorCliente.put(nomeCliente, quantidadeVendas + 1);
//            }
//        }
//
//        System.out.println(vendasRealizadasPorCliente);

        Map<String, Long> vendasPorCliente = vendas.stream()
                .filter(Venda::isFechada)
                .collect(Collectors.groupingBy(venda -> venda.getCliente().nome(),
                        Collectors.counting()));

        System.out.println(vendasPorCliente);
    }

}
