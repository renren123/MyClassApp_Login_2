package com.example.myclassapp_login;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.RadialGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.print.PrintAttributes;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int passWordTextSize = 20;
    EditText myAccount=null;
    EditText myPassword=null;
    Button buttonOK;
    private Window window;


    String accountName = "renwenjie",accountPassword = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题    ??????不能隐藏标题
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏

        buttonOK = (Button)findViewById(R.id.buttonok);
//        buttonOK.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(myAccount!=null && myPassword!=null)
//                {
//                    String editTextAccount = myAccount.getText().toString().trim();
//                    String editTextPassword = myPassword.getText().toString().trim();
//                    if(editTextAccount.equals(accountName) && editTextPassword.equals(accountPassword))
//                    {
//                        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//                        startActivity(intent);
//                    }
//                    else
//                    {
//                        Toast toast =Toast.makeText(MainActivity.this,"账户名或密码错误！",Toast.LENGTH_LONG);
//                        toast.show();
//                    }
//                }
//
//            }
//        });

        setContentView(R.layout.activity_main);
        //init();
        // 第一次学习的方法
        Paint_Password();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void  Paint_Password()
    {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.line_password);
        myAccount = new EditText(this);
        myAccount.setTextSize(passWordTextSize);
        myAccount.setHint("Account");
        //myAccount.m
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp2.setMargins(20,10,0,0);
        myAccount.setBackground(null);


        myAccount.setLeft(16);
        linearLayout.addView(myAccount,lp2);

        myPassword = new EditText(this);
        myPassword.setBackground(null);
        myPassword.setInputType(129); //129????????????????????   密码框？？？
        myPassword.setTextSize(passWordTextSize);
        myPassword.setHint("Password");
        linearLayout.addView(myPassword,lp2);


//        Button buttonOK = new Button(this);
//        buttonOK.setText("确认");
//        buttonOK.setTextSize(30);
//        linearLayout.addView(buttonOK);


    }

    private void init() {
        LinearLayout layout = (LinearLayout) findViewById(R.id.line1);

//                final DrawView view=new DrawView(this);
//                view.setMinimumHeight(500);
////                view.setMinimumWidth(300);
//                //通知view组件重绘
//                view.invalidate();
//                layout.addView(view);
        DrawCircle drawCircle = new DrawCircle(this);
//        drawCircle.setMinimumHeight(60);
//        drawCircle.setMinimumWidth(60);
        //通知view组件重绘
        drawCircle.invalidate();
        layout.addView(drawCircle);

//        TextView textView = (TextView)findViewById(R.id.textView1);
//        textView.setText(s);
//        textView.setTextSize(20);


//        LinearLayout layout2 = (LinearLayout) findViewById(R.id.line2);
//        TextView textView = new TextView(this);
//        textView.setText(s);
//        textView.setTextSize(20);
//        layout2.addView(textView,0);

    }
    public void ButtonOK(View view)
    {
        if(myAccount!=null && myPassword!=null)
        {
            String editTextAccount = myAccount.getText().toString().trim();
            String editTextPassword = myPassword.getText().toString().trim();
            if(editTextAccount.equals(accountName) && editTextPassword.equals(accountPassword))
            {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
            else
            {
                Toast toast =Toast.makeText(MainActivity.this,"账户名或密码错误！",Toast.LENGTH_LONG);
                toast.show();
            }
        }
    }
}
