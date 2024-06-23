public class Main {
    public static void main(String[] args) {
        int production = 16;
        int productionTime = 2;
        int totalTime;
        totalTime = 20;
        int totalProduction = (totalTime / productionTime) * production;
        System.out.println("За " + totalTime + " минут машина произвела " + totalProduction + " штук бутылок");
        totalTime = totalTime * 72;
        int totalProduction2 = (totalTime / productionTime) * production;
        System.out.println("За " + totalTime + " минут (или сутки) машина произвела " + totalProduction2 + " штук бутылок");
        totalTime = totalTime * 3;
        int totalProduction3 = (totalTime / productionTime) * production;
        System.out.println("За " + totalTime + " минут (или 3 дня) машина произвела " + totalProduction3 + " штук бутылок");
        totalTime = totalTime * 10;
        int totalProduction4 = (totalTime / productionTime) * production;
        System.out.println("За " + totalTime + " минут (или месяц, т е 30 дней) машина произвела " + totalProduction4 + " штук бутылок");
    }
}