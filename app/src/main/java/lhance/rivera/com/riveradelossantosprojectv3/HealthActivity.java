package lhance.rivera.com.riveradelossantosprojectv3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HealthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_activity);
    }
    public void BreX (View v) {
        Intent i = new Intent(this, TriviaBreathing.class);
        startActivity(i);
    }

    public void Med (View v) {
        Intent i = new Intent(this, TriviaMeditation.class);
        startActivity(i);
    }

    public void GuIm (View v) {
        Intent i = new Intent(this, TriviaGuidedImagery.class);
        startActivity(i);
    }

    public void Vis (View v) {
        Intent i = new Intent(this, TriviaVisualization.class);
        startActivity(i);
    }

    public void Exer (View v) {
        Intent i = new Intent(this, TriviaExercise.class);
        startActivity(i);
    }
}
