package com.gorkemsavran;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        List<String> teams = new ArrayList<>();
        boolean printing = true;
        while (printing) {
            System.out.print("Takım giriniz (fikstürü yaratmak için 0): ");
            String input = scanner.next();
            if (input.equals("0")) {
                printFikstur(teams);
                printing = false;
            } else {
                teams.add(input);
            }
        }
    }

    private static void printFikstur(final List<String> teams) {

        FiksturCreator fiksturCreator = new FiksturCreator();
        List<List<String>> fikstur = fiksturCreator.createFikstur(teams);
        for (int i = 0; i < fikstur.size(); i++) {
            System.out.println("ROUND " + (i + 1));
            for (final String match : fikstur.get(i)) {
                System.out.println(match);
            }
        }
    }
}
