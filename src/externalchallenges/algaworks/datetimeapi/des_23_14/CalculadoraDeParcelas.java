package externalchallenges.algaworks.datetimeapi.des_23_14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Conteúdo: Operações com objetos temporais

Desenvolva um programa que gera as datas de vencimento de parcelas. O programa deve solicitar
a data da primeira parcela (no padrão dd/MM/yyyy) e a quantidade de parcelas a serem geradas
(um número inteiro positivo). Cuidado com a diferença entre meses de 28, 29, 30 e 31 dias!
Exemplo:
    Data da primeira parcela: 12/10/2024
    Quantidade de parcelas: 3
    Resultado:
        Parcela #1 - 31/10/2024
        Parcela #2 - 30/11/2024
        Parcela #3 - 31/12/2024
 */
public class CalculadoraDeParcelas {

    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Data da primeira parcela: ");
        LocalDate dataPrimeiraParcela = LocalDate.parse(sc.next(), FORMATADOR_DATA);

        System.out.print("Quantidade de parcelas: ");
        int qtdParcelas = sc.nextInt();

        gerarParcelas(dataPrimeiraParcela, qtdParcelas);

        sc.close();

    }

    private static void gerarParcelas(LocalDate dataPrimeiraParcela, int qtdParcelas) {

        for (int i = 0; i < qtdParcelas; i++) {
            LocalDate dataProximaParcela = dataPrimeiraParcela.plusMonths(i);
            System.out.printf("Parcela #%d - %s%n",
                    i+1, dataProximaParcela.format(FORMATADOR_DATA));
        }
    }

    // Alternativa (e solução da Algaworks):
    // Método que retorna uma List<LocalDate> representando as datas das parcelas
    private static List<LocalDate> calcular(LocalDate dataPrimeiraParcela, int quantidadeParcelas) {
        List<LocalDate> datasParcelas = new ArrayList<>();

        for (int numeroParcela = 1; numeroParcela <= quantidadeParcelas; numeroParcela++) {
            LocalDate dataProximaParcela = dataPrimeiraParcela.plusMonths(numeroParcela - 1);
            datasParcelas.add(dataProximaParcela);
        }

        return datasParcelas;
    }

    // Método específico para imprimir as parcelas
    private static void imprimirParcelas(List<LocalDate> datasParcelas) {
        for (int i = 0; i < datasParcelas.size(); i++) {
            System.out.printf("Parcela #%d - %s%n", i+1,
                    datasParcelas.get(i).format(FORMATADOR_DATA));
        }
    }
}
