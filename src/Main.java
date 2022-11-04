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




    }
}