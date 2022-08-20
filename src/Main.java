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
        double weightDifference = Math.abs(boxer2 - boxer1);
        System.out.println("Общий ВЕС боксёров " + weightAllBoxers + " кг");
        System.out.println("Разница в ВЕСе боксёров " + weightAllBoxers + " кг");
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
        int weightAllProductsG = bananas * weightBananas + milkMl100 * weightMilk + icecreame * weightIcecreame + egg * weightEgg;
        System.out.println("Общий ВЕС продуктов в граммах " + weightAllProductsG + " г");
  float weightALLproductsKg = weightAllProductsG / 1000F;
   System.out.println("Общий ВЕС продуктов в килограммах " + weightALLproductsKg + " кг");
        // Задание 4
    byte weightLoseKg = 7;
    int weightLoseG = weightLoseKg * 1000;
    System.out.println("Потеря ВЕСа в граммах " + weightLoseG );
    short lose250 = 250;
    short lose500 = 500;
    int daysA = weightLoseG / lose250;
    int daysB = weightLoseG / lose500;
    System.out.println("Дни с учётом потери 250 гр. в день = " + daysA +"." + " Дни с учётом потери 500 гр в день =" + daysB + "." +
            "" );
        // Задание 5
        float tenPercent = 0.1f;
        int mashaOld = 67760;
        int denisOld = 83690;
        int kristinaOld = 76230;
        float mashaNew = mashaOld + mashaOld * tenPercent;
        System.out.println("Новая ЗП Маши " + mashaNew);
        float denisNew = denisOld + denisOld * tenPercent;
        System.out.println("Новая ЗП Дениса " + denisNew);
        float kristinaNew = kristinaOld + kristinaOld * tenPercent;
        System.out.println("Новая ЗП Кристины " + kristinaNew);
        int revenueOld = mashaOld + denisOld + kristinaOld;
        System.out.println("Старый годовой доход "+revenueOld);
        float revenueNew = mashaNew + denisNew + kristinaNew;
        System.out.println("Новый годовой доход "+revenueNew);
        float diffRevenue = revenueNew - revenueOld;
        System.out.println("Годовой доход вырос на "+diffRevenue);


    }
}