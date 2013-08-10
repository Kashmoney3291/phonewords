package com.clbs;

import com.clbs.dict.concrete.FileWordListDictionary;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        final String DICTIONARY_FILE = "dictionary.txt";

        // gets the current working dir
        String cwd = System.getProperty("user.dir");
        File dictFile = new File(cwd, DICTIONARY_FILE);
        try {
            FileWordListDictionary dict = new FileWordListDictionary(dictFile.getPath());
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
