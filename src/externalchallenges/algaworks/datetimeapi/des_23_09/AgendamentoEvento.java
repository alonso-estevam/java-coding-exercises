package externalchallenges.algaworks.datetimeapi.des_23_09;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/*
  Conteúdo: LocalDate, LocalTime e LocalDateTime

  Desenvolva um programa que simula o agendamento de eventos. Ao ser executado, o programa
  deve pedir a data do evento (com o input no padrão dd/MM/yyyy). Se o usuário inserir uma
  data que não existe (como 30/30/2024), o programa deve retornar a mensagem "Data inválida.
  Tente novamente." e solicitar de novo a data do evento. Em seguida, o programa deve pedir
  o horário do evento (formato HH:mm), também validando se o horário é válido, e ao final
  deve exibir a mensagem no padrão: "Evento agendado para domingo, 25 de dezembro de 2022".
 */
public class AgendamentoEvento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Data do evento: ");
        LocalDate data = obterDataAPartirDeString(sc.next());

        System.out.print("Horário do evento: ");
        LocalTime horario = obterHorarioAPartirDeString((sc.next()));


        System.out.println(obterMensagemDataHoraFormatada(data, horario));

        sc.close();
    }

    private static LocalDate obterDataAPartirDeString(String dataTexto) {

        return LocalDate.parse(dataTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private static LocalTime obterHorarioAPartirDeString(String horarioTexto) {

        return LocalTime.parse(horarioTexto, DateTimeFormatter.ofPattern("HH:mm"));
    }

    private static String obterMensagemDataHoraFormatada(LocalDate data, LocalTime horario) {

        return String.format("Evento agendado para %s %s",
                data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)),
                horario.format(DateTimeFormatter.ofPattern("HH:mm")));
    }
}
