package com.github.bartgora;

import com.github.bartgora.factory.ChessFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class GameTest {

    private final ChessFactory chessFactory;

    public GameTest() {
        chessFactory = new ChessFactory();
    }

    @Test
    void kingShouldMove() {
        //given
        var king = chessFactory.createPieces(List.of("Kd1")).get(0);

        //when
        king.play("d", 2);

        //then
        assertThat(king.checkPosition().rank()).isEqualTo("d");
        assertThat(king.checkPosition().file()).isEqualTo(2);
    }

    @Test
    void rookShouldMove() {
        //given
        var king = chessFactory.createPieces(List.of("Ra1")).get(0);

        //when
        king.play("a", 8);

        //then
        assertThat(king.checkPosition().rank()).isEqualTo("a");
        assertThat(king.checkPosition().file()).isEqualTo(8);
    }

    @Test
    void queenShouldMove() {
        //given
        var king = chessFactory.createPieces(List.of("Qe1")).get(0);

        //when
        king.play("h", 4);

        //then
        assertThat(king.checkPosition().rank()).isEqualTo("h");
        assertThat(king.checkPosition().file()).isEqualTo(4);
    }

    @Test
    void knightShouldMove() {
        //given
        var king = chessFactory.createPieces(List.of("Ng1")).get(0);

        //when
        king.play("f", 3);

        //then
        assertThat(king.checkPosition().rank()).isEqualTo("f");
        assertThat(king.checkPosition().file()).isEqualTo(3);
    }

    @Test
    void bishopShouldMove() {
        //given
        var king = chessFactory.createPieces(List.of("Bc1")).get(0);

        //when
        king.play("f", 4);

        //then
        assertThat(king.checkPosition().rank()).isEqualTo("f");
        assertThat(king.checkPosition().file()).isEqualTo(4);
    }

    @Test
    void pawnShouldMove() {
        //given
        var king = chessFactory.createPieces(List.of("Pa2")).get(0);

        //when
        king.play("a", 4);

        //then
        assertThat(king.checkPosition().rank()).isEqualTo("a");
        assertThat(king.checkPosition().file()).isEqualTo(4);
    }
}
