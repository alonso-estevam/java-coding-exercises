package externalchallenges.algaworks.datetimeapi.des_23_09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.format.ResolverStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEventoSolucaoAlgaworks {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/uuuu")
            // esse estilo de resolução garante que o dia do mês seja válido para o ano-mês, rejeitando valores
            // inválidos como 30/02/2024, mas aceitando 29/02/2024, por exemplo (2024 é bissexto).
            // Para isso, importante trocar o yyyy por uuuu no ofPattern do DateTimeFormatter.
            .withResolverStyle(ResolverStyle.STRICT);
    private static final DateTimeFormatter FORMATADOR_HORARIO = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR_COMPLETO_BRASIL = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
            .withLocale(Locale.of("pt", "BR"));
//            .withLocale(Locale.FRENCH); // uma alternativa é passar um Locale pré-definido

    public static void main(String[] args) {

        LocalDate dataEvento = requisitarData("Data do evento: ");
        LocalTime horaEvento = requisitarHorario("Horário do evento: ");

        LocalDateTime dataHoraEvento = dataEvento.atTime(horaEvento);

        System.out.printf("Evento agendado para %s%n",
                dataHoraEvento.format(FORMATADOR_COMPLETO_BRASIL));
    }

    private static LocalDate requisitarData(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String dataTexto = ENTRADA.nextLine();

                return LocalDate.parse(dataTexto, FORMATADOR_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
    }

    private static LocalTime requisitarHorario(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String horarioTexto = ENTRADA.nextLine();

                return LocalTime.parse(horarioTexto, FORMATADOR_HORARIO);
            } catch (DateTimeParseException e) {
                System.out.println("Horário inválido. Tente novamente.");
            }
        }
    }
}
