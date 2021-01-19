package app.techsol.medicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FirstScreenActivity extends AppCompatActivity {
    TextView textView2, textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstScreenActivity.this, MainActivity.class));
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstScreenActivity.this, MainActivity.class));
            }
        });
    }
}