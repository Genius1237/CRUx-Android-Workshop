package com.example.skrpl.devworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x=0;
    EditText u,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b= (Button) findViewById(R.id.bTn);
        u= (EditText) findViewById(R.id.eTU);
        p= (EditText) findViewById(R.id.eTP);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String us=u.getText().toString();
                String ps=p.getText().toString();
                if(us.equals("Username")&&ps.equals("Password")){
                    Intent i=new Intent(MainActivity.this,HomeScreenActivity.class);
                    i.putExtra("uname",us);
                    startActivity(i);
                }

            }
        });

    }
    
    //This can also be used
    /*
    public void onClick(View v){
        TextView tV1= (TextView) findViewById(R.id.tV1);
        x++;
        tV1.setText("Button Clicked "+x+" times");
    }
    */
}
