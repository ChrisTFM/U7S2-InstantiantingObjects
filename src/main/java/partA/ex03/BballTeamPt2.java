package partA.ex03;

import partA.ex01.Player;

import static partA.ex01.Player.getPlayers;

public class BballTeamPt2 {
    public static String BballTeam() {
        String response = "";

        Player player_1 = getPlayers("Stephen Curry");
        Player player_2 = getPlayers("Michael Jordan ");

        player_1.name = new String("Stephen Curry");
        player_2.name = new String("Michael Jordan");

        response += (player_1.name == player_2.name) + "\n";

        player_1.name = "Stephen Curry";
        player_2.name = "Stephen Curry";

        response += (player_1.name == player_2.name) + "\n";

        return response;
    }

    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
