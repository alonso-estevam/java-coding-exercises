package externalchallenges.algaworks.streamsapi.des_27_29;

import externalchallenges.algaworks.streamsapi.des_27_29.comercial.ServicoDeVenda;
import externalchallenges.algaworks.streamsapi.des_27_29.comercial.Venda;

import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                System.out.println(venda);
//            }
//        }
        vendas.stream()
                .filter(Venda::isFechada)
                .forEach(System.out::println);
    }
}
