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
                System.out.print("     _______________       ");
            } else {
                System.out.print("      "+Main.playerPets.get(i).getName()+ "  " +"|Level " + Main.playerPets.get(i).getLevel() + "| " + "✊ " + Main.playerPets.get(i).getAtk() + " 🧡 " + Main.playerPets.get(i).getHp()+"     ");
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
        System.out.println("1 - Manage order of your team");
        System.out.println("2 - Check student shop");
        System.out.println("3 - End Turn");
        String val = in.nextLine();
        switch (val){
            case "1":
                swapping();
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
        fight();
    }
    
    public static void mainGame(){

    }

    public static void fight(){
        endFight();
    }

    public static void endFight(){
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
