package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etfirst,etsecond;
    private Button btnSum,btnSub,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirst=findViewById(R.id.etfirst);
        etsecond=findViewById(R.id.etsecond);
        btnSum=findViewById(R.id.btnSum);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });

    }
    private void Add(){
        float first=Float.parseFloat(etfirst.getText().toString());
        float second=Float.parseFloat(etsecond.getText().toString());
        Arithemetic arithemetic=new Arithemetic();

        float result=arithemetic.add(first,second);

        Intent intent=new Intent(MainActivity.this,MainActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }
}
