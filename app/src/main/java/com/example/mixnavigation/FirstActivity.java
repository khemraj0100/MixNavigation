package com.example.mixnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class FirstActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    String pass= "Password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editText=(EditText)findViewById(R.id.edit1);

        button=(Button)findViewById(R.id.buttonclk);







        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch(view.getId()){
                    case R.id.buttonclk:
                        String id=editText.getText().toString().trim();
                        if(id.equals(pass))
                        {
                            Intent i=new Intent(FirstActivity.this,MainActivity.class);
                            i.putExtra("id", id);
                            startActivity(i);

                        }
else
                        {
                            Toast. makeText(getApplicationContext(), "This is a message displayed in a Toast", Toast. LENGTH_SHORT).show();                        }
                        break;
                }

            }
        });
    }
}