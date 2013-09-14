package com.demo.android.note;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class InputActivity extends Activity {
	private static final String TAG = "Input";
	private Button button_input_back;
	private RadioGroup radioSection;
	//private RadioGroup radioType;
	private RadioButton radioSectionButton;
	//private RadioButton radioTypeButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_input);

		//Intent intent = getIntent();
		initView();
		setListeners();		
	}
	
	private void initView(){
		Log.d(TAG,"init Views");
		button_input_back = (Button)findViewById(R.id.input_save);
		radioSection = (RadioGroup) findViewById(R.id.radioSection);
		//radioType = (RadioGroup) findViewById(R.id.radio_type);
	}
	
	//Listen for button clicks
	private void setListeners(){
		//Log.d(TAG,"SetListeners");
		button_input_back.setOnClickListener(BackToMain);
	}
	
	private Button.OnClickListener BackToMain = new Button.OnClickListener(){
		public void onClick(View v){
			//Log.d(TAG,"onClick");
			
	        // get selected radio button from radioGroup
			int SectionselectedId = radioSection.getCheckedRadioButtonId();
			//int TypeselectedId = radioType.getCheckedRadioButtonId();
			//Log.d(TAG,"get radio value 1"+SectionselectedId);
			//Log.d(TAG,"get radio value 2"+TypeselectedId);
	 
			// find the radiobutton by returned id
			radioSectionButton = (RadioButton) findViewById(SectionselectedId);
			//radioTypeButton = (RadioButton) findViewById(TypeselectedId);
			
			//show on Toast
			Toast.makeText(InputActivity.this,
				"OnClickListener : " + 
				"\n Section Selected : "+radioSectionButton.getText(),
				//"\n Type Selected : "+radioTypeButton.getText(),
					Toast.LENGTH_LONG).show();
			  
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
