public class Main {
    public static void main(String[] args) {
        int numberBananas = 5;
        int bananaWeight = 80;
        int numberMilk = 2;
        int milkWeight = 105;
        int numberIcecream = 2;
        int icecreamWeight = 100;
        int numberEgg = 4;
        int eggWeight = 70;
        double totalWeight1 = (numberBananas * bananaWeight) + (numberMilk * milkWeight) + (numberIcecream * icecreamWeight) + (numberEgg * eggWeight);
        double totalWeight2 = totalWeight1/1000;
        System.out.println("Вес спортзавтрака в граммах: " + totalWeight1 + "    Вес спортзавтрака в килограммах: " + totalWeight2);
    }
}