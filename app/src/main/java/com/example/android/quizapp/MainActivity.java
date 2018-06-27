package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View view){
        int score=0;
        RadioButton qst1Ans=(RadioButton)findViewById(R.id.radio_ques1a);
        if(qst1Ans.isChecked()){
            score++;
        }
        CheckBox qst2Ans1=(CheckBox) findViewById(R.id.chechbox_ques2a);
        CheckBox qst2Ans2=(CheckBox) findViewById(R.id.chechbox_ques2b);
        CheckBox qst2Ans3=(CheckBox) findViewById(R.id.chechbox_ques2c);
        CheckBox qst2Ans4=(CheckBox) findViewById(R.id.chechbox_ques2d);
        if(qst2Ans1.isChecked()&&qst2Ans2.isChecked()&&qst2Ans3.isChecked()&&qst2Ans4.isChecked()){
            score++;
        }
        RadioButton qst3Ans=(RadioButton)findViewById(R.id.radio_ques3c);
        if(qst3Ans.isChecked()){
            score++;
        }
        RadioButton qst4Ans=(RadioButton)findViewById(R.id.radio_ques4d);
        if(qst4Ans.isChecked()){
            score++;
        }
        RadioButton qst5Ans=(RadioButton)findViewById(R.id.radio_ques5a);
        if(qst5Ans.isChecked()){
            score++;
        }
        EditText editText=(EditText)findViewById(R.id.edit_text) ;
        String qst6Ans=editText.getText().toString().trim();
        if(qst6Ans.equals("29")){
            score++;
        }


    Context context = getApplicationContext();
    CharSequence text = "Your Score is :"+score;
    CharSequence zeroScoreText="You scored a big Zero";
    int duration = Toast.LENGTH_SHORT;

    if(score>0) {
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    else{
        Toast toast = Toast.makeText(context, zeroScoreText, duration);
        toast.show();
    }
    }

}
