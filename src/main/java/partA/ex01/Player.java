package partA.ex01;

public class Player {

    public String varaible = "";
    public String name = "";
    public String height = "";
    public int years = 0;

    public static String player() {
        String response = "";

        Player player_1 = new Player();
        response += "Player 1: \n";

        player_1.varaible = "Stephen Curry";
        response += "variable: " + player_1.varaible + "\n";
        player_1.name = "Stephen Curry";
        response += "Name: " + player_1.name + "\n";
        player_1.height = "6'2";
        response += "Height: " + player_1.height + "\n";
        player_1.years = 13;
        response += "Years in the League: " + player_1.years + " years\n";

        Player player_2 = new Player();
        response += "\nPlayer 2:\n";
        player_2.varaible = "Michael Jordan ";
        response += "variable: " + player_2.varaible + "\n";
        player_2.name = "Michael Jordan";
        response += "Name: " + player_2.name + "\n";
        player_2.height = "6'6";
        response += "Height: " + player_2.height + "\n";
        player_2.years = 15;
        response += "Years in the League: " + player_2.years + " years";

        return response;
    }

    public static Player getPlayers(String var) {
        Player player_1 = new Player();

        player_1.varaible = "Stephen Curry";
        player_1.name = "Stephen Curry";
        player_1.height = "6'2";
        player_1.years = 13;

        Player player_2 = new Player();
        player_2.varaible = "Michael Jordan ";
        player_2.name = "Michael Jordan";
        player_2.height = "6'6";
        player_2.years = 15;

        if (var == player_1.varaible) {return player_1;}
        if (var == player_2.varaible) {return player_2;}
        return null;
    }

    public static void main(String[] args) {
        String playerOutput = player();
        System.out.print(playerOutput);
    }
}
