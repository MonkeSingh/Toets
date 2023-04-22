
import java.util.Scanner;

public class ReserveringsApp {
    
    private final Scanner scanner = new Scanner(System.in);
    private final ParkeerplaatsManager parkeerplaatsManager = new ParkeerplaatsManager();

    public static void main(String[] args) {
        ReserveringsApp reserveringsApp = new ReserveringsApp();
        
        reserveringsApp.startApp();
    }


    //functie is compoleet niet meer aankomen 
    public void startApp(){
        boolean applicatieDraait = true;
        
        while (applicatieDraait){
            System.out.println("Welkom bij de reserverings app van VinFlo inc. Wat wil je reserveren?");
            System.out.println("1. Auto parkeerplek\n2. Laadpaal parkeerplek\n3. Afsluiten");
            int keuze = this.scanner.nextInt();

            switch (keuze){
                case 1 -> this.reserveerAutoPlek();
                case 2 -> this.reserveerLaadpaalPlek();
                case 3 -> applicatieDraait = false;
                default -> System.out.println("Dit is helaas niet een valide optie kies opnieuw.");
            }
        }
      
    }

    private void reserveerLaadpaalPlek() {
        //maak functie af
    }

    private void reserveerAutoPlek() {
        //maak functie af
    }

}
