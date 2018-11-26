package lhance.rivera.com.riveradelossantosprojectv3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class OpeningPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opening_page);
    }

    public void LogIn (View v) {
        Intent i = new Intent(this, LoginPage.class);
        startActivity(i);
    }

    public void SignUp (View v) {
        Intent i = new Intent(this, SignUpPage.class);
        startActivity(i);
    }

}
