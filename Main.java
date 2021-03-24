import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	ArrayList<Guest> myList = new ArrayList<Guest>();
			GuestList g1 = new GuestList(2);
		//	ArrayList<Guest> myList = new ArrayList<Guest>();
		//	ArrayList<Guest> waitingList = new ArrayList<Guest>();
			

			Scanner sc = new Scanner(System.in);
			String key = "";
			System.out.println();
			do {
				key = sc.next();
				switch(key) {
				case "help" : 
					g1.help();
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "add":
					g1.add(g1.createGuest());
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "check" :
					g1.check();
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "remove" :
					System.out.println(g1.remove());
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "update" : 
					g1.update();
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "guests" :
					g1.printGuests();
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "waitlist" :
					g1.printWaitingGuests();
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "available" :
					System.out.println(g1.nrLocuriDisponobile());
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "guests_no" :
					System.out.println(g1.nrPersoaneParticipante());
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "waitlist_no" :
					System.out.println(g1.nrPersoaneAsteptare());
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "subscribe_no" :
					System.out.println(g1.nrTotalPersoane());
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "search" :
					g1.search();
					System.out.println();
					System.out.println("Asteptam urmatoare comanda!");
					break;
				
				case "quit" :
					g1.quit();
					break;
			
					default:
						System.out.println("Comanda invalida.");
						System.out.println();
						System.out.println("Asteptam urmatoare comanda!");
			}

	
			} while(key != "quit");
	}

}
