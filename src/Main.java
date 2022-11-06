import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise 1.1");
        int deposit = 15_000;
        int sum = 0;
        int month = 0;
        while (sum <= 2_459_000) {
            sum += deposit;
            month++;
            System.out.println("Месяц, " + month + " сумма накоплений равна " + sum + " рублей.");
        }
        System.out.println("Exercise 1.2");
        int i = 0;
        while (i<10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j >= 1 ; j--) {
            System.out.print(j + " ");
        }

        System.out.println("Exercise 1.3");
         int totalPopulation = 12_000_000;
         int birthRate = 17;
         int populationMortality = 8;

        for (i = 1; i <=10 ; i++) {
            totalPopulation = totalPopulation + (totalPopulation * birthRate/1000) - (totalPopulation * populationMortality/1000);
            System.out.println( "Год, " + i + " численность населения составляет " + totalPopulation);
        }
        System.out.println("Exercise 2.1");

        int deposit2 = 15000;
        double sumWhithPercent = 0;
        int percent = 7;
        int month2 = 0;
        while (sumWhithPercent <= 12_000_000) {
            double sumMonthPercent = 1 + percent * 0.01;
            sumWhithPercent = sumMonthPercent * (sumWhithPercent + deposit2);
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц, " + month2 + " сумма накоплений равна " + sumWhithPercent + " рублей.");
            }
        }

        System.out.println("Exercise 2.3");

        sumWhithPercent = 0;
        deposit2 = 15_000;
        month2 = 0;
        while (month2 <=108) {
            double sumMonthPersentVasya = 1 + percent * 0.01;
            sumWhithPercent = sumMonthPersentVasya * (sumWhithPercent + deposit2);
            month2++;
             if (month2 % 6 ==0) {
                 System.out.println("Месяц, " + month2 + " сумма накоплений равна " + sumWhithPercent + " рублей.");
             }
        }

        System.out.println("Exercise 2.4");
        int firstFriday = 4;
        for (firstFriday = 4; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Сегодня пятница, " + firstFriday + " число. Необходиом подготовить отчет.");
        }

        System.out.println("Exercise 3.1");

        int nowYear = 2022;
        int startYearComet = nowYear - 200;
        int finishYearComet = nowYear + 100;
        for (int yearComet = 0; yearComet <= finishYearComet; yearComet+=79) {
            if (yearComet >= startYearComet && yearComet <= finishYearComet)
                System.out.println(yearComet);
                }

        System.out.println("Exercise 3.2");

        for (int j = 1; j <=10 ; j++) {
            System.out.println("2 * " + j + " = " + 2 * j);
            
        }
    }
}