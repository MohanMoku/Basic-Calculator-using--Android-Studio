package com.example.picknic;

import android.os.Bundle;
import android.view.View;
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

        EditText a;
        EditText b;
        Button button1, button2, button3, button4, button5;
        TextView result;

        a=findViewById(R.id.aValue);
        b=findViewById(R.id.bValue);
        button1=findViewById(R.id.addButton);
        button2=findViewById(R.id.subButton);
        button3=findViewById(R.id.mulButton);
        button4=findViewById(R.id.divButton);
        button5=findViewById(R.id.modButton);
        result=findViewById(R.id.result);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(!(a.getText().toString().equals("") || b.getText().toString().equals(""))) {
                    double val_a = Double.parseDouble(a.getText().toString());
                    double val_b = Double.parseDouble(b.getText().toString());
                    double ans1 = val_a + val_b;
                    result.setText(String.format("Sum : %.4f", ans1));
                } else {
                    Toast.makeText(MainActivity.this, "Enter the values",Toast.LENGTH_SHORT).show();

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(a.getText().toString().equals("") || b.getText().toString().equals(""))) {
                    double val_a = Double.parseDouble(a.getText().toString());
                    double val_b = Double.parseDouble(b.getText().toString());
                    double ans1 = val_a - val_b;
                    result.setText(String.format("Difference : %.4f", ans1));
                } else {
                    Toast.makeText(MainActivity.this, "Enter the values",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(a.getText().toString().equals("") || b.getText().toString().equals(""))) {
                    double val_a = Double.parseDouble(a.getText().toString());
                    double val_b = Double.parseDouble(b.getText().toString());
                    double ans1 = val_a * val_b;
                    result.setText(String.format("Product : %.4f", ans1));
                } else {
                    Toast.makeText(MainActivity.this, "Enter the values",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(a.getText().toString().equals("") || b.getText().toString().equals(""))) {
                    double val_a = Double.parseDouble(a.getText().toString());
                    double val_b = Double.parseDouble(b.getText().toString());
                    if(val_b==0){
                        Toast.makeText(MainActivity.this, "Zero Division Error",Toast.LENGTH_SHORT).show();
                    } else {
                        double ans1 = val_a / val_b;
                        result.setText(String.format("Quotient : %.4f", ans1));
                    }


                } else {
                    Toast.makeText(MainActivity.this, "Enter the values",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(a.getText().toString().equals("") || b.getText().toString().equals(""))) {
                    double val_a = Double.parseDouble(a.getText().toString());
                    double val_b = Double.parseDouble(b.getText().toString());
                    double ans1 = val_a % val_b;
                    result.setText(String.format("Remainder : %.4f", ans1));
                } else {
                    Toast.makeText(MainActivity.this, "Enter the values",Toast.LENGTH_SHORT).show();
                }
            }
        });

        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
    }
}