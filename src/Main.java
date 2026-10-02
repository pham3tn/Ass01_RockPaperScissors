import java.util.Scanner;
public class Main {
    void main()
    {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean done = false;
        boolean playing = true;

        do {

            do {
                IO.print("Player A enter your RPS move [RPSrps]: ");
                playerA = in.nextLine();

                if (playerA.matches("[RPSrps]")) {
                    IO.println("Got player A move " + playerA);
                    done = true;
                } else {
                    IO.println("You must enter [RPSrps] not " + playerA);
                }

            } while (!done);

            done = false;

            do {
                IO.print("Player B enter your RPS move [RPSrps]: ");
                playerB = in.nextLine();

                if (playerB.matches("[RPSrps]")) {
                    IO.println("Got player B move " + playerB);
                    done = true;
                } else {
                    IO.println("You must enter [RPSrps] not " + playerB);
                }

            } while (!done);


            // tạo trường hợp tie trước để nhanh hơn
            if (playerA.equalsIgnoreCase(playerB))
                IO.println("It's a tie!");

            else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P"))
                IO.println("Paper covers rock. Player B win!");

            else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S"))
                IO.println("Rock breaks scissors. Player A win!");

            else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R"))
                IO.println("Paper covers rock. Player A win!");

            else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S"))
                IO.println("Scissors cut paper. Player B win!");

            else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R"))
                IO.println("Rock breaks scissors. Player B win!");

            else
                IO.println("Scissors cut paper. Player A win!");

            IO.println("Do you want to play again? [Y/N]: " );
            playAgain = in.nextLine();

            if(playAgain.equalsIgnoreCase("Y"))
                playing = true;
            else
                playing = false;


        }while(playing);
    }
}
