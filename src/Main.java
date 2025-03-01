public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int savings = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + savings;

            System.out.println("Месяц " + (month++) + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task 2");

        int number = 1;

        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task 3");

        int population = 12000000;
        int birthRate = population / 1000 * 17;
        int deathRate = population / 1000 * 8;
        int totalPopulation = 0;


        for (int i = 0; i < 11; i++) {
            totalPopulation = totalPopulation + birthRate - deathRate;
            totalPopulation = totalPopulation + population;
            System.out.println("Год " + i + ", численность населения составляет " + totalPopulation);

        }

        System.out.println("Task 4");

        int savingBank = 15000;
        int totalSavingBank = 0;

        for (int i = 0; totalSavingBank < 12000000; i++) {
            totalSavingBank = totalSavingBank + (totalSavingBank / 100 * 7);
            totalSavingBank = totalSavingBank + savingBank;
            System.out.println("Месяц " + (i++) + ", сумма накоплений равна " + totalSavingBank + " рублей");
        }

        System.out.println("Task 5");

        int savingBankNew = 15000;
        int totalSavingBankNew = 0;
        int a = 0;

        while (totalSavingBankNew < 12000000) {
            totalSavingBankNew = totalSavingBankNew + (totalSavingBankNew / 100 * 7);
            totalSavingBankNew = totalSavingBankNew + savingBankNew;
            a++;
            if (a % 6 == 0)
                System.out.println("Месяц " + a + ", сумма накоплений равна " + totalSavingBankNew + " рублей");
        }

        System.out.println("Task 6");

        int savingBank1 = 15000;
        int totalSavingBank1 = 0;

        for (int i = 0; i < 109; i++) {
            totalSavingBank1 = totalSavingBank1 + (totalSavingBank1 / 100 * 7);
            totalSavingBank1 = totalSavingBank1 + savingBank1;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavingBank1 + " рублей");
        }

        System.out.println("Task 7");

        int firstFriday = 0;

        while (firstFriday < 32) {
            firstFriday++;
            if (firstFriday % 7 == 0)
                System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Task 8");

        int initialYear = 2025 - 200;
        int finalYear = 2025 + 100;
        for (int i = initialYear; i < finalYear; i++) {

            if (i % 79 == 0)
                System.out.println(i);
        }
    }
}
