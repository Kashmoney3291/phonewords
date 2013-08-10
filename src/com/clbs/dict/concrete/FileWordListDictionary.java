package com.clbs.dict.concrete;

import com.clbs.dict.IEnglishDictionary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: clbs
 * Date: 8/9/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileWordListDictionary implements IEnglishDictionary {
    private final HashSet<String> dictionary;
    /**
     * Constructs a dictionary object that it builds from a list of words
     * in a flat file from the provided file path.
     * The file should be in a one word per line format.
     */
    public FileWordListDictionary(String filePath) throws IOException {

        dictionary = new HashSet<String>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            String line = br.readLine();

            while(line != null) {
                dictionary.add(line);
                line = br.readLine();
            }
        }
        finally {
            br.close();
        }
    }

    /**
     * Determines whether or not a given string is a word.
     * @param str The string to test whether or not it is a word.
     * @return True if the provided string is a word; otherwise false.
     */
    public boolean isWord(String str) {
        return dictionary.contains(str);
    }
}
