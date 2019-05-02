package ca.pufferfish.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected EditText editText1, editText2;
    protected Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);

    }
    public void checkLogin(View v)
    {
        if (editText1.getText().toString().equals("admin") && editText2.getText().toString().equals("1234"))
        {
            Toast.makeText(this, "successful", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(".UserActivity");
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Login Failed",Toast.LENGTH_LONG).show();
        }
    }
}
