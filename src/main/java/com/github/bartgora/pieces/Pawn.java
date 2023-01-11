package com.github.bartgora.pieces;

public final class Pawn extends ChessPiece {

    public Pawn(String rank, Integer file) {
        super(PieceType.PAWN, rank, file);
    }

    @Override
    public boolean checkMovement(Position position) {

        return false;
    }

}
