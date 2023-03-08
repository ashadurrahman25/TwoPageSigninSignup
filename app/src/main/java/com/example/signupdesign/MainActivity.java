package com.example.signupdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView textView,regester;
    EditText username,password;
    Button button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.chatzulu);
        regester = findViewById(R.id.regester);
        username = findViewById(R.id.userName);
        password = findViewById(R.id.passw);
        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pas = password.getText().toString();

                if(user.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter username", Toast.LENGTH_SHORT).show();
                } else if (pas.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter password", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this, "login succesfully", Toast.LENGTH_SHORT).show();

                }
            }
        });
        

        ColorTextview(textView, getResources().getColor(R.color.perple),getResources().getColor(R.color.blue));

        regester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                Intent intent = new Intent(MainActivity.this,Signup.class);
                startActivity(intent);

            }
        });

  }

    private void ColorTextview(TextView textView,int...Color)
    {
        TextPaint paint = textView.getPaint();
        float weith = paint.measureText(textView.getText().toString());

        Shader shader = new LinearGradient(0,0,weith,textView.getTextSize(),Color,null,Shader.TileMode.CLAMP);
        textView.getPaint().setShader(shader);

        textView.setTextColor(Color[0]);
    }

}