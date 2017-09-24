package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView storyTextView;
    private Button topButton,bottomButton;
    private int topButtonPressed=0;
    private int bottomButtonPressed=0;
    private int myStoryIndex=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        storyTextView=(TextView)findViewById(R.id.storyTextView);
        topButton=(Button)findViewById(R.id.buttonTop);
        bottomButton=(Button)findViewById(R.id.buttonBottom);


        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topButtonPressed++;
                myStoryIndex++;
                if(topButtonPressed==1 && myStoryIndex==1){
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    storyTextView.setText(R.string.T3_Story);
                }else if(topButtonPressed==2 && myStoryIndex==2){
                    storyTextView.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }else if(topButtonPressed==1 && myStoryIndex==2){
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    storyTextView.setText(R.string.T3_Story);
                }else if(topButtonPressed==2 && myStoryIndex==3){
                    storyTextView.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomButtonPressed++;
                myStoryIndex++;
                if(bottomButtonPressed==1 && myStoryIndex==1 ){
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    storyTextView.setText(R.string.T2_Story);
                }else if(bottomButtonPressed==2 && myStoryIndex==2){
                    storyTextView.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
                else if(bottomButtonPressed==1 && myStoryIndex==2){
                    storyTextView.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
                else if(bottomButtonPressed==2 && myStoryIndex==3){
                    storyTextView.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
            }
        });

    }


}
