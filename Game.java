import java.util.Scanner;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.PrintWriter; // Writes to a file
import java.util.ArrayList;
import java.lang.StringIndexOutOfBoundsException;
import java.util.Collections;
public class Game {
    public static String teamName;
    public static int turns;
    public static int gold;
    public static int lives;
    public static int wins;
    public static boolean shopOpened;
    public static String enemyTeamName;
   public Game(){

    }





    public static void start(){
        turns = turns +1;
        gold = 10;
        lives = 5;
        wins = 0;
        shopOpened = false;
        Main.clearScreen();
        Top();
        Middle();
        Bottom();
    }
    public static void mainMenu(){
        Main.clearScreen();
        Top();
        Middle();
        Bottom();
    }
    public static void Top(){
        System.out.println("|💰 " + gold + "|   " + "|🧡 " + lives + "|   " + "|🏆 " + wins + "/10|   " + "|⌛ " + turns + "|   " + teamName);
    }
    public static void Middle(){
        //need to do
        System.out.println();
        System.out.println(); 
        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; i++){
            if(Main.playerPets.get(i).getName().equals("_")){
                System.out.print("  _______________  ");
            } else {
                System.out.print(Main.playerPets.get(i).getName()+ "" +"|LV " + Main.playerPets.get(i).getLevel() + "|" + "✊" + Main.playerPets.get(i).getAtk() + " 🧡" + Main.playerPets.get(i).getHp() + "  ");
            }
            
        }
        System.out.println(); 
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public static void Bottom(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("1 - Manage order of your team or sell an animal");
        System.out.println("2 - Check student shop");
        System.out.println("3 - End Turn");
        String val = in.nextLine();
        switch (val){
            case "1":
                choice1();;
                break;
            case "2":
                if (!shopOpened){
                    shopOpened = true;
                    Main.clearScreen();
                    Game.Top();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    Shop.logic();
                } else{
                    Shop.shopMenu();
                }
                break;
            case "3":
                turnOver();
                fight();
                break;
            default:
                System.out.println("Please type either 1, 2 or 3");
                Bottom();
                break;
        }
        
    }

    public static void choice1(){
        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("1 - Manage order");
        System.out.println("2 - Sell an animal");
        System.out.println("3 - Go back to menu");
        String val = in.nextLine();
        switch (val){
            case "1":
                swapping();
                break;
            case "2":
                //wip
                break;
            case "3":
                Game.mainMenu();
                break;
            default:
                System.out.println("Please select an option listed above.");
                break;
        }
    }

    public static void choice12(){
        Empty empty1 = new Empty(0, 0, 0, "_", false, false);
        Empty empty2 = new Empty(0, 0, 0, "_", false, false);
        Empty empty3 = new Empty(0, 0, 0, "_", false, false);
        Empty empty4 = new Empty(0, 0, 0, "_", false, false);
        Empty empty5 = new Empty(0, 0, 0, "_", false, false);
        Scanner in = new Scanner(System.in);
        System.out.println("Which student would you like to sell? (1- leftmost, 5-rightmost) or press 6 to go back");
        System.out.println();
        String val = in.nextLine();
        switch (val){
            case "1":
                Game.gold++;
                Main.playerPets.set(0, empty1);
                Game.mainMenu();
                break;
            case "2":
            Game.gold++;
                Main.playerPets.set(1, empty2);
                Game.mainMenu();
                break;
            case "3":
                Game.gold++;
                Main.playerPets.set(2, empty3);
                Game.mainMenu();
                break;
            case "4":
                Game.gold++;
                Main.playerPets.set(3, empty4);
                Game.mainMenu();
                break;
            case "5":
            Game.gold++;
            Main.playerPets.set(4, empty5);
            Game.mainMenu();
                break;
            case "6":
                choice1();
                break;
            default:
                System.out.println("Please select a valid option");
                System.out.println();
                choice12();
        }
    }

    public static void swapping(){
        Scanner in = new Scanner(System.in);
        System.out.println("Select a student that you would like to move. (1 is leftmost and 5 is rightmost student in your team)  Or enter 6 to go back.");
        String val = in.nextLine();
        switch (val){
            case "1":
                swapping2(1);
                break;
            case "2":
            swapping2(2);
                break;
            case "3":
            swapping2(3);
                break;
            case "4":
            swapping2(4);
                break;
            case "5":
            swapping2(5);
                break;
            case "6":
            Game.mainMenu();
            default:
                System.out.println("Please select a student or press 6 to go back.");
                swapping();
                break;
            
        }
    }

    public static void swapping2(int a) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select a position where you would like to move the student. (If there is already a student there, it will swap their positions.) Or press 6 to cancel out.");
        String val = in.nextLine();
        switch (val){
            case "1":
                Collections.swap(Main.playerPets, a-1, 0);
                Game.mainMenu();
                break;
            case "2":
            Collections.swap(Main.playerPets, a-1, 1);
            Game.mainMenu();
                break;
            case "3":
            Collections.swap(Main.playerPets, a-1, 2);
            Game.mainMenu();
                break;
            case "4":
            Collections.swap(Main.playerPets, a-1, 3);
            Game.mainMenu();
                break;
            case "5":
             Collections.swap(Main.playerPets, a-1, 4);
             Game.mainMenu();
                break;
            case "6":
            Game.mainMenu();
            default:
                System.out.println("Please select a position or press 6 to go back.");
                swapping2(a);
                break;
            
        }
    }

    public static void turnOver(){
        turns = turns +1;
        gold = 10;
        Main.clearScreen();
        
        fight();
    }
    
    public static void mainGame(){

    }

    public static void gameOver(){
        System.out.println("You lost!");
        System.exit(0);
    }

    public static void fight(){
        Main.playerPets.get(0).setBattleHP();
        Main.playerPets.get(1).setBattleHP();
        Main.playerPets.get(2).setBattleHP();
        Main.playerPets.get(3).setBattleHP();
        Main.playerPets.get(4).setBattleHP();
        
        Fighting.theSwap();
        Fighting.initializingEnemyTeam();
        Fighting.currentlyFighting();
    }

    public static void endFight(){
        Fighting.theUnSwap();
        Main.enemyPets.remove(0);
        Main.enemyPets.remove(0);
        Main.enemyPets.remove(0);
        Main.enemyPets.remove(0);
        Main.enemyPets.remove(0);
        if (Main.shopPets.size() == 1){
            Main.shopPets.add(Main.emptyness.get(0));
            Main.shopPets.add(Main.emptyness.get(0));
        }  else if (Main.shopPets.size() == 2){
            Main.shopPets.add(Main.emptyness.get(0));
        } else if (Main.shopPets.size() == 0){
            Main.shopPets.add(Main.emptyness.get(0));
            Main.shopPets.add(Main.emptyness.get(0));
            Main.shopPets.add(Main.emptyness.get(0));
        }
        for (int i = 0; i<Main.shopPets.size() + 3; i++){
            Main.shopPets.remove(0);
        }
        Main.playerPets.get(0).reset();
        Main.playerPets.get(1).reset();
        Main.playerPets.get(2).reset();
        Main.playerPets.get(3).reset();
        Main.playerPets.get(4).reset();
        Shop.turnEnded();
        Game.mainMenu();
    }

    public int getWins(){
        return wins;
    }
    public int getTurns(){
        return turns;
    }
    public int getGold(){
        return gold;
    }
    public int getLives(){
        return lives;
    }
    public void setWins(int h){
        wins = h;
    }
    public void setTurns(int h){
        turns = h;
    }
    public void setGold(int h){
        gold = h;
    }
    public void setLives(int h){
        lives = h;
    }
}
