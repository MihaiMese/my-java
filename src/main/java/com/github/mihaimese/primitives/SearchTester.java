package com.github.mihaimese.primitives;

import com.github.mihaimese.models.Book;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SearchTester {

    private static final List<Book> items = new ArrayList<>();
    private static final List<String> FIRST_NAMES = List.of(
            "John", "Alfred", "Frank", "Bill", "Andrea", "Faye", "Julia", "Jack", "Amanda", "Stephen",
            "Jean-Pierre", "Gabriel", "George", "Michael", "Anne", "Valeria", "Guido", "Oswald", "Peter", "Agatha");
    private static final List<String> LAST_NAMES = List.of(
            "Doe", "Billings", "Everhart", "Murray", "Michaels", "Hicks", "Urma", "Valjean", "Johnson", "King",
            "McQueen", "Toussaud", "Curie", "Bernoulli", "Hudson", "Franks", "Christie", "Walker", "Ramirez", "Cooper");
    private static final Random randomizer = new Random();

    public static void main(String[] args) {
        System.out.println(FIRST_NAMES.size());
        System.out.println(LAST_NAMES.size());
        System.out.println(FIRST_NAMES.get(randomizer.nextInt(FIRST_NAMES.size())) + " " +
                LAST_NAMES.get(randomizer.nextInt(LAST_NAMES.size())));
    }

    private static void initList() {
        var start = Instant.now();
        for (int i = 1; i <= 1000; i++) {
            items.add(new Book("John Doe", "Whatever", 1971, "history"));
            items.add(new Book("Alfred Billings", "Ethiopia", 2001, "fiction"));
            items.add(new Book("Frankie Everhart", "Name 2", 2000, "history"));
            items.add(new Book("Bill Murray", "Now and forever", 1970, "theatre"));
            items.add(new Book("Amanda Hicks", "1900", 1953, "fiction"));
            items.add(new Book("Faye Michaels", "Who else?", 1988, "history"));
            items.add(new Book("Gabriel Urma", "I have nothing else to say", 1801, "fiction"));
            items.add(new Book("Jean-Pierre Valjean", "Words", 1993, "fiction"));
        }
        var end = Instant.now();
        System.out.printf("Populating list took %3d nanoseconds%n", Duration.between(start, end).toNanos());
    }

    private static String generateRandomName() {
        return pickRandomString(FIRST_NAMES) + " " + pickRandomString(LAST_NAMES);
    }

    private static String pickRandomString(List<String> input) {
        return input.get(randomizer.nextInt(input.size()));
    }
}
