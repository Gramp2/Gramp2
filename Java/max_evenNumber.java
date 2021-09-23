/*Требования:
Программа должна считывать числа c клавиатуры.
Программа должна выводить число на экран.
Программа должна выводить на экран максимальное четное из введенных целых чисел.
Если введено несколько максимальных четных чисел, необходимо вывести любое.
Если среди введенных символов нет четного числа или введен только один не числовой символ, то вывести на экран минимальное значение числа типа int.
Считывать данные с клавиатуры необходимо в цикле while.*/

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int number;
        while(scanner.hasNextInt()){
            number = scanner.nextInt();
            if((number%2 == 0) && (number > max))
                max = number;
        }
        System.out.println(max);
    }
}
