package HW_Les_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//У вас есть массив целых чисел, в котором каждое число, кроме одного, повторяется дважды. 
//Вам нужно найти это одиночное число. Пример: Входной массив: [4, 3, 2, 4, 1, 3, 2] Результат: 1
//В данной задаче вы должны найти способ найти одиночное число с использованием массивов и алгоритмов.
public class task_2 {
    public static void main(String[] args){
        List<Integer> arrayNumbers = Arrays.asList(4, 3, 2, 4, 1, 3, 2);
        Collections.sort(arrayNumbers); // 1. сортируем список по возрастанию
        //System.out.println("Отсортированный список " + arrayNumbers);
        for(int i = 0; i < arrayNumbers.size(); i++){ // 2. проходим по всему списку, отбрасывая парные значения
            if(arrayNumbers.get(i) == arrayNumbers.get(i+1)){
                i++;
            } else{
                System.out.println("Одиночное число " + arrayNumbers.get(i));
            }
        }
    }
}
