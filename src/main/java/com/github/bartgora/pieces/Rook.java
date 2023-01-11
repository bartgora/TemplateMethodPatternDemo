package com.github.bartgora.pieces;

public final class Rook extends ChessPiece {
    public Rook(String rank, Integer file) {
        super(PieceType.ROOK, rank, file);
    }


    @Override
    public boolean checkMovement(Position position) {

        return false;
    }

}
