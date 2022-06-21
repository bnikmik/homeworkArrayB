public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        // Задание №1
        double sumExpenses = 0;
        for (double i : arr) {
            sumExpenses += i;
        }
        System.out.println("Задание №1");
        System.out.println("Сумма трат за месяц составила " + sumExpenses + " рублей.");
        System.out.println(" ");

        // Задание №2
        int maxDailyExpenses = 99_999;
        int minDailyExpenses = 200_001;

        for (int i : arr) {
            if (i > maxDailyExpenses) {
                maxDailyExpenses = i;
            }
            if (i < minDailyExpenses) {
                minDailyExpenses = i;
            }
        }
        System.out.println("Задание №2");
        System.out.println("Минимальная сумма трат за день составила "+ minDailyExpenses + " рублей. Максимальная сумма трат за день составила " + maxDailyExpenses + " рублей»." );
        System.out.println(" ");

        //Задание №3
        double averageDailyExpenses = sumExpenses / arr.length;
        System.out.println("Задание №3");
        System.out.println("Средняя сумма трат за месяц составила " + averageDailyExpenses +  " рублей");
        System.out.println(" ");

        //Задание №4
        System.out.println("Задание №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        return arr;
    }
}