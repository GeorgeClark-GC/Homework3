public class Main {
    public static void main(String[] args) {
        int studentsGroup1 = 23;
        int studentsGroup2 = 27;
        int studentsGroup3 = 30;
        int totalPaper = 480;
        int numberPaper = totalPaper / (studentsGroup1 + studentsGroup2 + studentsGroup3);
        System.out.println("На каждого ученика рассчитано " + numberPaper + " листов бумаги");
    }
}