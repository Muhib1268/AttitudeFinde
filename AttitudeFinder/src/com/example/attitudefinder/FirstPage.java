package com.example.attitudefinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FirstPage extends ActionBarActivity implements OnClickListener{
	RadioGroup rg1;
	RadioButton rb0,rb1,rb2,rb3;	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstpage);
		rg1= (RadioGroup) findViewById(R.id.radioGroup1);
		rb0= (RadioButton) findViewById(R.id.radio0);
		rb1= (RadioButton) findViewById(R.id.radio1);
		rb2= (RadioButton) findViewById(R.id.radio2);
		rb3= (RadioButton) findViewById(R.id.radio3);
		rb0.setOnClickListener(this);
		rb1.setOnClickListener(this);
		rb2.setOnClickListener(this);
		rb3.setOnClickListener(this);
		rg1.setOnClickListener(this);

	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	

}
