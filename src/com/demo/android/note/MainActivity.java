package com.demo.android.note;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
		setListeners();
	}

	private Button button_input;
	private Button button_history;
	private Button button_edit;
	
	
	private void initView(){
		button_input = (Button)findViewById(R.id.btn_input);
		button_history = (Button)findViewById(R.id.btn_history);
		button_edit = (Button)findViewById(R.id.btn_edit);
	}
	
	//Listen for button clicks
	private void setListeners(){
		button_input.setOnClickListener(inputPage);
		button_history.setOnClickListener(historyPage);
		button_edit.setOnClickListener(editPage);
	}
	
		
	
	private Button.OnClickListener inputPage = new Button.OnClickListener(){
		public void onClick(View v){
			Intent intent_input = new Intent();
			intent_input.setClass(MainActivity.this,InputActivity.class);
			startActivity(intent_input);
		}
	};
	
	private Button.OnClickListener historyPage = new Button.OnClickListener(){
		public void onClick(View v){
			Intent intent_history = new Intent();
			intent_history.setClass(MainActivity.this,HistoryActivity.class);
			startActivity(intent_history);
		}
	};
	
	private Button.OnClickListener editPage = new Button.OnClickListener(){
		public void onClick(View v){
			Intent intent_history = new Intent();
			intent_history.setClass(MainActivity.this,EditActivity.class);
			startActivity(intent_history);
		}
	};

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
