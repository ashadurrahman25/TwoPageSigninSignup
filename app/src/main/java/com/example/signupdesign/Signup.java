package com.example.signupdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    EditText userName,passwrod,gmail;
    CheckBox checkBox;
    Button signup;
    private String view;
    RadioGroup radioGroup;
    private int check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


         ititID();
         OnclickedMathod();

         Toastmaggage(String.valueOf(view));

    }

    private void Toastmaggage(String view) {

        Toast.makeText(this, ""+view, Toast.LENGTH_SHORT).show();
    }

    private void OnclickedMathod() {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                i = check;


            }
        });


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


                if(b= true)
                {
                    signup.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String name = userName.getText().toString();
                            String pass = passwrod.getText().toString();
                            String mail = gmail.getText().toString();


                            if(name.isEmpty())
                            {
                                Toastmaggage("Eneter name");
                            } else if (mail.isEmpty()) {

                                Toastmaggage("Enter mail");

                            } else if (pass.isEmpty()) {
                                Toastmaggage("Enter password");

                            }else {
                                Toastmaggage("signup succesfully");
                                Intent intent = new Intent(Signup.this,MainActivity.class);
                                startActivity(intent);
                            }


                        }
                    });


                }


            }
        });

    }

    private void ititID() {

        userName =findViewById(R.id.userSU);
        passwrod = findViewById(R.id.passwordSU);
        gmail = findViewById(R.id.mailSU);
        checkBox = findViewById(R.id.checkboxSU);
        signup = findViewById(R.id.signupSU);
        radioGroup = findViewById(R.id.gender);

    }
}