
public class HomeApp {

    public static void main(String[] args) {

        HomeInterface homeInterface = new HomeInterface();

        System.out.println("Turning ON all home services:");
        homeInterface.turnOnAll();

        System.out.println();

        System.out.println("Turning OFF all home services:");
        homeInterface.turnOffAll();
    }
}