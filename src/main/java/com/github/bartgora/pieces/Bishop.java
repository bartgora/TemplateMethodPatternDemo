package com.github.bartgora.pieces;

public final class Bishop extends ChessPiece {
    public Bishop(String rank, Integer file) {
        super(PieceType.BISHOP, rank, file);
    }

    @Override
    public boolean checkMovement(Position position) {

        return false;
    }

}
