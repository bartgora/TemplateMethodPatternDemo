package com.github.bartgora.pieces;

public final class King extends ChessPiece {
    public King(String rank, Integer file) {
        super(PieceType.KING, rank, file);
    }

    @Override
    public boolean checkMovement(Position position) {
        return false;
    }

}
