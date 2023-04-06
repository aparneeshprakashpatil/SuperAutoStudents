import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date; 
import java.util.concurrent.TimeUnit;
class Main{
    public static int stupidvalue = 3;
    public static ArrayList<SuperPets> playerPets = new ArrayList<SuperPets>();
    public static ArrayList<SuperPets> shopPets = new ArrayList<SuperPets>();
    public static ArrayList<SuperPets> emptyness = new ArrayList<SuperPets>();
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        settingEmpty();
        System.out.println("Welcome to Super Auto Students!");
        System.out.println("Would you like to learn the rules before you start playing (y, n)?");
        Rulesyesorno();
        Scrambler.scrambleTeam();
        confirm();
        Game.start();
        
    }

    public static String ynq(){
        Scanner in = new Scanner(System.in);
        String val = in.nextLine();
        return val;
    }



    public static void confirm(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Your team name is " + Game.teamName);
        System.out.println("Would you like to keep it (y) or roll for a better one (n)? (You have " + stupidvalue + " rolls left.)");
        System.out.println("Use y/n to confirm.");
        System.out.println();
        String val = in.nextLine();
        switch (val){
            case "n":
                if (stupidvalue > 0){
                    stupidvalue=stupidvalue-1;
                    Scrambler.scrambleTeam();
                    confirm();
                } else {
                    System.out.println("You're out of luck! (and rolls to spend)");
                    try{
                        Thread.sleep(800);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                break;
            case "y":
                break;
            default:
               System.out.println("Please select yes or no");
               confirm();
        }
    }


    public static void Rulesyesorno(){
        String val = ynq();
        switch (val){
            case "y":
                //rules
            case "n":
                break;
            default:
                System.out.println("Please enter either y for yes or n for no.");
                Rulesyesorno();
        }
    }

    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
     
        System.out.flush();  
     
     }

     public static void settingEmpty(){
        Empty empty1 = new Empty(0,0,0,"_",false,false);
        Empty empty2 = new Empty(0,0,0,"_",false,false);
        Empty empty3 = new Empty(0,0,0,"_",false,false);
        Empty empty4 = new Empty(0,0,0,"_",false,false);
        Empty empty5 = new Empty(0,0,0,"_",false,false);
        playerPets.add(empty1);
        playerPets.add(empty2);
        playerPets.add(empty3);
        playerPets.add(empty4);
        playerPets.add(empty5);
        emptyness.add(empty1);
     }
}
