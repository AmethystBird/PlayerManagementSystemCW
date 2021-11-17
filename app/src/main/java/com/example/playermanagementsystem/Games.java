package com.example.playermanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Consider static class
public final class Games {
    //Add game objects to this class
    HashMap<Integer, Game> games = new HashMap<Integer, Game>();

    void DummyData()
    {
        Game dummyGame = new Game();
        dummyGame.gameTitle = "Choose Game";

        games.put(0, dummyGame);
    }

    /*static List<Game> Games = new ArrayList<Game>()
    {
        {
            //add("Select Game");
        }
    };*/

    //int gameAmount = 0;
}
