package lhance.rivera.com.riveradelossantosprojectv3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
    }

    public void buttonLoginClick(View v)
    {

        EditText a = findViewById(R.id.ETuname);
        String user = a.getText().toString();
        EditText b = findViewById(R.id.ETpass);
        String pass = b.getText().toString();

        String password = helper.searchPass(user);
        if(pass.equals(password))
        {
            Intent i = new Intent(this,HealthActivity.class) ;// health activity dito pepe
            startActivity(i);

        }
        else
        {
            Toast temp = Toast.makeText(this, "Username and Password does not match ", Toast.LENGTH_SHORT); //
            temp.show();

        }


    }

    public void backButton (View v) {
        Intent i = new Intent(this, OpeningPage.class);
        startActivity(i);


    }
}
