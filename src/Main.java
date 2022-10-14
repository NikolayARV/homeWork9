

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] expenses = new int[30];
        expenses[0] = 100000;
        for (int i = 1; i < expenses.length; i++) {
            expenses[i] = expenses[i-1] + 3000;
        }
        int sum = 0;
        for (int expens : expenses) {
            sum += expens;
        }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание 2");
        int min = expenses[25];
        int max = 0;
        for (int expens : expenses) {
            if (min > expens) {
                min = expens;
            }
            if (max < expens)
                max = expens;
        }
                System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Задание 3");
        System.out.println("Средняя сумма трат за месяц составила " + sum / expenses.length + " рублей");
        System.out.println("Задание 4"); // Ivanovich
        char[] reverseFullName = {'h', 'c', 'i', 'v', 'o', 'n', 'a', 'v', 'I', ' ', 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--)
        {
            System.out.print(reverseFullName[i]);
        }


    }

        }





