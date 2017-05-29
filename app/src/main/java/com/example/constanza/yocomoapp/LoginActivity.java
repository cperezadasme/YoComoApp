package com.example.constanza.yocomoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button boton = (Button)findViewById(R.id.entrarButton);
        usernameEditText = (EditText)findViewById(R.id.usernameEditText);

        boton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String username = usernameEditText.getText().toString();

                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra("Nombre Usuario", username);
                startActivity(intent);

            }
        });

    }
}
