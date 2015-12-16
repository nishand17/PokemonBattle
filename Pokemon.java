import java.util.*; 
import java.io.*; 
/**
 * @Nishan
 */

public class PokemonStadium { 
	public static void main(String[] args) throws IOException {
		main();
	}
	public static void main() throws IOException { 
		Scanner sc = new Scanner(System.in); 
		BufferedReader br = new BufferedReader(new 
			InputStreamReader(System.in)); 
		System.out.println("Welcome to the Pokemon Stadium! Are you ready to fight for glory and honor?");
		System.out.println("1. Whiscash");
		System.out.println("2. Rustagi");
		System.out.println("3. Empoleon");
		System.out.println("4. Infernape");
		System.out.println("5. Torterra");
		System.out.println("6. Charizard");
		System.out.println("Player 1, Enter a number to choose your pokemon!");
		Pokemon P1 = null;
		Pokemon P2 = null;
		int p1=sc.nextInt(); 
		switch (p1) {
			case 1: P1 = new Whiscash(/**/);
				break;
			case 2: P1 = new Rustagi(/**/);
				break;
			case 3: P1 = new Empoleon(/**/);
				break;
			case 4: P1 = new Infernape(/**/);
				break;
			case 5: P1 = new Torterra(/**/);
				break;
			case 6: P1 = new Charizard(/**/);
				break;
			default: 
				break;
		}
	
		System.out.println("Name your Pokemon!");
		P1.name = br.readLine(); 
		System.out.println("Player 2, Enter a number to choose your pokemon!");
		int p2=sc.nextInt(); 
			switch (p2) {
				case 1: P2 = new Eevee(/**/);
					break;
				case 2: P2 = new Rustagi(/**/);
					break;
				case 3: P2 = new Empoleon(/**/);
					break;
				case 4: P2 = new Infernape(/**/);
					break;
				case 5: P2 = new Torterra(/**/);
					break;
				case 6: P2 = new Charizard(/**/);
					break;
				default: 
					break;
		}
		System.out.println("Name your Pokemon!");
			Pokemon Poke1 = null;
			Pokemon Poke2 = null;
			P2.name=br.readLine();
			System.out.println("\fLet the Battle begin"); 
			if (P1.speed > P2.speed) {
				Poke1 = P1;
				Poke2 = P2;
			}
			else if (P1.speed < P2.speed) {
				Poke1 = P2;
				Poke2 = P1;
			}
			else {
				Poke1 = P1;
				Poke2 = P2;
			}
			System.out.println(Poke1.name+ " starts the battle"); 
			while(true) {
				char c= 'a';
				System.out.println(Poke1.name + " HP: " + Poke1.hp);
				Poke1.printMoves();
				System.out.println("");
				System.out.println("");
				System.out.println(Poke2.name + " HP : " + Poke2.hp);
				Poke2.printMoves();
				System.out.println("\n"+Poke1.name + ", choose a move(number)"); 
				int m1 = sc.nextInt(); 
				m1--; 
				System.out.println(Poke2.name+", " + "choose a move(number)"); 
				int m2 = sc.nextInt(); 
				m2--; 
				Poke1.calculateDamage(Poke2, m1);
				if (Poke2.hp <= 0) {
					System.out.println(Poke1.name + " won the battle!");
					System.out.println("Do you want a rematch? (y/n)");
					c = (br.readLine().toLowerCase()).charAt(0);
					
					if (c == 'y') {
						main();
					}
					else if (c == 'n') {
						System.exit(0);
					}
					else {
						System.out.println("Enter a valid answer!");
					}
				}

				Poke2.calculateDamage(Poke1, m2);
				if (Poke1.hp <= 0) {
					System.out.println(Poke2.name + " won the battle!");
					System.out.println("Do you want a rematch? (y/n)");
					c=(br.readLine().toLowerCase()).charAt(0);
					if (c == 'y') {
						main();
					}
					else if (c == 'n') {
						System.exit(0);
					}
					else {
						System.out.println("Enter a valid answer!");
					}
				}
				System.out.println("Enter any button to continue"); 
				String f=sc.next(); 
				System.out.print("\f"); 
			} 
		} 
	} 
