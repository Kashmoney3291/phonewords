package com.clbs;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: clbs
 * Date: 8/9/13
 * Time: 9:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneUtils {
    private static final HashMap<Character, String> digitMap = new HashMap<Character, String>(){
        {
            put('1', ""); put('2', "abc"); put('3', "def"); put('4', "ghi"); put('5', "jkl");
            put('6', "mno"); put('7', "pqrs"); put('8', "tuv"); put('9', "wxyz"); put('0', "");
        }

    };
}
