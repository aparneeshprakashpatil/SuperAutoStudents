import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

import javax.imageio.stream.FileCacheImageOutputStream;
public class Fighting {

    public static void initializingEnemyTeam(){
        int x = Game.turns-1;
        
        if (x == 1){
            Ant ant1 = new Ant(2,1,1,"Ant",false,false);
            Ant ant2 = new Ant(2,1,1,"Ant",false,false);
            Empty empty3 = new Empty(0, 0, 0, "_", false, false);
            Empty empty1 = new Empty(0, 0, 0, "_", false, false);
            Empty empty2 = new Empty(0, 0, 0, "_", false, false);
            Main.enemyPets.add(ant1);
            Main.enemyPets.add(ant2);
            Main.enemyPets.add(empty3);
            Main.enemyPets.add(empty1);
            Main.enemyPets.add(empty2);
        } if (x ==2) {
            Fish fish1 = new Fish(2,2,1,"Fish",false,false);
            Cricket cricket1 = new Cricket(1,2,1,"Cricket",false,false);
            Elephant elephant= new Elephant(3, 5, 1, "Elephant", false, false);
            Empty empty1 = new Empty(0, 0, 0, "_", false, false);
            Empty empty2 = new Empty(0, 0, 0, "_", false, false);
            Main.enemyPets.add(fish1);
            Main.enemyPets.add(cricket1);
            Main.enemyPets.add(elephant);
            Main.enemyPets.add(empty1);
            Main.enemyPets.add(empty2);
        }
        if (x == 3){
            Elephant elephant = new Elephant(3,6,1,"Elephant",false,false);
            Peacock peacock = new Peacock(4,4,1,"Peacock",false,false);
            Ant ant = new Ant(2,1,1,"Ant",false,false);
            Swan swan = new Swan(1,3, 1, "Swan",false, false);
            Empty empty = new Empty(0, 0, 0, "_", false, false);
            Main.enemyPets.add(elephant);
            Main.enemyPets.add(peacock);
            Main.enemyPets.add(ant);
            Main.enemyPets.add(swan);
            Main.enemyPets.add(empty);
        }
        if (x == 4){
            Elephant elephant = new Elephant(4,6,1,"Elephant",false,false);
            Peacock peacock = new Peacock(5,4,1,"Peacock",false,false);
            Cricket cricket = new Cricket(2,2,1,"Cricket",false,false);
            Swan swan = new Swan(1,3, 1, "Swan",false, false);
            Peacock peacock2 = new Peacock(2,5,1,"Peacock",false,false);
            Main.enemyPets.add(peacock);
            Main.enemyPets.add(cricket);
            Main.enemyPets.add(swan);
            Main.enemyPets.add(peacock2);
            Main.enemyPets.add(elephant);
        } else{
            Elephant elephant = new Elephant(20,20,1,"Elephant",false,false);
            Peacock peacock = new Peacock(5,4,1,"Peacock",false,false);
            Cricket cricket = new Cricket(2,2,1,"Cricket",false,false);
            Swan swan = new Swan(1,3, 1, "Swan",false, false);
            Peacock peacock2 = new Peacock(2,5,1,"Peacock",false,false);
            Main.enemyPets.add(peacock);
            Main.enemyPets.add(cricket);
            Main.enemyPets.add(swan);
            Main.enemyPets.add(peacock2);
            Main.enemyPets.add(elephant);
        }
    }

    public static void theSwap(){
        Main.fightingPets.add(Main.playerPets.get(0));
        Main.fightingPets.add(Main.playerPets.get(1));
        Main.fightingPets.add(Main.playerPets.get(2));
        Main.fightingPets.add(Main.playerPets.get(3));
        Main.fightingPets.add(Main.playerPets.get(4));
    }
    public static void theUnSwap(){
        Main.fightingPets.remove(0);
        Main.fightingPets.remove(0);
        Main.fightingPets.remove(0);
        Main.fightingPets.remove(0);
        Main.fightingPets.remove(0);
    }

    

