public class Main {
    public static void main(String[] args) {
        // задание 1
        int cat = 4;
        byte pig = 5;
        short bird = 2;
        long dog = 4000L;
        double riceWeigh = 1.5;
        float sugarWeight = 2.5f;
        boolean pigAudlt = true;
        char bar = 'C';
        System.out.println(pigAudlt);
        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightAllBoxers = boxer1 + boxer2;
        double difference = Math.abs(boxer2 - boxer1);
        System.out.println("Общий ВЕС боксёров " + weightAllBoxers + " кг");
        System.out.println("Разница в ВЕСе боксёров " + difference + " кг");
        //Задание 3
        byte bananas = 5;
        byte weightBananas = 80;
        short milkMl100 = 105;
        int milk = 200;
        int milkMl  = 100;
        int weightMilk = milk / milkMl;
        byte icecreame = 2;
        byte weightIcecreame = 100;
        byte egg = 4;
        byte weightEgg = 70;
        float weightAllProductsG = (bananas * weightBananas) + (milkMl100 * weightMilk) + (icecreame * weightIcecreame) + (egg * weightEgg);
        System.out.println("Общий ВЕС продуктов в граммах " + weightAllProductsG + " г");
        int gPerKg = 1000;
        float weightALLproductsKg = weightAllProductsG / gPerKg;
   System.out.println("Общий ВЕС продуктов в килограммах " + weightALLproductsKg + " кг");
        // Задание 4
    byte weightLoseKg = 7;
    int gramsPerKg = 1000;
    int weightLoseG = weightLoseKg * gramsPerKg;
    System.out.println("Потеря ВЕСа в граммах " + weightLoseG );
    short lose250 = 250;
    short lose500 = 500;
    int daysA = weightLoseG / lose250;
    int daysB = weightLoseG / lose500;
    double avgDays = (daysA + daysB) / (2 * 1.0);
    System.out.println("Мин " + daysA);
    System.out.println("Макс " + daysB);
    System.out.println("Срд " + avgDays);

    // Задание 5
        float tenPercent = 0.1f;
        int mashaOld = 67_760;
        int denisOld = 83_690;
        int kristinaOld = 76_230;
        int mashaNew = (int) (mashaOld + mashaOld * tenPercent);
        System.out.println("Новая ЗП Маши " + mashaNew);
        int denisNew = (int) (denisOld + denisOld * tenPercent);
        System.out.println("Новая ЗП Дениса " + denisNew);
        int kristinaNew = (int) ( kristinaOld + kristinaOld * tenPercent);
        System.out.println("Новая ЗП Кристины " + kristinaNew);

        int mashaDiff = (mashaNew - mashaOld) * 12;
        int denisDiff = (denisNew - denisOld) * 12;
        int kristinaDiff = (kristinaNew - kristinaOld) * 12;
        System.out.println("годовой доход Маши вырос на " + mashaDiff);
        System.out.println("годовой доход Дениса вырос на " + denisDiff);
        System.out.println("годовой доход Кристины вырос на " + kristinaDiff);

        int revenueOld = mashaOld + denisOld + kristinaOld;
        System.out.println("Старый общий годовой доход "+revenueOld);
        int revenueNew = mashaNew + denisNew + kristinaNew;
        System.out.println("Новый общий годовой доход "+revenueNew);
        int diffRevenue = revenueNew - revenueOld;
        System.out.println("Разница годовых доходов "+diffRevenue);


    }
}