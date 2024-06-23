public class Main {
    public static void main(String[] args) {
         int totalOut = 7;
         int outWeight1 = 250;
         int outWeight2 = 500;
         int maxDays = (totalOut * 1000) / outWeight1;
         int minDays = (totalOut * 1000) / outWeight2;
         int mediumDays = (maxDays + minDays) / 2;
         System.out.println("Спортсмену необходимо сбросить " + totalOut + " килограммов. Сбрасывая " + outWeight1 +  " - " + outWeight2 + " граммов в день, у него это займёт " + minDays + " - " + maxDays + " дней, или в среднем " + mediumDays + " день" );
    }
}