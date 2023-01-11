package com.github.bartgora.pieces;

public final class Knight extends ChessPiece {
    public Knight(String rank, Integer file) {
        super(PieceType.KNIGHT, rank, file);
    }

    @Override
    public boolean checkMovement(Position position) {

        return false;
    }

}
