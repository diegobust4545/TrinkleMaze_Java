package org.zacharski;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by raz on 3/11/15.
 */


public class Room {

    public class Exit {
        public String description;
        public int next;

        public Exit(String description, int next){
            this.description = description;
            this.next = next;
        }
    }


    String title;
    String description;
    ArrayList<Exit> exits;


    private int arrows = 5;
    private int student = 1;
    private int infinitechasm = 2;
    private int infinitechasm2 = 16;
    private int sleepingstudent = 13;


    public Room(String title, String desc){
        exits = new ArrayList<Exit>();
        this.title = title;
        this.description = desc.replace("@@", "\n");
    }

    public void addExit(String name, int roomNum)
    {
        exits.add(new Exit(name, roomNum));
    }


    public void describe()
    {
        Game game = new Game("dodecahedron.txt");
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n" + title);
        System.out.println(description + "\n");

        for(int i = 0; i < exits.size(); i++)
        {

            if(exits.get(i).next == infinitechasm || exits.get(i).next == infinitechasm2)
            {
                System.out.println("One of the exits has a Infinite Chasm ");
                System.out.println("");

            }

            if(exits.get(i).next == sleepingstudent && student == 1)
            {
                System.out.println("There is a strong smell of undead coming from one of the doors");
                System.out.println();
                System.out.println();
                System.out.println("Do you wish to shoot an arrow at that exit?: ");
                System.out.println("1) Shoot Arrow");
                System.out.println("2) Don't Shoot Arrow");
                int shoot = scan.nextInt();
                if(arrows>0 & shoot == 1)
                {
                    if (shoot == 1 && arrows > 0) {

                        Random generator = new Random();
                        int shootrandom = generator.nextInt(100);
                        if (shootrandom >= 50) {
                            System.out.println("You killed the Student and revealed the secret Passcode to exit game");
                            System.out.println("3046");
                            student = student - 1;


                        } else {
                            System.out.println("Sorry you missed");
                            arrows = arrows - 1;
                            System.out.println("You have " + arrows + " arrows left.");
                        }
                    }
                }

                if(0>arrows && shoot == 1)
                {
                    System.out.println("You do not have enough arrows to shoot at the door");
                    System.out.println("Please go to the Vending Supplies room to get more arrows.");
                    System.out.println();
                }
                if(shoot == 2)
                {
                    System.out.println("You did not shoot any arrows.");
                }



            }

            if (exits.get(i).next == sleepingstudent + 1 || exits.get(i).next == sleepingstudent - 1 && student == 1)
            {
                System.out.println("There is a slight smell of undead in the air ");
            }

        }

        System.out.println();


        System.out.println("There are the following exits:");
        int i = 1;
        for (Exit exit : exits){
            //System.out.print("%d ", i);
            //System.out.println(exits);
            System.out.printf("   %d) %s\n", i++, exit.description);

        }


    }
    public int move(int exitnum)
    {
        return exits.get(exitnum-1).next;
    }

}
