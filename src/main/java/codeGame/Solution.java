package codeGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Solution {
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return (int) Arrays.stream(names).filter(x -> x.length() > 5).count();
    }

    public static List<String> transformPrev(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static void createStreamByIterate() {
        Stream<Integer> intStream = Stream.iterate(100, n -> n + 1).limit(10);
        intStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        String[] example = {"sqweta", "asd", "asdzxcv", "as"};
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive(example));
    }
}
