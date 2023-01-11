package com.github.bartgora.factory;

import com.github.bartgora.pieces.Bishop;
import com.github.bartgora.pieces.ChessPiece;
import com.github.bartgora.pieces.King;
import com.github.bartgora.pieces.Knight;
import com.github.bartgora.pieces.Pawn;
import com.github.bartgora.pieces.Queen;
import com.github.bartgora.pieces.Rook;

import java.util.List;
import java.util.stream.Collectors;

public class ChessFactory {

    public List<ChessPiece> createPieces(List<String> strings) {
        return strings.stream().map(string -> toChessPiece(string)).collect(Collectors.toList());
    }

    private ChessPiece toChessPiece(final String string) {
        var chess = string.substring(0, 1);
        var rank = string.substring(1, 2);
        var file = Integer.parseInt(string.substring(2, 3));

        ChessPiece chessPiece = switch (chess) {
            case "R" -> new Rook(rank, file);
            case "B" -> new Bishop(rank, file);
            case "K" -> new King(rank, file);
            case "Q" -> new Queen(rank, file);
            case "P" -> new Pawn(rank, file);
            case "N" -> new Knight(rank, file);
            default -> throw new IllegalStateException();
        };
        return chessPiece;
    }
}
