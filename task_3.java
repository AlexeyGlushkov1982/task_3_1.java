package seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * task_3
 */
public class task_3 {

    Object object = new Object();

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println();

        for (int i = 0; i < 10; i++) {
            integers.add(new Random().nextInt(50));
        }
        System.out.println(integers);
        System.out.println("Максимальное значение: " + Collections.max(integers));
        System.out.println("Минимальное значение: " + Collections.min(integers));
        double i = 0;
        double summ = 0;
        double result = 0;

        for (double count : integers) {
            i++;
            summ += count;
        }
        System.out.println(i);
        System.out.println(summ);
        result = summ / i;
        System.out.println("Среднее арифметическое: " + result);
        ListIterator<Integer> it = integers.listIterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) { // удалить четные элементы
                it.remove();
            }
        }
        System.out.println("Удалили четные элементы: " + integers);
    }
}