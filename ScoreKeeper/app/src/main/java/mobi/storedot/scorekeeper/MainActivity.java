package mobi.storedot.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the goals against Team A
    int team_a_scoreAgainst = 0;

    // Tracks the Fouls done by Team A
    int team_a_scoreFoul = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    // Tracks the goals against Team B
    int team_b_scoreAgainst = 0;

    // Tracks the Fouls done by Team B
    int team_b_scoreFoul = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point/Goal.
     */
    public void addOneGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the Goal Against statistic Team A by 1 point/Goal.
     */
    public void addOneGoalAgainstTeamA(View v) {
        team_a_scoreAgainst = team_a_scoreAgainst + 1;
        displayAgainstTeamA(team_a_scoreAgainst);
    }

    /**
     * Increase the Fouls Statistic for Team A by 1 point/Foul.
     */
    public void addOneFoulForTeamA(View v) {
        team_a_scoreFoul = team_a_scoreFoul + 1;
        displayFoulsTeamA(team_a_scoreFoul);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the Goal Against statistic Team B by 1 point/Goal.
     */
    public void addOneGoalAgainstB(View v) {
        team_b_scoreAgainst = team_b_scoreAgainst + 1;
        displayAgainstTeamB(team_b_scoreAgainst);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addOneFoulForTeamB(View v) {
        team_a_scoreFoul = team_a_scoreFoul + 1;
        displayFoulsTeamB(team_a_scoreFoul);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        team_a_scoreAgainst = 0;
        team_a_scoreFoul = 0;
        scoreTeamB = 0;
        team_b_scoreAgainst = 0;
        team_b_scoreFoul = 0;

        displayForTeamA(scoreTeamA);
        displayAgainstTeamA(team_a_scoreAgainst);
        displayFoulsTeamA(team_a_scoreFoul);
        displayForTeamB(scoreTeamB);
        displayAgainstTeamB(team_b_scoreAgainst);
        displayFoulsTeamB(team_b_scoreFoul);
    }

    /**
     * Displays the given Goals/points for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Goals Against Team A.
     */
    public void displayAgainstTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreAgainst);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * /**
     * Displays the given Fouls done by Team A.
     */
    public void displayFoulsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreFoul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Goals Against Team B.
     */
    public void displayAgainstTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_scoreAgainst);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Fouls done by Team B.
     */
    public void displayFoulsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_scoreFoul);
        scoreView.setText(String.valueOf(score));
    }
}
