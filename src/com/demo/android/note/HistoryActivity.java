package com.demo.android.note;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class HistoryActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_history);

		//Intent intent = getIntent();
		initView();
		setListeners();		
	}
	
	private Button button_history_home;


	private void initView(){
		button_history_home = (Button)findViewById(R.id.history_home);
	}
	
	//Listen for button clicks
	private void setListeners(){
		button_history_home.setOnClickListener(BackToMain);

	}
	
	private Button.OnClickListener BackToMain = new Button.OnClickListener(){
		public void onClick(View v){
			//Close this activity
			Intent BackToMain = new Intent();
			BackToMain.setClass(HistoryActivity.this,MainActivity.class);
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
