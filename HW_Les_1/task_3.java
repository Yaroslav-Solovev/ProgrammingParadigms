package HW_Les_1;
// У вас есть массив, содержащий числа от 1 до N, где N - длина массива. 
// Одно из чисел в массиве повторяется дважды, а одно число пропущено. 
// Найдите повторяющееся число и пропущенное число. Пример: Входной массив: [2, 3, 1, 5, 3] 
// Повторяющееся число: 3 Пропущенное число: 4

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task_3 {
    public static void main(String[] args){
        List<Integer> arrayNumbers = Arrays.asList(2, 3, 1, 5, 3);
        Collections.sort(arrayNumbers); // 1. сортируем список по возрастанию
        //System.out.println("Отсортированный список " + arrayNumbers);
        int cost = 1;
        for(int i = 0; i < arrayNumbers.size(); i++){ // 2. проходим по всему списку, находим повторяющееся число
            if(arrayNumbers.get(i) == arrayNumbers.get(i+1)){
                System.out.println("Повторяющееся число " + arrayNumbers.get(i));
            } else{
                i++;
            }
        }

        for(int i = 0; i < arrayNumbers.size()-1; i++){ // 3. проходим по всему списку, находим пропущенное число
            if(arrayNumbers.get(i) != arrayNumbers.get(i+1) - cost){ 
                System.out.println("Пропущенное число " + (arrayNumbers.get(i) + cost));
            } else{
                i++;
            }
        }
    }
}
