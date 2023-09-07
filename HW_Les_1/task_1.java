package HW_Les_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task_1{
    
    public static void main(String[] args){
        
        // - 1. Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
        // сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.
        Integer[] arrayNumbers3 = {15, 2, -4, 26, 0, 7};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayNumbers3.length-1; i++) {
                if(arrayNumbers3[i] < arrayNumbers3[i+1]){
                    isSorted = false;
 
                    buf = arrayNumbers3[i];
                    arrayNumbers3[i] = arrayNumbers3[i+1];
                    arrayNumbers3[i+1] = buf;
                }
            }
        }
        System.out.println("Императивный стиль" + Arrays.toString(arrayNumbers3));

        // - 2. Написать точно такую же процедуру, но в декларативном стиле
        List<Integer> arrayNumbers2 = Arrays.asList(15, 2, -4, 26, 0, 7);
        Collections.sort(arrayNumbers2, Collections.reverseOrder());
        System.out.println("Декларативный стиль" + arrayNumbers2);
    }
} 