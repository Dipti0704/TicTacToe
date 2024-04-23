package com.example.tictactoe.Models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cell {
    private int row;
    private int col;
    private Player player;
    private EnumCellStack cellStack;
}
