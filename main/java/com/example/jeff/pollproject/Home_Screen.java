package com.example.jeff.pollproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.*;

public class Home_Screen extends AppCompatActivity implements View.OnClickListener{

    private Button login,sign_up;
    private EditText PasswordField, UsernameField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        init();
    }
    private void init(){
        login = (Button)findViewById(R.id.login);
        sign_up = (Button)findViewById(R.id.sign_up);
//        view = (Button)findViewById(R.id.view);
//        create = (Button)findViewById(R.id.create);
//        btnA = (Button)findViewById(R.id.btnA);
//        btnB = (Button)findViewById(R.id.btnB);
//        btnC = (Button)findViewById(R.id.btnC);
//        btnD = (Button)findViewById(R.id.btnD);
//        percentA = (TextView)findViewById(R.id.percentA);
//        percentB = (TextView)findViewById(R.id.percentB);
//        percentC = (TextView)findViewById(R.id.percentC);
//        percentD = (TextView)findViewById(R.id.percentD);
        PasswordField = (EditText)findViewById(R.id.PasswordField);
        UsernameField = (EditText)findViewById(R.id.UsernameField);
//        ansA = (EditText)findViewById(R.id.ansA);
//        ansB = (EditText)findViewById(R.id.ansB);
//        ansC = (EditText)findViewById(R.id.ansC);
//        ansD = (EditText)findViewById(R.id.ansD);
//        edtQuestion = (EditText)findViewById(R.id.edtQuestion);

        login.setOnClickListener(this);
        sign_up.setOnClickListener(this);
//        view.setOnClickListener(this);
//        create.setOnClickListener(this);
//        btnA.setOnClickListener(this);
//        btnB.setOnClickListener(this);
//        btnC.setOnClickListener(this);
//        btnD.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        String Username = UsernameField.getText().toString();
        String Password = PasswordField.getText().toString();
//        String ans_A = ansA.getText().toString();
//        String ans_B = ansB.getText().toString();
//        String ans_C = ansC.getText().toString();
//        String ans_D = ansD.getText().toString();
        switch (view.getId()){
            case R.id.login:
                Intent options = new Intent(Home_Screen.this,options_menu.class);
                startActivity(options);
                break;
            case R.id.sign_up:
                Intent create_account = new Intent (Home_Screen.this, Create_Account.class);
                startActivity(create_account);
                break;
        }
    }
}
