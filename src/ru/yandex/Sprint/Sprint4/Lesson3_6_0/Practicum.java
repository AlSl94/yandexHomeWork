package ru.yandex.Sprint.Sprint4.Lesson3_6_0;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Practicum {
    public static void main(String[] args) {

        Comparator<Ticket> comparator = new Comparator<>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o1.priceInUsd - o2.priceInUsd;
            }
        };
        Set<Ticket> tickets = new TreeSet<>(comparator);
        fillTickets(tickets);

        System.out.println("Доступные билеты: ");
        for (Ticket ticket : tickets) {
            System.out.println("  * " + ticket);
        }
    }

    private static void fillTickets(Set<Ticket> tickets) {
        tickets.add(new Ticket("Лондон", "Париж", 376));
        tickets.add(new Ticket("Милан", "Москва", 298));
        tickets.add(new Ticket("Берлин", "Бостон", 1273));
        tickets.add(new Ticket("Пекин", "Рим", 846));
        tickets.add(new Ticket("Санкт-Петербург", "Афины", 284));
        tickets.add(new Ticket("Сидней", "Токио", 1738));
        tickets.add(new Ticket("Мюнхен", "Дубай", 974));
    }

    public static class Ticket implements Comparable<Ticket> { // Второй вариант решения задачи
        public String from;
        public String to;
        public int priceInUsd;

        public Ticket(String from, String to, int timesListened) {
            this.from = from;
            this.to = to;
            this.priceInUsd = timesListened;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ticket ticket = (Ticket) o;

            if (priceInUsd != ticket.priceInUsd) return false;
            if (!from.equals(ticket.from)) return false;
            if (!to.equals(ticket.to)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = from.hashCode();
            result = 31 * result + to.hashCode();
            result = 31 * result + priceInUsd;
            return result;
        }

        @Override
        public String toString() {
            return "Ticket{from=" + from + ", to=" + to + ", priceInUsd=" + priceInUsd + '}';
        }

        @Override
        public int compareTo(Ticket o) { // Оверрайд метода для второго варианта решения задачи
            return o.priceInUsd - this.priceInUsd;
        }
    }
}