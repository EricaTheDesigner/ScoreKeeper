package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the quidditch score for 2 teams
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Slytherin
    int finalScoreSlytherin = 0;
    //Tracks the score for Gryffindor
    int finalScoreGryffindor = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayforTeamSlytherin(0);
        displayForTeamGryffindor(0);
    }

    /**
     * This method is to add points when Slytherin scores a goal
     */
    public void add10PointsSlytherin(View view) {
        finalScoreSlytherin = finalScoreSlytherin + 10;
        displayforTeamSlytherin(finalScoreSlytherin);
    }

    /**
     * This method is to add 150 points when Slytherin catches the snitch
     */
    public void addSnitchSlytherin(View view) {
        finalScoreSlytherin = finalScoreSlytherin + 150;
        displayforTeamSlytherin(finalScoreSlytherin);
    }


    /**
     * This method is to add points when Gryffindor scores a goal
     */
    public void add10PointsGryffindor(View view) {
        finalScoreGryffindor = finalScoreGryffindor + 10;
        displayForTeamGryffindor(finalScoreGryffindor);
    }

    /**
     * This method is to add 150 points when Gryffindor catches the snitch
     */
    public void addSnitchGryffindor(View view) {
        finalScoreGryffindor = finalScoreGryffindor + 150;
        displayForTeamGryffindor(finalScoreGryffindor);
    }

    /**
     * Displays the given score for Slytherin.
     */
    public void displayforTeamSlytherin(int score) {
        TextView scoreView = findViewById(R.id.final_score_slytherin);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Gryffindor.
     */
    public void displayForTeamGryffindor(int score) {
        TextView scoreView = findViewById(R.id.final_score_gryffindor);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * resets scores to 0
     */
    public void reset(View view){
        finalScoreSlytherin = 0;
        displayforTeamSlytherin(finalScoreSlytherin);
        finalScoreGryffindor = 0;
        displayForTeamGryffindor(finalScoreGryffindor);
    }

}
