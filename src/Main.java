public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Выполнение задания 1:");
        int i = 0;
        int total = 0;
        int invest = 15_000;
        while (total <= 2_459_000) {
            total = total + total/100;
            total = total + invest;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        //Задание 2
        System.out.println("Выполнение задания 2:");
        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        //Задание 3
        System.out.println("Выполнение задания 3:");
        int population = 12_000_000;
        int increasePeople;
        int mortalityPeople;
        for (i = 1; i <= 10; i++) {
            increasePeople = (population / 1000) * 17;
            mortalityPeople = (population / 1000) * 8;
            population = population + increasePeople - mortalityPeople;
            System.out.println("Год " + i + "-й," + " численность населения составляет " + population);
            }

        System.out.println();
        System.out.println();
        //Задание 4
        System.out.println("Выполнение задания 4:");
        int totalDeposit = 15_000;
        int depositInterest;
        int month = 0;
        while (totalDeposit <= 12000000) {
            depositInterest = 7 * totalDeposit / 100;
            totalDeposit = totalDeposit + depositInterest;
            month++;
            System.out.println("Месяц " + month + ", накопленная сумма: " + totalDeposit);
        }
        System.out.println("Итого понадобится " + month + " месяцев ");

        System.out.println();
        //Задание 5
        System.out.println("Выполнение задания 5:");
        totalDeposit = 15_000;
        month = 0;
        while (totalDeposit <= 12000000) {
            depositInterest = 7 * totalDeposit / 100;
            totalDeposit = totalDeposit + depositInterest;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопленная сумма: " + totalDeposit);
            }
        }

        System.out.println();
        //Задание 6
        System.out.println("Выполнение задания 6:");
        totalDeposit = 15_000;
        int yearForDeposit = 1;
        int year = 9;
        month = 1;
        while (yearForDeposit <= year) {
            for (i = 1; i <= 12; i++) {

                depositInterest = 7 * totalDeposit / 100;
                totalDeposit = totalDeposit + depositInterest;

                if (i == 6 || i == 12 ) {
                    System.out.println("Год " + yearForDeposit
                            + ". За прошедшие 6 месяцев этого года cумма накопления составляет: " + totalDeposit);
                    System.out.println("Прошло " +  month + " месяцев с даты начала накопления");
                }
                month++;
            }
            System.out.println();
            yearForDeposit++;
        }

        System.out.println();
        //Задание 7
        System.out.println("Выполнение задания 7:");
        int firstFriday = 1;
        int currentDay = 1;
        int secondFriday = firstFriday + 7;
        int thirdFriday = firstFriday + 14;
        int fourFriday = firstFriday + 21;
        int fiveFriday = firstFriday + 28;

        for (i = currentDay ; i <=31; i++) {
            if (i == firstFriday ||
                i == secondFriday ||
                i == thirdFriday ||
                i == fourFriday ||
                i == fiveFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }

        System.out.println();
        //Задание 8 - астрономическое приложение
        System.out.println("Выполнение задания 8:");
        int currentYear = 2022;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;
        for (i = 0; i <= futureYear; i = i + 79) {

            if (i >= pastYear) System.out.println(i);
        }

        System.out.println();
        //Задание 9 - таблица умножения на 2
        System.out.println("Выполнение задания 9:");
        int result;
        for (i=1; i<11; i++ ) {
            result = 2 * i;
            System.out.println("2*" + i + " = " + result);
        }
    }
}