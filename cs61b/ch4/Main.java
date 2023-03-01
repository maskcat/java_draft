package cs61b.ch4;


import edu.princeton.cs.algs4.In;

import java.util.*;

/**
 * @author fymas
 */
public class Main {
    public static List<String> getWords(String inputFileName) {
        In in = new In(inputFileName);
        List<String> words = new ArrayList<>();
        while (!in.isEmpty()) {
            words.add(in.readString());
        }
        return words;
    }

    public static int countUniqueWords(List<String> words) {
        HashSet<String> counts = new HashSet<>(words);
        return counts.size();
    }

    public static Map<String, Integer> collectWordCount(List<String> targets, List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>(16);
        for (String target : targets) {
            wordCount.put(target, 0);
        }
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }
        return wordCount;
    }

    public static void main(String[] args) {
        String fileName = "cs61b/ch4/words.txt";
        List<String> words = getWords(fileName);
        int count = countUniqueWords(words);
        System.out.println(count);
        List<String> targets = new ArrayList<>();
        targets.add("a");
        targets.add("peach");
        Map<String,Integer> wordsCount = collectWordCount(targets,words);
        System.out.println(wordsCount);
    }
}
