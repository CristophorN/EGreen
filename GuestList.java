import java.util.ArrayList;
import java.util.Scanner;
public class GuestList {
		static ArrayList<Guest> myList;
		public static int nrMaxLocuri = 0; 
		public static int nrLocuriAsteptare = 0;
		public static int nrLocuriAsteptareOcupate = 0;
		static ArrayList<Guest> waitingList;
		public static int parametruCheck = 0;
		private static Guest auxGuest = new Guest();
	
		
		public GuestList(int nrMaxLocuri) {
			this.nrMaxLocuri = nrMaxLocuri;
			myList = new ArrayList<Guest>(nrMaxLocuri);
			waitingList = new ArrayList<Guest>();
		}


	public Guest createGuest()	{
		Scanner sc = new Scanner(System.in);
		Guest newGuest = new Guest();
		
		System.out.println("Introduceti numele: ");
		newGuest.setLastName(sc.next());
		
		System.out.println("Introduceti prenumele: ");
		newGuest.setFirstName(sc.next());
		
		System.out.println("Introduceti email-ul: ");
		newGuest.setEmail(sc.next());
		
		System.out.println("Introduceti numarul de telefon: ");
		newGuest.setphoneNumber(sc.next());
	
	
	return newGuest;
	
	}


  // 1. adaugarea unei noi persoane (inscrise)
	public static int add(Object guest) { // 
		if(isOnGuestList(guest) != null || isOnWaitingList(guest) != null) {
			System.out.println("Eroare: Aceasta persoana a fost deja inregistrata.");
		return -1;
		}
		Guest auxGuest = (Guest) guest;
		if (nrTotalPersoane() >= nrMaxLocuri) {
			waitingList.add(auxGuest);
			System.out.println("Te-ai inscris cu succes in lista de asteptare si ai primit "
					+ " si ai primit numarul de ordine " + " " + nrPersoaneAsteptare() + ". "
					+ " Te vom notifica daca un loc devine disponibil.");
		
		} else {
	myList.add(auxGuest);
	System.out.println("Felicitari! Locul tau la eveniment este confirmat. Te asteptam!.");
	
	}
		return 0;
	}
	public static Guest isOnGuestList(Object guest) {
		for(Guest i : myList) {
			if(i.equals(guest)) {
				return i;
			}
		}
		
		
		return null;
		
	}

	public static Guest isOnWaitingList(Object guest) {
		for(Guest i : waitingList) {
			if(i.equals(guest)) {
				return i;
			}
		}
		
		
		return null;
	}
	
	//metoda 2 check
	public Guest check()	 {
		String lastName, firstName, email, phoneNumber;
		System.out.println("Alege optiunea dupa care vrei sa faci cautarea:\n"
				+ "1.Nume si prenume\n" 
				+ "2.email\n" 
				+ "3.numar de telefon");
		Scanner sc = new Scanner(System.in);

		int compCase = sc.nextInt();
		Guest.compCase = compCase;
		switch(compCase) {
		case 1:
			System.out.println("Nume: ");
			lastName = sc.next();
			auxGuest.setLastName(lastName);
			System.out.println("Prenumele");
			firstName = sc.next();
			auxGuest.setFirstName(firstName);
			break;
		case 2:
			System.out.println("email: ");
			email = sc.next();
			auxGuest.setEmail(email);
			break;
		case 3:
			System.out.println("Numar de telefon: ");
			phoneNumber = sc.next();
			auxGuest.setphoneNumber(phoneNumber);
			break;
		default:
			System.out.println("Comanda invalida.");
		}
		// i
		
		
		if(compCase == 2) {
			for(int i = 0; i < myList.size(); i++) {
				if(auxGuest.getEmail().equals(myList.get(i).getEmail())) {
					System.out.println("Aceasta persoana este deja inscrisa pe lista.");
				} else {
					System.out.println("Aceasta persoana nu este inscrisa pe lista.");
				}
			}
		}
		
		
		if(compCase == 2) {
			for(int i = 0; i < waitingList.size(); i++) {
				if(auxGuest.getEmail().equals(waitingList.get(i).getEmail())) {
					System.out.println("Aceasta persoana este deja inscrisa pe lista.");
				} else {
					System.out.println("Aceasta persoana nu este inscrisa pe lista.");
				}
			}
		}
		
		if(compCase == 3) {
			for(int i = 0; i < myList.size(); i++) {
				if(auxGuest.getPhoneNumber().equals(myList.get(i).getPhoneNumber())) {
					System.out.println("Aceasta persoana este deja inscrisa pe lista.");
				} else {
					System.out.println("Aceasta persoana nu este inscrisa pe lista.");
				}
			}
		}
		
		if(compCase == 3) {
			for(int i = 0; i < waitingList.size(); i++) {
				if(auxGuest.getPhoneNumber().equals(waitingList.get(i).getPhoneNumber())) {
					System.out.println("Aceasta persoana este deja inscrisa pe lista.");
				} else {
					System.out.println("Aceasta persoana nu este inscrisa pe lista.");
				}
			}
		}
		
		if(compCase == 1) {
			for(int i = 0; i < myList.size(); i++) {
				if(auxGuest.getFirstName().equals(myList.get(i).getFirstName()) && 
						auxGuest.getFirstName().equals(myList.get(i).getFirstName())) {
					System.out.println("Aceasta persoana este deja inscrisa pe lista.");
				} else {
					System.out.println("Aceasta persoana nu este inscrisa pe lista.");
				}
			}
		}
		
		if(compCase == 1) {
			for(int i = 0; i < waitingList.size(); i++) {
				if(auxGuest.getFirstName().equals(waitingList.get(i).getFirstName()) && 
						auxGuest.getFirstName().equals(waitingList.get(i).getFirstName())) {
					System.out.println("Aceasta persoana este deja inscrisa pe lista.");
				} else {
					System.out.println("Aceasta persoana nu este inscrisa pe lista.");
				}
			}
		}

	return auxGuest;   // de returnat guest-ul
	
	}
	
	
		
