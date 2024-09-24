package org.example.task1;
import java.io.*;
import java.util.*;
import java.util.regex.*;

//4)	Написать регулярное выражение, определяющее является ли данная строчка шестнадцатиричным идентификатором цвета в HTML.
// Где #FFFFFF для белого, #000000 для черного, #FF0000 для красного и т.д.
//– пример правильных выражений: #FFFFFF, #FF3421, #00ff00.
//– пример неправильных выражений: 232323, f#fddee, #fd2.

public class task1
{
    public static void main(String[] args) throws IOException
    {
                Scanner scanner = new Scanner(System.in);
                String inputData = scanner.nextLine();
                Pattern pattern = Pattern.compile("^#[\\d|abcdefABCDEF]{6}$");
                Matcher matcher = pattern.matcher(inputData);
                if (matcher.matches())
                    System.out.println("Выражение правильное");
                else
                    System.out.println(("Выражение неверно"));

    }
}
