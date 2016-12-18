package com.example.afinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by user on 18/12/2559.
 */

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        final EditText editTextName = (EditText) findViewById(R.id.name_text_view);
        final EditText editTextUserName= (EditText) findViewById(R.id.user_name_regis_text_view);
        final EditText editTextPassword= (EditText) findViewById(R.id.pass_regis_text_view);

        Button btnCreateAnAccount=(Button)findViewById(R.id.create_button);
        btnCreateAnAccount.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String Name = editTextName.getText().toString();
                String userName = editTextUserName.getText().toString();
                String password = editTextPassword.getText().toString();


            }
        });
    }
}




