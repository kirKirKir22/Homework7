public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        System.out.println("Задача 1");

        double contribution = 15000; // зарплата
        double savingsAmounts = 0; // текущее накопленное
        int target = 2_459_000; // сумма для накопления
        int month = 0;

        while (savingsAmounts < target) {

            savingsAmounts = savingsAmounts + contribution;
            month++;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + savingsAmounts + " рублей");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");

        int i = 1;

        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");

        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;

        int thousand = 1000;
        int difference = fertility - mortality;
        int year = 0;

        while (year < 10) {
            population += population / thousand * difference;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    private static void task4() {
        System.out.println("Задача 4");

        int percent = 7;
        float contribution = 15000f;
        int target = 12_000_000;

        for (int month = 0; contribution < target; month++) {
            contribution = contribution + contribution * percent / 100;

            System.out.printf("К месяцу %d накоплено %.2f \n", month + 1, contribution);
        }
    }

    private static void task5() {
        System.out.println("Задача 5");

        int percent = 7;
        float contribution = 15000f;
        int target = 12_000_000;


        for (int month = 1; contribution < target; month++) {
            contribution = contribution + contribution * percent / 100;
            if (month % 6 == 0) {
                System.out.printf("К месяцу %d накоплено %.2f \n", month, contribution);
            }
        }
    }

    private static void task6() {
        System.out.println("Задача 6");

        int percent = 7;
        float contribution = 15000f;
        int month = 0;
        int year = 12;
        int accumulationPeriod = 9 * year;

        while (month < accumulationPeriod) {
            contribution = contribution + contribution * percent / 100;
            month++;
            if (month % 6 == 0) {
                System.out.printf("К месяцу %d накоплено %.2f \n", month, contribution);
            }
        }
    }

    private static void task7() {
        System.out.println("Задача 7");

        int friday = 1;
        int month = 31;

        for (; friday <= month; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет");
        }
    }

    private static void task8() {
        System.out.println("Задача 8");

        int period = 79;
        int currentYear = 2023;
        int before = currentYear - 200;
        int after = currentYear + 100;

        for (int year = 0; year < after; year += period) {
            if (year > before) {
                System.out.println(year);
            }
        }
    }
}

