package com.chk.constraintexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView profileImg;
    private TextView nameTxt,emailTxt,conTxt;
    private RecyclerView recentlyViewedRv,newItemRv,flowerRv,yourChoiceRv;
    private Switch switch1;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();

    }

    private void initialization(){
        profileImg=findViewById(R.id.profileImg);
        nameTxt=findViewById(R.id.nameTxt);
        emailTxt=findViewById(R.id.emailTxt);
        conTxt=findViewById(R.id.conTxt);
        recentlyViewedRv=findViewById(R.id.recentlyViewedRv);
        newItemRv=findViewById(R.id.newItemRv);
        flowerRv=findViewById(R.id.flowerRv);
        yourChoiceRv=findViewById(R.id.yourChoiceRv);
        switch1=findViewById(R.id.switch1);
        spinner=findViewById(R.id.spinner);

    }
}
