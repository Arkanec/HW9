public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxPayment = -1;
        for(int i = 0; i <arr.length; i++) {
            if (arr[i] > maxPayment) {
                maxPayment = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день состовляет " + maxPayment + " рублей");
        int minPayment = 200001;
        for(int e = 0; e <arr.length; e++) {
            if (arr[e] < minPayment) {
                minPayment = arr[e];
            }
        }
        System.out.println("Минимальная сумма трат за день состовляет " + minPayment + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int medium = 0;
        for (int element : arr) {
            sum += element;
            medium = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + medium + " рублей");
    }
}