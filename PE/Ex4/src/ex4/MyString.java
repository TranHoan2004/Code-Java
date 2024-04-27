/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

import ex4.Ex4.IString;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public class MyString implements IString{
    public boolean checkPrimeDigits(int n) {
        if (n<2) {
            return false;
        }
        for (int i=2;i<Math.sqrt(n);i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int f1(String str) {
        int sum=0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (checkPrimeDigits(num)) {
                    sum+=num;
                }                    
            }
        }
        return sum;
    }

    @Override
    public String f2(String str) {
        int count=0;
        String[] words = str.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        int maxCount = 0;
        String mostFrequentWord = "";
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            if (wordCount.get(word) > maxCount) {
                maxCount = wordCount.get(word);
                mostFrequentWord = word;
            }
        }
        String newStr=str.replace(mostFrequentWord, "T");
        System.out.println(newStr);
        return newStr;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