    public static void currentlyFighting(){
        int enemyIndex = 0;
        Scrambler.scrambleETeam();
        int index = 4;
        boolean hey = true;
        while (hey){
            System.out.println(Game.teamName + " vs. " + Game.enemyTeamName );
            timeStop(500);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Your current student fighting:                                                Current enemy student fighting:");
            System.out.println(Main.fightingPets.get(index).getName()+ "  " +"|Level " + Main.fightingPets.get(index).getLevel() + "| " + "✊ " + Main.fightingPets.get(index).getAtk() + " 🧡 " + Main.fightingPets.get(index).getHp()+"                                        " + Main.enemyPets.get(enemyIndex).getName()+ "  " +"|Level " + Main.enemyPets.get(enemyIndex).getLevel() + "| " + "✊ " + Main.enemyPets.get(enemyIndex).getAtk() + " 🧡 " + Main.enemyPets.get(enemyIndex).getHp());
            Main.fightingPets.get(index).attack(Main.enemyPets.get(enemyIndex));
            Main.enemyPets.get(enemyIndex).attack(Main.fightingPets.get(index));

            if (Main.fightingPets.get(index).getHp()<=0){
                //increases if dead
                if (index - 1 > 0){
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("The opposing team's " + Main.enemyPets.get(enemyIndex).getName() + " knocked out your " + Main.playerPets.get(index).getName() + "!");
                    index--;
                } else {
                    if(Main.enemyPets.get(enemyIndex).getHp() <= 0) {
                        if (enemyIndex + 1 == 5){
                            Main.clearScreen();
                            turnTie();

                        } else {
                            if (Game.lives - 1 == 0){
                                Game.gameOver();
                            } else {
                                Main.clearScreen();
                                Game.lives = Game.lives -1;
                                turnLost();
                                
                            }
                        }
                    }
                    if (Game.lives - 1 == 0){
                        Game.gameOver();
                    } else {
                        Main.clearScreen();
                        
                        Game.lives = Game.lives -1;
                        turnLost();
                    }
                    

                }
            } // end if player dies
            if (Main.enemyPets.get(enemyIndex).getHp()==0 || Main.enemyPets.get(enemyIndex).getHp() < 0){
                if (enemyIndex + 1 < 5){
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Your " + Main.playerPets.get(index).getName() + " knocked out their " + Main.enemyPets.get(enemyIndex).getName() + "!");
                    enemyIndex++;
                } else {
                    if(Main.fightingPets.get(enemyIndex).getHp() == 0 || Main.fightingPets.get(enemyIndex).getHp()<0 ) {
                        if (index + 1 == 5){
                            Main.clearScreen();
                            turnTie();

                        } else {
                           Main.clearScreen();
                           Game.wins++;
                           turnWon();
                           
                           
                           
                        }
                    }

                }
            }
            timeStop(2400);
            Main.clearScreen();
        }
    }

    public static void timeStop(int x){
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void turnWon(){
        Scanner in = new Scanner(System.in);
        System.out.println("Victory!");
        System.out.println("");
        System.out.println("Enter w to continue.");
        String val = in.nextLine();
        switch (val){
            case "w":
                Game.endFight();
                break;
            default:
                Game.endFight();
                break;

        }
    }
    
    public static void turnLost(){
        Scanner in = new Scanner(System.in);
        System.out.println("Turn Lost!");
        System.out.println("");
        System.out.println("Enter L to continue.");
        String val = in.nextLine();
        switch (val){
            case "L":
                Game.endFight();
                break;
            default:
                Game.endFight();
                break;

        }
    }

    public static void turnTie(){
        Scanner in = new Scanner(System.in);
        System.out.println("Tie!");
        System.out.println("");
        System.out.println("Enter anything to continue.");
        String val = in.nextLine();
        switch (val){
            case "L":
                Game.endFight();
                break;
            default:
                Game.endFight();
                break;

        }
    }
}


