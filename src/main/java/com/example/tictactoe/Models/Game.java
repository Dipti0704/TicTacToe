package com.example.tictactoe.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Game {
    private Board board;
    private List<List<Player>> players;
    private List<Move> moves;
    private EnumGameStack gameStack;
    private Player winner;
    private int currIndex;
}
