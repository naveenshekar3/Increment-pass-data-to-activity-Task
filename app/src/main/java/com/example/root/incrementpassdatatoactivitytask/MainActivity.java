package com.example.root.incrementpassdatatoactivitytask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView number_tv;
    private Button count_btn,next_btn;
    public int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_tv=(TextView)findViewById(R.id.number_tv);

    }

    public void next(View view) {
        Intent intent=new Intent(MainActivity.this,SecondScreen.class);
        String pickValue=number_tv.getText().toString();
        intent.putExtra("value",pickValue);
        startActivityForResult(intent,200);
    }

    public void count(View view) {
        String result=number_tv.getText().toString();
        temp=Integer.parseInt(result);
        temp+=1;

        String temp_string=Integer.toString(temp);

        number_tv.setText(temp_string);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==200)
        {
            if (resultCode==RESULT_OK)
            {
                number_tv.setText(data.getStringExtra("info"));
            }
        }
    }
}
