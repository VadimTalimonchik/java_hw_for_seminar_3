// Задача 2.
// Пусть дан произвольный список целых чисел, удалить из него чётные числа.

import java.util.ArrayList;
public class hw_2 {
    public static void main(String[] args) {
        System.out.print("\nСгенерированный список: ");
        ArrayList<Integer> array = new ArrayList<>();
        array = randomArr.FillRandomArray(10);
        randomArr.PrintArray(array);
        DeleteEvenNumber(array);
        randomArr.PrintArray(array);
    }
    public static void DeleteEvenNumber(ArrayList<Integer> list) {
        System.out.print("\nСписок с удалёнными чётными числами: ");
        int i = 0;
        while (i < list.size()) {
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
}
