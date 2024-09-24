package org.example.task1;
import java.io.IOException;
import java.util.*;
import java.io.*;

//6. Пусть дан список сотрудников: Иван
//Светлана
//Анна
//Анна
//Иван
//Иван
//Петр
//Иван
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

public class task3
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader("text.txt");
        Scanner scanner = new Scanner(fileReader);
        HashMap<String, Integer> countNames = new HashMap<>();
        while (scanner.hasNextLine())
        {
            String currentName= scanner.nextLine();
            if (countNames.containsKey(currentName))
                countNames.put(currentName, (countNames.get(currentName) + 1));
            else
                countNames.put(currentName, (int) 1);
        }

        System.out.print(countNames);
    }
}
