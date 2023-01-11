package com.github.bartgora.pieces;

public enum PieceType {
    PAWN("P"),
    ROOK("R"),
    QUEEN("Q"),
    KNIGHT("N"),
    BISHOP("B"),
    KING("K");

    private final String value;

    PieceType(String piece) {
        this.value = piece;
    }

    public String getValue() {
        return value;
    }
}
