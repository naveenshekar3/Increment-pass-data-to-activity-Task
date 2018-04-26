package com.example.root.incrementpassdatatoactivitytask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    private TextView secondNumberTv;
    private Button second_count_btn;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        secondNumberTv=(TextView)findViewById(R.id.secondNumberTv);

        Intent intent=getIntent();
        intent.getStringExtra("value");
        secondNumberTv.setText(intent.getStringExtra("value"));
        number=Integer.parseInt(intent.getStringExtra("value"));
        //intent.putExtra("info",secondNumberTv.getText().toString());
        //setResult(RESULT_OK,intent);


    }

    public void secondCount(View view) {
        Intent i=new Intent();
        number+=1;
        String numStr=Integer.toString(number);
        secondNumberTv.setText(numStr);
        number=Integer.parseInt(numStr);
        i.putExtra("info",numStr);
        setResult(RESULT_OK,i);

    }
}
