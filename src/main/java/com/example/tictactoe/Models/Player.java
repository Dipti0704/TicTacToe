package com.example.tictactoe.Models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
    private String name;
    private Symbol symbol;
    private EnumPlayerType playerType;

}
