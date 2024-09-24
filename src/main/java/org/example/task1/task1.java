package org.example.task1;
import java.io.*;
import java.util.*;

public class task1
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader("C:\\Users\\Элоиза\\Desktop\\5 семестр\\оояис\\Java1\\text.txt");
        Scanner scanner = new Scanner(fileReader);
        LinkedList <Character> digits = new LinkedList<>();
        int code;
        while ((code = fileReader.read())!=-1)
        {
            char symbol = (char) code;
            if (!Character.isDigit(symbol))
                System.out.print(symbol);
            else
                digits.addLast(symbol);
        }
        System.out.println("");
        while (!digits.isEmpty())
            System.out.print(digits.poll());


    }
}
