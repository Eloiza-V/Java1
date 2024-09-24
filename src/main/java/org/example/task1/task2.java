package org.example.task1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

//1. Задан список целых чисел и число X. Не используя вспомогательных объектов и не изменяя размера списка,
// переставить элементы списка так, чтобы сначала шли числа, не превосходящие X, а затем числа, больше X.
public class task2
{
    public static void main(String[] args) throws IOException
    {
        int[] arr = {3, 8, 5, 1, 7, 9, 2}; // Пример массива
        int X = 5; // Заданное число X

        int left = 0;  // Указатель на левую часть массива
        int right = arr.length - 1;  // Указатель на правую часть массива

        while (left < right)
        {

            while (left < arr.length && arr[left] <= X)
            {
                left++;
            }
            // Двигаем правый указатель влево, пока не найдем элемент, меньший или равный X
            while (right >= 0 && arr[right] > X)
            {
                right--;
            }

            if (left < right) {
                // Обмен значений
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
