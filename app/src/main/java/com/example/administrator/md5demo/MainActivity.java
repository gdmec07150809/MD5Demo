package com.example.administrator.md5demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.Telephony.Carriers.PASSWORD;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.md1).setOnClickListener(this);
        findViewById(R.id.md2).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.md1:
                TextView name= (TextView) findViewById(R.id.name);
                String str=name.getText().toString();
                TextView result= (TextView) findViewById(R.id.mi1);
                result.setText( "加密后："+MD5Utils.md5(str));
                break;
            case R.id.md2:
                TextView name2= (TextView) findViewById(R.id.user_name);
                TextView password= (TextView) findViewById(R.id.user_password);
                String str1=name2.getText().toString();
                String str2=password.getText().toString();
                TextView result2= (TextView) findViewById(R.id.mi2);
                result2.setText("加密后："+  MD5Utils.Md5(str1,str2));
                break;
        }
    }
}
