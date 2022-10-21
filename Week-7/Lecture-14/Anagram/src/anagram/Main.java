package anagram;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        AnagramFinderSet af = new AnagramFinderSet();
        af.add("bird");
        af.add("drib");

        af.add("and");
        af.add("nad");
        af.add("dan");

        af.add("it");

        System.out.println(af);

        System.out.println(af.anagramsOf("and"));
        System.out.println(af.anagramsOf("it"));
        System.out.println(af.anagramsOf("boo"));

        AnagramFinderSet af2 = new AnagramFinderSet();
        
        try {
            af2.addFromFile(new File("Lecture-13/support/words.txt"));
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        System.out.println(af2.mostAnagrams());
    }
}