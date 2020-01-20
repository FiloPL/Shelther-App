package com.filopl.shelter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Program konsolowy.
//         • Schronisko ma mieć określoną ilość miejsc.
//         • Możliwość dodania/usunięcia zwierzaka do/z listy zwierząt w schronisku
//         (na razie lista nie musi być zapisywana do żadnej bazy danych, ani pliku tekstowego).
//         • Po wpisaniu „status” program ma wypisać aktualną listę zwierząt i wyrzucić komunikat,
//         czy ilość zwierząt powoduje, że schronisko ma jeszcze miejsce, jest pełne lub jest przepełnione.
//         • Zaimplementuj logikę, która uniemożliwia dodanie zwierzaka,jeśli schronisko jest pełne.
//         • Zamiast programu konsolowego mamy proste UI
//         • Lista zwierząt jest zapisywana do pliku tekstowego lub bazy danych.
//         • Po wyłączeniu programu i ponownym odpaleniu ma zostać załadowany ostatni stan z bazy/pliku.
//         • Gdy schronisko ma mniej niż 5 wolnych miejsc wysyłany jest email
//         informacyjny do osób pracujących w schronisku.
//         • Możliwość edycji poszczególnych zwierząt. Dodanie pól takich jak np. stan zdrowia, płeć
//         • Udostępnienie webserwisu, przez który można wyczytać aktualny status schroniska.
//         • Aplikacja mobilna (na dowolny system operacyjny), która korzysta z powyższego webserwisu.
//         • Zamiast aplikacji mobilnej może być to też strona www. Ważne by pobierała dane korzystając z napisanego przez nas webserwisu. Co można jeszcze dodać?
//         • Testy jednostkowe, które pokrywają najważniejszą funkcjonalność (nie martw się jeśli jeszcze nie znasz niektórych pojęć jak np. „testy jednostkowe”. Zostaną one później krótko omówione). • Eksport statusu schroniska do pliku .csv. • Generowanie dziennego raportu ze stanu schroniska do pliku .pdf, który zostanie wysłany na określonego maila oraz dodany do jakiegoś archiwum. • Możliwość dodawania zdjęć określonego zwierzaka przez aplikację mobilną (wymaga rozszerzenia webserwisu oraz aplikacji mobilnej).
@SpringBootApplication(scanBasePackages="com.filopl.shelter")
public class ShelterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShelterApplication.class, args);
    }

}
