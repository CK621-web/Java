package lesson11.wonders;

public class WondersOfWorld {
    public static void main(String[] args) {

        SevenWonders[] wonders = new SevenWonders[7];

        wonders[0] = new GreatWallOfChina();
        wonders[1] = new Petra();
        wonders[2] = new Colosseum();
        wonders[3] = new ChichenItza();
        wonders[4] = new MachuPicchu();
        wonders[5] = new TajMahal();
        wonders[6] = new ChristTheRedeemer();

        System.out.println("   Information about the New 7 Wonders of the World   ");

        for (SevenWonders wonder : wonders) {
            wonder.displayInfo();
            System.out.println("");
        }
    }
}
