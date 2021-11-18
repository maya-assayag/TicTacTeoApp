package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameDisplay extends AppCompatActivity {

    private TicTacToaBoard ticTacToaBoard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_display);

        ticTacToaBoard = findViewById(R.id.ticTacToaBoard);
    }

    public void playAgainButtonClick(View view){
        ticTacToaBoard.resetGame();
        ticTacToaBoard.invalidate();
    }

    public void homeButtonClick(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}