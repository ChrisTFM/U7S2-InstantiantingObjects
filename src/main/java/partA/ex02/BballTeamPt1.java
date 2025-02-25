package partA.ex02;


import partA.ex01.Player;

import static partA.ex01.Player.getPlayers;

public class BballTeamPt1 {
    public static String BballTeam() {
        Player player_1 = getPlayers("Stephen Curry");
        Player player_2 = getPlayers("Michael Jordan ");
        String response = "";

        player_1.varaible = "Michael Jordan ";


        response += (player_1.name == player_2.name) + "\n";
        response += (player_1.height == player_2.height) + "\n";
        response += (player_1.years == player_2.years) + "\n";
        response += (player_1.varaible == player_2.varaible) + "\n";

        return response;
    }

    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
