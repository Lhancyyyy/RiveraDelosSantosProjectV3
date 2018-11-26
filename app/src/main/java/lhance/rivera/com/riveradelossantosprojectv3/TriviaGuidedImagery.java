package lhance.rivera.com.riveradelossantosprojectv3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TriviaGuidedImagery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivia_guided_imagery);
    }

    public void onbackClick (View v) {
        Intent i = new Intent(this, HealthActivity.class);
        startActivity(i);
    }
}
