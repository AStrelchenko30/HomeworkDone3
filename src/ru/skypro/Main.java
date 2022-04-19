package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        byte a=1;
        short b=2;
        int c=256;
        long d= 156896;
        float e=10f;
        double f=59756;
        char g=1;
        boolean food=true;
        //Задача 2
        float weightFirstMan=78.2f;
        float weightSecondMan=82.7f;
        float totalWeight=weightFirstMan+weightSecondMan;
        System.out.println("Общий вес: "+totalWeight+" кг");
        float difference=(weightSecondMan)%weightFirstMan;
        System.out.println("Разница в весе: "+difference+" кг");
        //Задача 3
        int bananas=5;
        int milk=2;
        int ice=2;
        int eggs=4;
        int gramsInOneBanana=80;
        int gramsInMilk=105;
        int gramsInIce=100;
        int gramInEgg=70;
        int recipe=bananas*gramsInOneBanana+milk*gramsInMilk+ice*gramsInIce+eggs*gramInEgg;
        float totalWeightRecipe=recipe/1000f;
        System.out.println("Вес спорт завтрака: "+totalWeightRecipe+" кг");
        //Задача 4
        int weightLoss=7;
        int gramsLoss=250;
        int gramsLossMore=500;
        int weightLossGramm=weightLoss*1000;
        int dayGramsLoss=weightLossGramm/gramsLoss;
        System.out.println("Дней для похудения "+dayGramsLoss);
        int dayGramsLossMore=weightLossGramm/gramsLossMore;
        System.out.println("Дней для усиленного похудения "+dayGramsLossMore);
        int middleDays=(dayGramsLoss+dayGramsLossMore)/2;
        System.out.println("Среднее кол-во дней: "+middleDays);
        // Задача 5
        int mashaSalary=67760;
        int denisSalary=83690;
        int kristinaSalary=76230;
        float mashaNewSalary=mashaSalary*1.1f;
        float denisNewSalary=denisSalary*1.1f;
        float kristinaNewSalary=kristinaSalary*1.1f;
        int mashaYearSalary=mashaSalary*12;
        int denisYearSalary=denisSalary*12;
        int kristinaYearSalary=kristinaSalary*12;
        float mashaNewYearSalary=mashaNewSalary*12f;
        float denisNewYearSalary=denisNewSalary*12f;
        float kristinaNewYearSalary=kristinaNewSalary*12f;
        float differenceMashsaSalary=(mashaNewYearSalary)%mashaYearSalary;
        System.out.println("Маша теперь получает: "+mashaNewSalary+ " рублей"+"."+"Годовой доход вырос на "+ differenceMashsaSalary+ " рублей");
        float differenceDenisSalary=(denisNewYearSalary)%denisYearSalary;
        float differenceKristinaSalary=(kristinaNewYearSalary)%kristinaYearSalary;
        System.out.println("Денис теперь получает: "+denisNewSalary+ " рублей"+"."+"Годовой доход вырос на "+ differenceDenisSalary+ " рублей");
        System.out.println("Кристина теперь получает: "+kristinaNewSalary+ " рублей"+"."+"Годовой доход вырос на "+ differenceKristinaSalary+ " рублей");
    }
}
