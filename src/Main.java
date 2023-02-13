import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;


        double[] doubleNumbers = {1.57, 7.654, 9.986};


        int[] arbitraryArray = new int[5];
        for (int i = 0; i < arbitraryArray.length; i++) {
            arbitraryArray[i] = i;
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[2]);
        System.out.println();


        double[] doubleNumbers = {1.57, 7.654, 9.986};
        System.out.print(doubleNumbers[0] + ", ");
        System.out.print(doubleNumbers[1] + ", ");
        System.out.print(doubleNumbers[2]);
        System.out.println();


        int[] arbitraryArray = new int[5];
        for (int i = 0; i < arbitraryArray.length; i++) {
            arbitraryArray[i] = i;
            if (i < arbitraryArray.length - 1) {
                System.out.print(arbitraryArray[i] + ", ");
            } else {
                System.out.print(arbitraryArray[i]);
            }
        }


        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[0]);
        System.out.println();


        double[] doubleNumbers = {1.57, 7.654, 9.986};
        System.out.print(doubleNumbers[2] + ", ");
        System.out.print(doubleNumbers[1] + ", ");
        System.out.print(doubleNumbers[0]);
        System.out.println();


        int[] arbitraryArray = new int[5];
        for (int i = arbitraryArray.length - 1; i > -1; i--) {
            arbitraryArray[i] = i;
            if (i > 0) {
                System.out.print(arbitraryArray[i] + ", ");
            } else {
                System.out.print(arbitraryArray[i]);
            }
        }


        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 > 0){
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}