/**
 * Original project written by Mahir Bathija.
 * @Nishan 
 */

public class Pokemon {
	public int hp;
	public int attack;
	public int defense;
	public int specialAttack;
	public int specialDefense;
	public int speed;
	public String name;
	public String type1;
	public String type2;
	public String[][] moves = new String[4][5];
	Pokemon(int h,int a,int d,int sa,int sd, int s, String t1, String t2) {
		this.hp = h; 
		this.attack = a;
		this.defense = d;
		this.specialAttack = sa;
		this.specialDefense = sd;
		this.speed = s;
		this.type1 = t1;
		this.type2 = t2;
	} 
	public void printMoves() { 
		for (int i = 0; i < 4; i++) {
			System.out.println(moves[i][0]);
		}
	}

	/**
	 * This pokemon is using a move. The Pokemon P passed into this method 
	 * is getting hit by "this" pokemon's move.
	 * int m is used to indicate which move is being used. 
	 * This move first checks if the move missed. If so, print that the move missed and return;.
	 * Otherwise, calculate the appropriate damage amount and deduct that amount from Pokemon P's HP.
	 * Make sure to print out if the move was Super Effective, Not Very Effective, or had no effect.
	 * calculateDamage() should print things 1) "Attack Missed!" 2) "Hydro pump is super effective on Magmar"
	 * 3) Hydro pump is not very effective on Cloyster or 4) Earthquake has no effect on Spearow.
	 * At the end of this method, Pokemon P's HP should be altered by the appropriate amount or
	 * not altered at all if the move missed or "had no effect".
	 * Remember to take into consideration BOTH of Pokemon P's types.
	 * READ THE SPEC FOR ALL THE DETAILS
	 *
	 */
	void calculateDamage(Pokemon P, int m) {
		double accuracy = Double.parseDouble(moves[m][2])/100;
		double damageConstant = 0.0;
		double damage = 0.0;
		if ((Math.random() >= accuracy)) {
			System.out.println("Attack Missed!");
		}
		else {
			if (moves[m][4].equals("special")) {
				damage = specialAttack*Double.parseDouble(moves[m][1])/P.specialDefense;
				damageConstant = damage;
				if (moves[m][3].equals(type1) || moves[m][3].equals(type2)) {
					damage *= 1.5;
				}
				if (moves[m][3].equals("fire")) {
					if (P.type1.equals("fire")) {
						damage *= .5;
						
					}
					if (P.type1.equals("water")) {
						damage *= .5;
						
					}
					if (P.type1.equals("grass")) {
						damage *= 2;
						
					}
					if (P.type1.equals("ice")) {
						damage *= 2;
						
					}
					if (P.type1.equals("rock")) {
						damage *= .5;
						
					}
					if (P.type2.equals("fire")) {
						damage *= .5;
						
					}
					if (P.type2.equals("water")) {
						damage *= .5;
						
					}
					if (P.type2.equals("grass")) {
						damage *= 2;
						
					}
					if (P.type2.equals("ice")) {
						damage *= 2;
						
					}
					if (P.type2.equals("rock")) {
						damage *= .5;
						
					}
				}
				if (moves[m][3].equals("water")) {
					if (P.type1.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type1.equals("water")) {
						damage*= .5;
						
					}
					if (P.type1.equals("grass")) {
						damage*= .5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 2;
						
					}
					if (P.type2.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type2.equals("water")) {
						damage*= .5;
						
					}
					if (P.type2.equals("grass")) {
						damage*= .5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("grass")) {
					if (P.type1.equals("fire")) {
						damage*= .5;
						
					}
					if (P.type1.equals("water")) {
						damage*= 2;
						
					}
					if (P.type1.equals("grass")) {
						damage*= .5;
						
					}
					if (P.type1.equals("poison")) {
						damage*= .5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type1.equals("flying")) {
						damage*= .5;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("fire")) {
						damage*= .5;
						
					}
					if (P.type2.equals("water")) {
						damage*= 2;
						
					}
					if (P.type2.equals("grass")) {
						damage*= .5;
						
					}
					if (P.type2.equals("poison")) {
						damage*= .5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type2.equals("flying")) {
						damage*= .5;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("ground")) {
					if (P.type1.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type1.equals("electric")) {
						damage*= 2;
						
					}
					if (P.type1.equals("grass")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("poison")) {
						damage*= 2;
						
					}
					if (P.type1.equals("flying")) {
						damage*= 0;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type2.equals("electric")) {
						damage*= 2;
						
					}
					if (P.type2.equals("grass")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("poison")) {
						damage*= 2;
						
					}
					if (P.type2.equals("flying")) {
						damage*= 0;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("rock")) {
					if (P.type1.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type1.equals("ice")) {
						damage*= 2;
						
					}
					if (P.type1.equals("fighting")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("flying")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type2.equals("ice")) {
						damage*= 2;
						
					}
					if (P.type2.equals("fighting")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("flying")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("ice")) {
					if (P.type1.equals("water")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type1.equals("ice")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type1.equals("flying")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("water")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type2.equals("ice")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type2.equals("flying")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("electric")) {
					if (P.type1.equals("water")) {
						damage*= 2;
						
					}
					if (P.type1.equals("electric")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("grass")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 0;
						
					}
					if (P.type1.equals("flying")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("water")) {
						damage*= 2;
						
					}
					if (P.type2.equals("electric")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("grass")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 0;
						
					}
					if (P.type2.equals("flying")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("psychic")) {
					if (P.type1.equals("fighting")) {
						damage*= 2;
						
					}
					if (P.type1.equals("poison")) {
						damage*= 2;
						
					}
					if (P.type1.equals("psychic")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("dark")) {
						damage*= 0;
						
					}
					//
					if (P.type2.equals("fighting")) {
						damage*= 2;
						
					}
					if (P.type2.equals("poison")) {
						damage*= 2;
						
					}
					if (P.type2.equals("psychic")) {
						damage*= 0.5;
						
					}
				}
				if (moves[m][3].equals("dark")) {
					if (P.type1.equals("fighting")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("psychic")) {
						damage*= 2;
						
					}
					if (P.type1.equals("dark")) {
						damage*= 0.5;
						
					}
					//
					if (P.type2.equals("fighting")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("psychic")) {
						damage*= 2;
						
					}
					if (P.type2.equals("dark")) {
						damage*= 0.5;
						
					}
				}
				if (moves[m][3].equals("fighting")) {
					if (P.type1.equals("ice")) {
						damage*= 2;
						
					}
					if (P.type1.equals("flying")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("poison")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("psychic")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 2;
						
					}
					if (P.type1.equals("dark")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("ice")) {
						damage*= 2;
						
					}
					if (P.type2.equals("flying")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("poison")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("psychic")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 2;
						
					}
					if (P.type2.equals("dark")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("flying")) {
					if (P.type1.equals("electric")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type1.equals("fighting")) {
						damage*= 2;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 0.5;
						
					}
					//
					if (P.type2.equals("electric")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type2.equals("fighting")) {
						damage*= 2;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 0.5;
						
					}
				}
				if (moves[m][3].equals("poison")) {
					if (P.type1.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type1.equals("poison")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 0.5;
						
					}
					//
					if (P.type2.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type2.equals("poison")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 0.5;
						
					}
				}
				P.hp -= damage;
			}
			else if (moves[m][4].equals("physical")) {
				damage = attack*Double.parseDouble(moves[m][1])/P.defense;
				damageConstant = damage;
				if (moves[m][3].equals(type1) || moves[m][3].equals(type2)) {
					damage *= 1.5;
				}
				if (moves[m][3].equals("fire")) {
					if (P.type1.equals("fire")) {
						damage *= .5;
						
					}
					if (P.type1.equals("water")) {
						damage *= .5;
						
					}
					if (P.type1.equals("grass")) {
						damage *= 2;
						
					}
					if (P.type1.equals("ice")) {
						damage *= 2;
						
					}
					if (P.type1.equals("rock")) {
						damage *= .5;
						
					}
					if (P.type2.equals("fire")) {
						damage *= .5;
						
					}
					if (P.type2.equals("water")) {
						damage *= .5;
						
					}
					if (P.type2.equals("grass")) {
						damage *= 2;
						
					}
					if (P.type2.equals("ice")) {
						damage *= 2;
						
					}
					if (P.type2.equals("rock")) {
						damage *= .5;
						
					}
				}
				if (moves[m][3].equals("water")) {
					if (P.type1.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type1.equals("water")) {
						damage*= .5;
						
					}
					if (P.type1.equals("grass")) {
						damage*= .5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 2;
						
					}
					if (P.type2.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type2.equals("water")) {
						damage*= .5;
						
					}
					if (P.type2.equals("grass")) {
						damage*= .5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("grass")) {
					if (P.type1.equals("fire")) {
						damage*= .5;
						
					}
					if (P.type1.equals("water")) {
						damage*= 2;
						
					}
					if (P.type1.equals("grass")) {
						damage*= .5;
						
					}
					if (P.type1.equals("poison")) {
						damage*= .5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type1.equals("flying")) {
						damage*= .5;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("fire")) {
						damage*= .5;
						
					}
					if (P.type2.equals("water")) {
						damage*= 2;
						
					}
					if (P.type2.equals("grass")) {
						damage*= .5;
						
					}
					if (P.type2.equals("poison")) {
						damage*= .5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type2.equals("flying")) {
						damage*= .5;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("ground")) {
					if (P.type1.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type1.equals("electric")) {
						damage*= 2;
						
					}
					if (P.type1.equals("grass")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("poison")) {
						damage*= 2;
						
					}
					if (P.type1.equals("flying")) {
						damage*= 0;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type2.equals("electric")) {
						damage*= 2;
						
					}
					if (P.type2.equals("grass")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("poison")) {
						damage*= 2;
						
					}
					if (P.type2.equals("flying")) {
						damage*= 0;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("rock")) {
					if (P.type1.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type1.equals("ice")) {
						damage*= 2;
						
					}
					if (P.type1.equals("fighting")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("flying")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("fire")) {
						damage*= 2;
						
					}
					if (P.type2.equals("ice")) {
						damage*= 2;
						
					}
					if (P.type2.equals("fighting")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("flying")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("ice")) {
					if (P.type1.equals("water")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type1.equals("ice")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type1.equals("flying")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("water")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type2.equals("ice")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 2;
						
					}
					if (P.type2.equals("flying")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("electric")) {
					if (P.type1.equals("water")) {
						damage*= 2;
						
					}
					if (P.type1.equals("electric")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("grass")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 0;
						
					}
					if (P.type1.equals("flying")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("water")) {
						damage*= 2;
						
					}
					if (P.type2.equals("electric")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("grass")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 0;
						
					}
					if (P.type2.equals("flying")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("psychic")) {
					if (P.type1.equals("fighting")) {
						damage*= 2;
						
					}
					if (P.type1.equals("poison")) {
						damage*= 2;
						
					}
					if (P.type1.equals("psychic")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("dark")) {
						damage*= 0;
						
					}
					//
					if (P.type2.equals("fighting")) {
						damage*= 2;
						
					}
					if (P.type2.equals("poison")) {
						damage*= 2;
						
					}
					if (P.type2.equals("psychic")) {
						damage*= 0.5;
						
					}
				}
				if (moves[m][3].equals("dark")) {
					if (P.type1.equals("fighting")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("psychic")) {
						damage*= 2;
						
					}
					if (P.type1.equals("dark")) {
						damage*= 0.5;
						
					}
					//
					if (P.type2.equals("fighting")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("psychic")) {
						damage*= 2;
						
					}
					if (P.type2.equals("dark")) {
						damage*= 0.5;
						
					}
				}
				if (moves[m][3].equals("fighting")) {
					if (P.type1.equals("ice")) {
						damage*= 2;
						
					}
					if (P.type1.equals("flying")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("poison")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("psychic")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 2;
						
					}
					if (P.type1.equals("dark")) {
						damage*= 2;
						
					}
					//
					if (P.type2.equals("ice")) {
						damage*= 2;
						
					}
					if (P.type2.equals("flying")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("poison")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("psychic")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 2;
						
					}
					if (P.type2.equals("dark")) {
						damage*= 2;
						
					}
				}
				if (moves[m][3].equals("flying")) {
					if (P.type1.equals("electric")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type1.equals("fighting")) {
						damage*= 2;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 0.5;
						
					}
					//
					if (P.type2.equals("electric")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type2.equals("fighting")) {
						damage*= 2;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 0.5;
						
					}
				}
				if (moves[m][3].equals("poison")) {
					if (P.type1.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type1.equals("poison")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("ground")) {
						damage*= 0.5;
						
					}
					if (P.type1.equals("rock")) {
						damage*= 0.5;
						
					}
					//
					if (P.type2.equals("grass")) {
						damage*= 2;
						
					}
					if (P.type2.equals("poison")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("ground")) {
						damage*= 0.5;
						
					}
					if (P.type2.equals("rock")) {
						damage*= 0.5;
						
					}
				}
				P.hp-=damage;
			}

		}
	if ((damageConstant*1.5) < damage) {
		System.out.println(moves[m][0] + " is super effective on " + P.name);
	}
	else if (damageConstant > damage) {
		System.out.println(moves[m][0] + " is not very effective on " + P.name);
	}
	else if (damage == 0) {
		System.out.println(moves[m][0] + " had no effect on " + P.name);
	}
	else {
		System.out.println("");
	}


	}
 }		 
