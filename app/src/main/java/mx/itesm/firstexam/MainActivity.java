package mx.itesm.firstexam;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button scissorButton;
    Button paperButton;
    Button resetButton;
    TextView scoreText;
    TextView cpuChoice;
    int cpuChoiceInt = 1;  //1: Rock, 2: Scissors, 3: Paper
    int cpuScore = 0;
    int playerScore = 0;
    Random r = new Random();
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        rockButton = findViewById(R.id.rock);
        scissorButton = findViewById(R.id.scissors);
        paperButton = findViewById(R.id.paper);
        resetButton = findViewById(R.id.reset);
        scoreText = findViewById(R.id.score);
        cpuChoice = findViewById(R.id.cpu);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast result = new Toast(context);
                cpuChoiceInt = r.nextInt(3)+1;
                switch(cpuChoiceInt){
                    case 1://rock
                        cpuChoice.setText("CPU chose Rock!");
                        result.makeText(context, "Game is tied!", Toast.LENGTH_LONG).show();
                        break;
                    case 2://scissors
                        cpuChoice.setText("CPU chose Scissors!");
                        playerScore++;
                        result.makeText(context, "Player wins!", Toast.LENGTH_LONG).show();
                        break;
                    case 3://paper
                        cpuChoice.setText("CPU chose Paper!");
                        cpuScore++;
                        result.makeText(context, "CPU wins!", Toast.LENGTH_LONG).show();
                        break;
                }
                String aux = playerScore + " : " + cpuScore;
                scoreText.setText(aux);
            }
        });

        scissorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpuChoiceInt = r.nextInt(3)+1;
                Toast result = new Toast(context);
                switch(cpuChoiceInt){
                    case 1://rock
                        cpuChoice.setText("CPU chose Rock!");
                        cpuScore++;
                        result.makeText(context, "CPU wins!", Toast.LENGTH_LONG).show();
                        break;
                    case 2://scissors
                        cpuChoice.setText("CPU chose Scissors!");
                        result.makeText(context, "Game is tied!", Toast.LENGTH_LONG).show();
                        break;
                    case 3://paper
                        cpuChoice.setText("CPU chose Paper!");
                        playerScore++;
                        result.makeText(context, "Player wins!", Toast.LENGTH_LONG).show();
                        break;
                }
                String aux = playerScore + " : " + cpuScore;
                scoreText.setText(aux);
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpuChoiceInt = r.nextInt(3)+1;
                Toast result = new Toast(context);
                switch(cpuChoiceInt){
                    case 1://rock
                        cpuChoice.setText("CPU chose Rock!");
                        playerScore++;
                        result.makeText(context, "Player wins!", Toast.LENGTH_LONG).show();
                        break;
                    case 2://scissors
                        cpuChoice.setText("CPU chose Scissors!");
                        cpuScore++;
                        result.makeText(context, "CPU wins!", Toast.LENGTH_LONG).show();
                        break;
                    case 3://paper
                        cpuChoice.setText("CPU chose Paper!");
                        result.makeText(context, "Game is tied!!", Toast.LENGTH_LONG).show();
                        break;
                }
                String aux = playerScore + " : " + cpuScore;
                scoreText.setText(aux);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerScore = 0;
                cpuScore = 0;
                String aux = playerScore + " : " + cpuScore;
                scoreText.setText(aux);
            }
        });
    }
}
