package com.example.attitudefinder;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
	Button btnMove;
	Score scoreObject=new Score();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	//btnMove=(Button)findViewById(R.id.button1);
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        //btnMove.setOnClickListener(this);
         }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	/*@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

		Intent I= new Intent("android.intent.action.FP");
		startActivity(I);
   
		
	}*/
}
