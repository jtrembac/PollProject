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

public class options_menu extends AppCompatActivity implements View.OnClickListener {

    private Button view, create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);
        init();
    }

    private void init() {
//        login = (Button) findViewById(R.id.login);
//        sign_up = (Button) findViewById(R.id.sign_up);
        view = (Button) findViewById(R.id.view);
        create = (Button) findViewById(R.id.create);
//        btnA = (Button) findViewById(R.id.btnA);
//        btnB = (Button) findViewById(R.id.btnB);
//        btnC = (Button) findViewById(R.id.btnC);
//        btnD = (Button) findViewById(R.id.btnD);
//        percentA = (TextView) findViewById(R.id.percentA);
//        percentB = (TextView) findViewById(R.id.percentB);
//        percentC = (TextView) findViewById(R.id.percentC);
//        percentD = (TextView) findViewById(R.id.percentD);
//        PasswordField = (EditText) findViewById(R.id.PasswordField);
//        UsernameField = (EditText) findViewById(R.id.UsernameField);
//        ansA = (EditText) findViewById(R.id.ansA);
//        ansB = (EditText) findViewById(R.id.ansB);
//        ansC = (EditText) findViewById(R.id.ansC);
//        ansD = (EditText) findViewById(R.id.ansD);
//        edtQuestion = (EditText) findViewById(R.id.edtQuestion);

//        login.setOnClickListener(this);
//        sign_up.setOnClickListener(this);
        view.setOnClickListener(this);
        create.setOnClickListener(this);
//        btnA.setOnClickListener(this);
//        btnB.setOnClickListener(this);
//        btnC.setOnClickListener(this);
//        btnD.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.create:
                Intent create_quiz = new Intent(options_menu.this, poll_creation.class);
                startActivity(create_quiz);
                break;
            case R.id.view:
                Intent view_list = new Intent (options_menu.this, options_menu.class);
                startActivity(view_list);
                break;
        }
    }
}
