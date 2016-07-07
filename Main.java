package org.zacharski;

import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        Game trinkle = new Game("dodecahedron.txt");
        boolean go = true;
        System.out.println();
        int move = 0;
        int infinitechasm1 = 16;
        int infinitechasm2 = 2;
        while(go == true)
        {
            if(trinkle.currentState == 10 )
            {
                System.out.println("Enter the secret Passcode to exit Trinkle hall");
                int password = scan.nextInt();
                if(password == 3046)
                {
                    System.out.println("Congratulations! You have unlocked the door to get out of Trinkle Basement");
                    System.out.println();
                    System.out.println("Do you wish to: ");
                    System.out.println("1) Exit Game ");
                    System.out.println("2) Restart Game ");
                    int winner = scan.nextInt();
                    while(winner>2||winner<0)
                    {
                        System.out.println("Please choose option 1) or 2).");
                        int winner2 = scan.nextInt();
                        winner = winner2;
                    }
                    if(winner == 1)
                    {
                        System.out.println("You are now exiting the game");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("New game will now start. ");
                    }
                }
            }
            if(trinkle.currentState == infinitechasm1)
            {
                System.out.println("You fell into a Infinite Chasms and Died.");
                System.out.println();
                System.out.println("What would you like to do next?");
                System.out.println("1) Revive and Continue Game");
                System.out.println("2) New Game");
                System.out.println("3) Exit Game");
                int gameoption = scan.nextInt();
                while(gameoption > 3 || gameoption < 0)
                {
                    System.out.println("Please enter a value exit of 1-3: ");
                    int gameoption2 = scan.nextInt();
                    gameoption = gameoption2;

                }
                if(gameoption == 1)
                {
                    System.out.println("You will now continue the game.");
                }
                if(gameoption == 2)
                {
                    System.out.println("You are starting a new game.");

                }
                if(gameoption == 3)
                {
                    System.out.println("You have now exit the game.");
                    System.exit(0);
                }
            }
            if(trinkle.currentState == infinitechasm2)
            {
                System.out.println("You fell into a Infinite Chasms and Died.");
                System.out.println();
                System.out.println("What would you like to do next?");
                System.out.println("1) Revive and Continue Game");
                System.out.println("2) New Game");
                System.out.println("3) Exit Game");
                int gameoption = scan.nextInt();
                while(gameoption > 3 || gameoption < 0)
                {
                    System.out.println("Please enter a value exit of 1-3: ");
                    int gameoption2 = scan.nextInt();
                    gameoption = gameoption2;

                }
                if(gameoption == 1)
                {
                    System.out.println("You will now continue the game.");
                }
                if(gameoption == 2)
                {
                    System.out.println("You are starting a new game.");

                }
                if(gameoption == 3)
                {
                    System.out.println("You have now exit the game.");
                    System.exit(0);
                }
            }
            if(13 == trinkle.currentState)
            {
                System.out.println("There is a dead sleeping computer science student you died.");
                System.out.println();
                System.out.println("What would you like to do next?");
                System.out.println("1) Revive and Continue Game");
                System.out.println("2) New Game");
                System.out.println("3) Exit Game");
                int gameoption = scan.nextInt();
                while(gameoption > 3 || gameoption < 0)
                {
                    System.out.println("Please enter a value exit of 1-3: ");
                    int gameoption2 = scan.nextInt();
                    gameoption = gameoption2;

                }
                if(gameoption == 1)
                {
                    System.out.println("You will now continue the game.");
                }
                if(gameoption == 2)
                {
                    System.out.println("You are starting a new game.");

                }
                if(gameoption == 3)
                {
                    System.out.println("You have now exit the game.");
                    System.exit(0);
                }

            }


            trinkle.describeRoom();
            System.out.println("CurrentState " +trinkle.currentState);
            System.out.println();
            System.out.println("Which exit would you like to choose?: ");
            int exitmove = scan.nextInt();
            while(exitmove > 3 || exitmove < 0)
            {
                System.out.println("Please enter a value exit of 1-3: ");
                int exitmove2 = scan.nextInt();
                exitmove = exitmove2;

            }

            trinkle.move(exitmove);

        }





    }
}
