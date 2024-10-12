Wstęp do warsztatu DAO

Jak już wiesz, celem dzisiejszego warsztatu jest wytworzenie obiektowej warstwy dostępu do danych. W ramach warsztatu utworzymy klasę UserDao, dzięki której będziemy mogli wykonywać operacje na bazie danych. Dane będziemy przechowywać w bazie danych o nazwie workshop2 w tabeli o nazwie users.

Będzie ona w zawierała następujące kolumny:

+------------------+--------------+------+-----+---------+----------------+

| Field            | Type         | Null | Key | Default | Extra          |

+------------------+--------------+------+-----+---------+----------------+

| id               | int(11)      | NO   | PRI | NULL    | auto_increment |

| email            | varchar(255) | NO   | UNI | NULL    |                |

| username         | varchar(255) | NO   |     | NULL    |                |

| password         | varchar(60)  | NO   |     | NULL    |                |

+------------------+--------------+------+-----+---------+----------------+

Czego nauczysz się podczas tego warsztatu?

Warsztat w formie wykonania jednego dużego zadania jakim jest przygotowanie jednego większego programu na pewno daje duży zastrzyk praktycznej wiedzy i pozwala na szybsze i bardziej pewne poruszanie się w kodzie Javy, czy programie IntelliJ. Połączymy jednocześnie wiedzę z zakresu OOP oraz MySQL.

Wytworzymy możliwy do ponownego wykorzystania kod, przetestujemy wywołując poszczególne metody klasy UserDao i weryfikując czy odniosły pożądany skutek w bazie danych.

W projekcie tym użyto praktycznie wszystkie rzeczy, o których mówiliśmy podczas tego modułu takie jak:

    klasy,
    obiekty,
    wczytywanie danych za pomocą SQL,
    usuwanie danych za pomocą SQL,
    zmiana danych za pomocą SQL.

Wszystko to będzie możliwe do zastosowania w tym projekcie! To na pewno ugruntuje Twoją wiedzę.
Jak zacząć pracę z tym projektem?

Na początek stwórz nowe repozytorium! Szczegółowy opis tego jak to zrobić, znajduje się w temacie Przygotowanie repozytorium na GitHub. Po wykonaniu czynności tam opisanych, wróć do tego artykułu.

W pierwszej kolejności utwórz bazę danych, a następnie przygotuj sobie wszystkie niezbędne zapytania:

    dodawanie użytkownika,
    zmiana danych,
    pobieranie po id,
    usuwanie po id,
    pobieranie wszystkich użytkowników.

Rozpocznij pracę od utworzenia klasy DbUtil, która będzie odpowiedzialna za utworzenie połączenia do bazy. Następnie zgodnie z kolejnymi artykułami utwórz klasy User oraz UserDao i sukcesywnie uzupełniaj ją o kolejne metody.
