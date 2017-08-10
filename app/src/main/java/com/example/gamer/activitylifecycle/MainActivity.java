package com.example.gamer.activitylifecycle;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView vtxt;
    Button bt1;
    String mytxt;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vtxt = (TextView)findViewById(R.id.text);
        if(savedInstanceState!=null)
        {
            String myStr = savedInstanceState.getString("counter");
            if(vtxt!=null)
            {
                count = Integer.parseInt(myStr);
                vtxt.setText(myStr);
            }
        }
    }

    public void onclick(View view) {
        count++;
        vtxt.setText(Integer.toString(count));
    }
    @Override
    protected void onSaveInstanceState(Bundle state)
    {
        super.onSaveInstanceState(state);
        mytxt = Integer.toString(count);
        state.putString("counter",mytxt);
    }
}