	// 3.eliminarea unei persoane (inscrise)
	public boolean remove() {
		auxGuest = new Guest();
		auxGuest = check();
		
	
		if(isOnGuestList(auxGuest) != null) {
			myList.remove(isOnGuestList(auxGuest));
			System.out.println("Datele referitoare la aceasta persoana au fost sterse.");	
			
		}
			
		if(isOnWaitingList(auxGuest) != null) {
		
				waitingList.remove(isOnWaitingList(auxGuest));
				System.out.println("Datele referitoare la aceasta persoana au fost sterse.");
			
			
		
			if(myList.size() != 0 && myList.size() < nrMaxLocuri &&
					waitingList.size() > 0) {
				System.out.println(waitingList.get(0).toString());
			myList.add(waitingList.get(0));
			waitingList.remove(0);
			}
		
	


	}
		return false;
	}
	
	
// 4.actualizarea detaliilor unei persoane inscrise
	public void update() {
		Scanner sc = new Scanner(System.in);
		auxGuest = new Guest();
		auxGuest = check();
		int n = 0;
		n = sc.nextInt();
		
		if((auxGuest) != null ) {
			System.out.println("Alege campul pe care doresti sa il actualizezi: "
					+ "\n1. Nume si prenume\n" 
					+"\n2. email\n" 
					+ "\n3. numar de telefon. ");
			
		switch(n) {
		case 1: 
			System.out.println("Introdu numele si prenumele nou:");
			auxGuest.setLastName(sc.next());
			auxGuest.setFirstName(sc.next());
			System.out.println("Datele au fost salvate cu succes.");
			break;
		case 2:
			System.out.println("Introdu email-ul nou: ");
			auxGuest.setEmail(sc.next());
			System.out.println("Datele au fost salvate cu succes.");
			break;
		case 3:
			System.out.println("Introdu numarul de telefon nou: ");
			auxGuest.setphoneNumber(sc.next());
			System.out.println("Datele au fost salvate cu succes.");
			break;
		default:
			System.out.println("Comanda invalida.");
		}
		
		}
	
	
	}
	
	//5. obtinerea listei de persoane care au loc la eveniment (i.e. lista de participare)
	
	public static int printGuests() {
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(i + 1 + ". " + myList.get(i).toString());
		}
		
		return 0;
		
		
	}

//6. obtinerea listei de persoane din lista de asteptare
	public static int printWaitingGuests() {
		for(int i = 0; i < waitingList.size(); i++) {
			System.out.println(i + 1 + ". " + waitingList.get(i).toString());
			 
			}
		
	return 0;
	}

	
//7. obtinerea numarului de locuri disponibile
	public int nrLocuriDisponobile() {
		return nrMaxLocuri - myList.size();
	}
	
	
//8. obtinerea numarului de persoane participante (i.e. aflate in lista de participare)
	public static int nrPersoaneParticipante()	{
		return  myList.size();
	}
	
	
//9. obtinerea numarului de persoane din lista de asteptare
	public static int nrPersoaneAsteptare() {
		return  waitingList.size();
	}
	
//10. obtinerea numarului total de persoane
	public  static int nrTotalPersoane()	 {
		return myList.size()+waitingList.size();
		
	}
	
	

//11. cautare partiala, dupa un subsir de caractere:
	
	
	public void search() {
		System.out.println("Introdu cautarea: ");
		Scanner sc = new Scanner(System.in);
		String keyword = sc.next();
		int j = 1;
		for(Guest i : myList) {
			if(i.contains(keyword) != null) {
				System.out.println("Persoana inscrisa pe pozitia " + j + " contine: " + i.contains(keyword));
			}
		j++;
	  }
	j = 1;
	for(Guest i : waitingList) {
		if (i.contains(keyword) != null) {
			System.out.println("Persoana inscrisa pe pozitia " + j + " contine: " + i.contains(keyword));
		}
		j++;
	   }
	}
	
	public void help()	{
	System.out.println("help         - Afiseaza aceasta lista de comenzi");
	System.out.println("add          - Adauga o noua persoana (inscriere)");
	System.out.println("check        - Verifica daca o persoana este inscrisa la eveniment");
	System.out.println("remove       - Sterge o persoana existenta din lista");
	System.out.println("update       - Actualizeaza detaliile unei persoane");						
	System.out.println("guests       - Lista de persoane care participa la eveniment");
	System.out.println("waitlist     - Persoanele din lista de asteptare");
	System.out.println("available    - Numarul de locuri libere");
	System.out.println("guests_no    - Numarul de persoane care participa la eveniment");
	System.out.println("waitlist_no  - Numarul de persoane din lista de asteptare");
	System.out.println("subscribe_no - Numarul total de persoane inscrise");
	System.out.println("search       - Cauta toti invitatii conform sirului de caractere introdus");
	System.out.println("quit         - Inchide aplicatia");
	}
	
	public void quit()	 {
		System.out.println("Aplicatia se inchide...");
		System.exit(0);
	}

}
