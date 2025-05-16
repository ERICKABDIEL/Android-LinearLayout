package com.example.prueba;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText editName = findViewById(R.id.user_name);
        TextView txtOut = findViewById(R.id.txt_output);
        Button btnSend = findViewById(R.id.btn_send);

        btnSend.setOnClickListener(v->{
            String name = editName.getText().toString();
            if(name.isEmpty()){
                Toast.makeText(this,"Write your name",
                        Toast.LENGTH_SHORT).show();
            }else{
                String out = "Hi "+name.toLowerCase()+"! welcome";
                txtOut.setText(out);
            }
        });


    }
}