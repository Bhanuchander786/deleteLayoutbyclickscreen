package com.example.reddy.deletelayoutbyclickscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout ll;
    Button b;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(this);
        ll = findViewById(R.id.linear2);
    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.btn1) {
            View v1 = getLayoutInflater().inflate(R.layout.ilinear, null);
            ((TextView)v1.findViewById(R.id.txt1)).setText(""+i);
            v1.setOnClickListener(this);
            i++;
            v1.setTag(i);
            ll.addView(v1);

        }


        if(view.getId()!=R.id.btn1)
        {
            int j = (int)view.getTag();
            View v = ll.findViewWithTag(j);
            ll.removeView(v);

        }


    }

}



