import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    public static ArrayList<SuperPets> shopPets = new ArrayList<SuperPets>();
    public Shop(){

    }

    public static void shopMenu(){
        Main.clearScreen();
        Game.Top();
        System.out.println();
        System.out.println();
        System.out.println("Current students in shop:");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < Main.shopPets.size(); i++){
            System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        logic2();

    }
    public static void logic(){
        int val = Game.turns;
        if (val > 0 && val < 3){
            rolling1();
            rolling1();
            rolling1();
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();

        } else if (val == 3){
            try{
                Thread.sleep(800);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*2)+1);
                if (x == 1){
                    rolling1();
                } else{
                    rolling2();
                }
            }
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();
        }
         else if (val > 3 && val < 5){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*2)+1);
                if (x == 1){
                    rolling1();
                } else{
                    rolling2();
                }
            }
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();
        } else if (val == 5){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*3)+1);
                if (x == 1){
                    rolling1();
                } else if (x ==2){
                    rolling2();
                } else{
                    rolling3();
                }
            }
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();
        } else if (val > 5 && val < 7){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*3)+1);
                if (x == 1){
                    rolling1();
                } else if (x ==2){
                    rolling2();
                } else{
                    rolling3();
                }
            }
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();
        } else if (val == 7){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*4)+1);
                if (x == 1){
                    rolling1();
                } else if (x ==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else {
                    rolling4();
                }
            }
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();
        } else if (val > 7 && val < 9){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*4)+1);
                if (x == 1){
                    rolling1();
                } else if (x ==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else {
                    rolling4();
                }
            }
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();
        } else if (val == 9){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*5)+1);
                if (x == 1){
                    rolling1();
                } else if (x ==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else if (x == 4) {
                    rolling4();
                } else{
                    rolling5();
                }
            }
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();
        } else if (val > 9 && val < 11){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*5)+1);
                if (x == 1){
                    rolling1();
                } else if (x ==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else if (x == 4) {
                    rolling4();
                } else{
                    rolling5();
                }
            }
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();
        } else if (val == 11){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*6)+1);
                if (x == 1){
                    rolling1();
                } else if (x ==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else if (x == 4) {
                    rolling4();
                } else if (x ==5){
                    rolling5();
                } else{
                    rolling6();
                }
            }
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();
        } else {
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*6)+1);
                if (x == 1){
                    rolling1();
                } else if (x ==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else if (x == 4) {
                    rolling4();
                } else if (x ==5){
                    rolling5();
                } else{
                    rolling6();
                }
            }
            for (int i = 0; i < Main.shopPets.size(); i++){
                System.out.print(Main.shopPets.get(i).getName()+ "  " +"|Level " + Main.shopPets.get(i).getLevel() + "| " + "✊ " + Main.shopPets.get(i).getAtk() + " 🧡 " + Main.shopPets.get(i).getHp()+"                  ");
            }
            logic2();
        }
    }

    public static void turnEnded(){
        int val = Game.turns;
        if (val > 0 && val < 3){
            rolling1();
            rolling1();
            rolling1();

        } else if (val == 3){
            try{
                System.out.println("Tier 2 Students Unlocked!");
                Thread.sleep(800);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*2)+1);
                if (x == 1){
                    rolling1();
                } else{
                    rolling2();
                }
            }
        }
         else if (val > 3 && val < 5){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*2)+1);
                if (x == 1){
                    rolling1();
                } else{
                    rolling2();
                }
            }
        } else if (val == 5){
            try{
                System.out.println("Tier 3 Students Unlocked!");
                Thread.sleep(800);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*3)+1);
                if (x == 1){
                    rolling1();
                } else if (x==2){
                    rolling2();
                } else{
                    rolling3();
                }
            }
        } else if (val > 5 && val < 7){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*3)+1);
                if (x == 1){
                    rolling1();
                } else if (x==2){
                    rolling2();
                } else{
                    rolling3();
                }
            }
        } else if (val == 7){
            try{
                System.out.println("Tier 4 Students Unlocked!");
                Thread.sleep(800);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*4)+1);
                if (x == 1){
                    rolling1();
                } else if (x==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else{
                    rolling4();
                }
            }
        } else if (val > 7 && val < 9){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*4)+1);
                if (x == 1){
                    rolling1();
                } else if (x==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else{
                    rolling4();
                }
            }
        } else if (val == 9){
            try{
                System.out.println("Tier 5 Students Unlocked!");
                Thread.sleep(800);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*5)+1);
                if (x == 1){
                    rolling1();
                } else if (x==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else if (x ==4){
                    rolling4();
                } else{
                    rolling5();
                }
            }
        } else if (val > 9 && val < 11){
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*5)+1);
                if (x == 1){
                    rolling1();
                } else if (x==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else if (x ==4){
                    rolling4();
                } else{
                    rolling5();
                }
            }
        } else if (val == 11){
            try{
                System.out.println("Tier 6 Students Unlocked!");
                Thread.sleep(800);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*6)+1);
                if (x == 1){
                    rolling1();
                } else if (x==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else if (x ==4){
                    rolling4();
                } else if (x ==5){
                    rolling5();
                } else{
                    rolling6();
                }
            }
        } else {
            for (int i = 0; i < 3; i++){
                int x = (int)(Math.floor(Math.random()*6)+1);
                if (x == 1){
                    rolling1();
                } else if (x==2){
                    rolling2();
                } else if (x ==3){
                    rolling3();
                } else if (x ==4){
                    rolling4();
                } else if (x ==5){
                    rolling5();
                } else{
                    rolling6();
                }
            }
        }
    }



    public static void logic2(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Main.shopPets.size());
        System.out.println("What would you like to do?");
        System.out.println("1 - Select a student to view");
        System.out.println("2 - Select a student to purchase (Cost 💰 3) ");
        System.out.println("3 - Roll (💰 1)");
        System.out.println("4 - Go back to the main menu");
        String val = in.nextLine();
        switch (val){
            case "1":
                break;
            case "2":
                buyingStudent();
                break;
            case "3":
                
                    if (Game.gold > 0){
                        Game.gold = Game.gold -1;
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
                        Main.clearScreen();
                        Game.Top();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        logic();
                        } else {
                            System.out.println("You're out of gold!");
                            try{
                                Thread.sleep(800);
                            } catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            shopMenu();
                        }
                
                
                break;
            case "4":
                Game.mainMenu();   
                break;
            default:
                System.out.println("Please select an option that is either 1, 2, 3 or 4.");
                logic2();
        }
    }

    public static void viewingStudent(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Which student would you like to view? (1,2,3) Or enter 4 to go back.");
        String val = in.nextLine();
        switch (val){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                shopMenu();
                break;
            default:
                System.out.println("Please select an option that is either 1, 2, or 3.");
                viewingStudent();
        }
    }

    public static void buyingStudent(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Which student would you like to buy? (1,2,3) Or enter 4 to go back.");
        String val = in.nextLine();
        switch (val){
            case "1":
                if (Game.gold > 2){
                    Game.gold = Game.gold -3;
                    Main.playerPets.remove(0);
                    Main.playerPets.add(Main.shopPets.get(0));
                    Main.shopPets.remove(0);
                } else {
                    System.out.println("You don't have enough gold to purchase that.");
                    try{
                        Thread.sleep(800);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    
                }
                shopMenu();
                break;
            case "2":
            if (Game.gold > 2){
                Game.gold = Game.gold -3;
                Main.playerPets.remove(1);
                Main.playerPets.add(Main.shopPets.get(1));
                Main.shopPets.remove(1);
            } else {
                System.out.println("You don't have enough gold to purchase that.");
                try{
                    Thread.sleep(800);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                shopMenu();
            }
            shopMenu();
            break;
            case "3":
            if (Game.gold > 2){
                Game.gold = Game.gold -3;
                Main.playerPets.remove(2);
                Main.playerPets.add(Main.shopPets.get(2));
                Main.shopPets.remove(2);
            } else {
                System.out.println("You don't have enough gold to purchase that.");
                try{
                    Thread.sleep(800);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                shopMenu();
            }
            shopMenu();
            break;
            case "4":
                shopMenu();
                break;
            default:
                System.out.println("Please select an option that is either 1, 2, or 3.");
                viewingStudent();
        }
    }

    //kid named finger:

    public static void rolling1(){
       int x = (int)(Math.floor(Math.random()*5)) + 1;
       if (x == 1){
        Ant ant = new Ant(2,1,1,"Ant ⚀",false,false);
        Main.shopPets.add(ant);
       } else if ( x==2) {
        Cricket cricket = new Cricket(1,2,1,"Cricket ⚀",false,false);
        Main.shopPets.add(cricket);
       } else if (x ==3) {
        Fish fish = new Fish(2,2,1,"Fish ⚀",false,false);
        Main.shopPets.add(fish);
       } else if(x ==4){
        Horse horse = new Horse(2,1,1,"Horse ⚀",false,false);
        Main.shopPets.add(horse);
       } else{
        Pig pig = new Pig(4,1,1,"Pig ⚀",false,false);
        Main.shopPets.add(pig);
       }
    }

    public static void rolling2(){
        int x = (int)(Math.floor(Math.random()*4)) + 1;
        if (x == 1){
         Peacock peacock = new Peacock(2,5,1,"Peacock ⚁",false,false);
         Main.shopPets.add(peacock);
        } else if (x == 2){
            Elephant elephant = new Elephant(3,5,1,"Elephant ⚁",false,false);
            Main.shopPets.add(elephant);
        } else if (x == 3) {
            Swan swan = new Swan(1,3,1,"Swan ⚁",false,false);
            Main.shopPets.add(swan);
        } else{
            Spider spider = new Spider(2,2,1,"Spider ⚁",false,false);
            Main.shopPets.add(spider);
        }
    }

    public static void rolling3(){
        int x = (int)(Math.floor(Math.random()*4)) + 1;
        if (x == 1){
         Kangaroo kangaroo = new Kangaroo(1,2,1,"Kangaroo ⚂",false,false);
         Main.shopPets.add(kangaroo);
        } else if (x == 2){
            Sheep sheep = new Sheep(2,2,1,"Sheep ⚂",false,false);
            Main.shopPets.add(sheep);
        } else if (x == 3) {
            Camel camel = new Camel(2,5,1,"Camel ⚂",false,false);
            Main.shopPets.add(camel);
        } else{
            Dog dog = new Dog(2,2,1,"Dog ⚂",false,false);
            Main.shopPets.add(dog);
        }
    }

    public static void rolling4(){
        int x = (int)(Math.floor(Math.random()*3)) + 1;
        if (x == 1){
         Deer deer = new Deer(1,1,1,"Deer ⚃",false,false);
         Main.shopPets.add(deer);
        } else if (x == 2){
            Hippo hippo = new Hippo(4,5,1,"Hippo ⚃",false,false);
            Main.shopPets.add(hippo);
        } else if (x == 3) {
            Worm worm = new Worm(3,3,1,"Worm ⚃",false,false);
            Main.shopPets.add(worm);
        } 
    }

    public static void rolling5(){
        int x = (int)(Math.floor(Math.random()*3)) + 1;
        if (x == 1){
         Monkey monkey = new Monkey(1,1,1,"Monkey ⚄",false,false);
         Main.shopPets.add(monkey);
        } else if (x == 2){
            Scorpion scorpion = new Scorpion(4,5,1,"Scorpion ⚄",false,false);
            Main.shopPets.add(scorpion);
        } else if (x == 3) {
            Turkey turkey= new Turkey(3,3,1,"Turkey ⚄",false,false);
            Main.shopPets.add(turkey);
        } 
    }

    public static void rolling6(){
        int x = (int)(Math.floor(Math.random()*3)) + 1;
        if (x == 1){
         Snake snake = new Snake(6,6,1,"Snake ⚅",false,false);
         Main.shopPets.add(snake);
        } else if (x == 2){
            Trex trex = new Trex(9,4,1,"Trex ⚅",false,false);
            Main.shopPets.add(trex);
        } else if (x == 3) {
            Boar boar= new Boar(10,6,1,"Boar ⚅",false,false);
            Main.shopPets.add(boar);
        } 
    }

    //needs to be changed
    public static void desc(String h){
        switch (h){
            case "Ant":
                break;
            default:
                System.out.println("Something went wrong.");
                break;

        }

    }
}
