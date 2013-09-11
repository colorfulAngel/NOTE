package com.demo.android.note;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class InputActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_input);

		//Intent intent = getIntent();
		initView();
		setListeners();		
	}
	
	private Button button_input_back;


	private void initView(){
		button_input_back = (Button)findViewById(R.id.input_save);
	}
	
	//Listen for button clicks
	private void setListeners(){
		button_input_back.setOnClickListener(BackToMain);
	}
	
	private Button.OnClickListener BackToMain = new Button.OnClickListener(){
		public void onClick(View v){
			//Close this activity
			Intent BackToMain = new Intent();
			BackToMain.setClass(InputActivity.this,MainActivity.class);
			startActivity(BackToMain);
		}
	};
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
