public class Main {
    public static void main(String[] args) {
        int allCans = 120;
        int white = 2;
        int brown = 4;
        int rooms = allCans / (white + brown);
        int totalWhite = white * rooms;
        int totalBrown = brown * rooms;
        System.out.println("В школе, где " + rooms + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown+ " банок коричневой краски");
    }
}