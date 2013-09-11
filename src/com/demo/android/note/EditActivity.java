package com.demo.android.note;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class EditActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit);

		//Intent intent = getIntent();
		initView();
		setListeners();		
	}
	
	private Button button_edit_back;


	private void initView(){
		button_edit_back = (Button)findViewById(R.id.edit_home);
	}
	
	//Listen for button clicks
	private void setListeners(){
		button_edit_back.setOnClickListener(BackToMain);

	}
	
	private Button.OnClickListener BackToMain = new Button.OnClickListener(){
		public void onClick(View v){
			//Close this activity
			Intent BackToMain = new Intent();
			BackToMain.setClass(EditActivity.this,MainActivity.class);
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
