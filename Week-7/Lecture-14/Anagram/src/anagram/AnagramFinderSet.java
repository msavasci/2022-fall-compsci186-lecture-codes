package anagram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AnagramFinderSet {
    private final Map<String, Set<String>> anagrams;

    public AnagramFinderSet() {
        this.anagrams = new HashMap<>();
    }
    
    public void add(String word) {
        String alphabetizedWord = alphabetized(word);

        Set<String> wordList = this.anagrams.getOrDefault(alphabetizedWord, null);

        if (wordList != null) {
            wordList.add(word);
        } else {
            this.anagrams.put(alphabetizedWord, new HashSet<>(Arrays.asList(word)));
        }
    }

    @Override
    public String toString() {
        return "AnagramFinder [anagrams=" + anagrams + "]";
    }

    public static String alphabetized(String word) {
        char[] a = word.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

    public Set<String> anagramsOf(String word) {
        return this.anagrams.getOrDefault(alphabetized(word), new HashSet<String>());
    }

    public void addFromFile(File f) throws FileNotFoundException {
        Scanner s = new Scanner(f);

        while (s.hasNext()) {
            add(s.next());
        }

        s.close();
    }

    public Set<String> mostAnagrams() {
        int maxLength = -1;
        Set<String> mostAnagrams = new HashSet<>();

        for (Set<String> s: this.anagrams.values()) {
            if (s.size() > maxLength) {
                maxLength = s.size();
                mostAnagrams = s;
            }
        }

        return mostAnagrams;
    }
}
