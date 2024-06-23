public class Main {
    public static void main(String[] args) {
         double percent = 0.1;
         double wagesMaria = 67760;
         double wagesDenis = 83690;
         double wagesChristina = 76230;
         double increaseMaria = wagesMaria * percent;
         double increaseDenis = wagesDenis * percent;
         double increaseChristina = wagesChristina * percent;
         wagesMaria = wagesMaria + increaseMaria;
         wagesDenis = wagesDenis + increaseDenis;
         wagesChristina = wagesChristina + increaseChristina;
         System.out.println("Зарплата Марии выросла на " + increaseMaria + "рублей и составляет теперь " + wagesMaria + " рублей.");
         System.out.println("Зарплата Дениса выросла на " + increaseDenis + "рублей и составляет теперь " + wagesDenis + " рублей.");
         System.out.println("Зарплата Кристины выросла на " + increaseChristina +  "рублей и составляет теперь " + wagesChristina + " рублей.");
    }
}