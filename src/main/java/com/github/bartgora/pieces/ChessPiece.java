package com.github.bartgora.pieces;

public abstract sealed class ChessPiece permits Pawn, Rook, Knight, King, Queen, Bishop {

    protected final PieceType type;
    protected Position position;

    protected ChessPiece(PieceType type, String rank, Integer file) {
        this.type = type;
        this.position = new Position(rank, file);
    }

    public void play(String rank, Integer file) {
        var position = checkPosition();
        if (checkMovement(position)) {
            move(rank, file);
        }

    }

    /**
     * Get your current position
     */
    public Position checkPosition() {
        return this.position;
    }

    /**
     * Check if the selected move is possible for this chess
     */
    protected abstract boolean checkMovement(Position position);

    /**
     * Make a move in one of the possible positions
     */
    protected void move(final String rank, final Integer file) {
        this.position = new Position(rank, file);
    }

}
