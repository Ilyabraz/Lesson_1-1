/* Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
Пример ввода:
1 2 1 2 -1 1 3 1 3 -1 0
Логика расчета:
2 -1 переход -> 2 в сумму
3 -1 переход -> 3 в сумму
Пример вывода: 5 */

package les1;

import java.util.ArrayList;

public class App2
{
    public static void main( String[] args) {
        int sequence[] = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        ArrayList<Integer> positiveNums = new ArrayList<Integer>();

        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] > 0 && sequence[i + 1] < 0) {
                positiveNums.add(sequence[i]);
            }
        }

        if (positiveNums.isEmpty()) {
            System.out.println("В последовательности нет положительных чисел, после которых следует отрицательное число.");
        } else {
            int sum = 0;
            System.out.println("Положительные числа, после которых следует отрицательное число: ");
            for (int num : positiveNums) {
                System.out.print(num + " ");
                sum += num;
            }
            System.out.println("\nСумма найденных чисел: " + sum);
        }
    }
}
