import java.time.LocalDate;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 1992;
        printIsLeapYears(year);
        System.out.println();

        System.out.println("Задание 2");
        String name = "iOS";
        int year1 = 2020;
        System.out.println(checkOs(name) + getClientOs(year1) + "\n");

        System.out.println("Задание 3");
        int deliveryDistance = 110;
        System.out.println("Производим расчет доставки: " + printMessengerOfDelivery(deliveryDistance) + "\n");

        System.out.println("Задание 4");
        int [] arr = {3, 2, 1, 6, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr) +"\n");

        System.out.println("Задание 5");
        String abc = "asaaddgh";
        searchDuplicates(abc);

    }

    public static boolean printIsLeapYears(int year) {
        boolean leapYears = isLeapYears(year);
        printYearsCheck(year, leapYears);
        return leapYears;
    }

    private static boolean isLeapYears(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printYearsCheck(int year, boolean leapYears) {
        if (leapYears) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }

    public static String checkOs(String name) {
        if (name.equals("iOS")) {
            return "Ваша ОС - iOS.  ";
        } else {
            return "Ваша ОС - Android.  ";
        }
    }

    public static String getClientOs(int year1) {
        int currentYear = LocalDate.now().getYear();
        if (year1 >= currentYear) {
            return "Вам доступна последняя версия приложения";
        } else {
            return "Вам доступна lite-версия приложения";
        }
    }

    public static String printMessengerOfDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return "Потребуется 1 день.";
        } else if (deliveryDistance < 60) {
            return "Потребуется 2 дня.";
        } else if (deliveryDistance <= 100) {
            return "Потребуется 3 дня.";
        } else {
            return "Извините, доставка невозможна.";
        }
    }


    public static void reverseArray(int [] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void searchDuplicates (String abc) {
        char[] abc1 = abc.toCharArray();
        for (int i = 0; i < abc.length(); i++) {
            for (int j = i + 1; j < abc1.length; j++) {
                if (abc1[i] == abc1[j]) {
                    System.out.println("Найден дубль - " + abc1[j]);
                    return;
                }
            }
        }
        System.out.println("Дублей не найдено");
    }
}
