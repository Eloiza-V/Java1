package org.example.task1;
import java.util.Scanner;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class task4 {
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        ArrayList <String> words = new ArrayList<>(List.of(inputData.split(" ")));
        ArrayList <StringBuilder> wordsStringBuilder = new ArrayList<>();
        for (Integer i = 0; i < words.size(); i++)
            wordsStringBuilder.add(new StringBuilder(words.get(i)));
        for (Integer i = 0; i < wordsStringBuilder.size(); i++)
            if (wordsStringBuilder.get(i).charAt(0)=='А')
                wordsStringBuilder.set(i, new StringBuilder("а" + wordsStringBuilder.get(i).substring(1).toString()));
        Integer count = 0;
        for (Integer i = 0; i < wordsStringBuilder.size(); i++)
            if (wordsStringBuilder.get(i).charAt(0) == 'а')
                count++;
        System.out.println(count);

    }
}
