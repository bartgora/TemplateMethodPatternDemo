package com.github.bartgora.pieces;

public final class Queen extends ChessPiece {
    public Queen(String rank, Integer file) {
        super(PieceType.QUEEN, rank, file);
    }

    @Override
    public boolean checkMovement(Position position) {

        return false;
    }

}
