package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etfirst,etsecond;
    private TextView tvAns;
    private Button btnSum,btnSub,btnDiv;
    Float first,second,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAns=findViewById(R.id.tvAns);
        etfirst=findViewById(R.id.etfirst);
        etsecond=findViewById(R.id.etsecond);
        btnSum=findViewById(R.id.btnSum);
        btnSub=findViewById(R.id.btnSub);
        btnDiv=findViewById(R.id.btnDiv);

        final Arithemetic arithemetic=new Arithemetic();

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Float.parseFloat(etfirst.getText().toString());
                second=Float.parseFloat(etsecond.getText().toString());
                result=arithemetic.subtract(first,second);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Float.parseFloat(etfirst.getText().toString());
                second=Float.parseFloat(etsecond.getText().toString());
                result=arithemetic.divide(first,second);
            }
        });

    }
    private void Add(){
        float first=Float.parseFloat(etfirst.getText().toString());
        float second=Float.parseFloat(etsecond.getText().toString());
        Arithemetic arithemetic=new Arithemetic();

        float result=arithemetic.add(first,second);

        Intent intent=new Intent(MainActivity.this,ResultActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }
}
