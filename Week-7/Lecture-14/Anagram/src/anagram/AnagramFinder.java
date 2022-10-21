package anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFinder {
    private final Map<String, List<String>> anagrams;

    public AnagramFinder() {
        this.anagrams = new HashMap<>();
    }
    
    private static String alphabetized(String word) {
        char[] a = word.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

    public void add(String word) {
        String alphabetizedWord = alphabetized(word);

        List<String> wordList = this.anagrams.getOrDefault(alphabetizedWord, null);

        if (wordList != null) {
            wordList.add(word);
        } else {
            this.anagrams.put(alphabetizedWord, new ArrayList<>(Arrays.asList(word)));
        }
    }

    // Or you can write add in the following way:
    // public void add(String word) {
    //     String key = alphabetized(word);
        
    //     if (!anagrams.containsKey(key)) {
    //         List<String> l = new ArrayList<String>();
    //         l.add(word);
    //         anagrams.put(key, l);
    //     } else {
    //         List<String> l = anagrams.get(key);
    //         l.add(word);            
    //     }
    // }
    
    // Or you could deal with the not-in-map problem first, and unify things otherwise:
    // public void add(String word) {
    //     String key = alphabetized(word);
    //     if (!anagrams.containsKey(key)) {
    //         anagrams.put(key, new ArrayList<>());
    //     }
        
    //     anagrams.get(key).add(word);  
    // }

    @Override
    public String toString() {
        return "AnagramFinder [anagrams=" + anagrams + "]";
    }
}
