package com.gorkemsavran;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiksturCreator {

    public List<List<String>> createFikstur(final List<String> teams) {
        if (teams.size() % 2 == 1) {
            teams.add("Bay");
        }
        List<List<String>> fikstur = new ArrayList<>();
        String team1 = teams.remove(0);
        for (int i = 0; i < teams.size(); i++) {
            List<String> teamsCopy = new ArrayList<>(teams);

            List<String> week = new ArrayList<>();
            List<String> weekReverse = new ArrayList<>();

            teamsCopy.add(team1);
            while (!teamsCopy.isEmpty()) {
                String t1 = teamsCopy.remove(0);
                String t2 = teamsCopy.remove(0);
                week.add(t1 + " vs " + t2);
                weekReverse.add(t2 + " vs " + t1);
            }

            fikstur.add(week);
            fikstur.add(weekReverse);
            teams.add(teams.remove(0));
        }
        return fikstur;
    }

}
