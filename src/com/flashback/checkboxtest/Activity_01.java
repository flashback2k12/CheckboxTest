package com.flashback.checkboxtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Activity_01 extends BaseActivity {

	Button btnFF;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_test01);
	
	btnFF = (Button)findViewById(R.id.button1);
	btnFF.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			startActivity(new Intent(getApplicationContext(), Activity_02.class));
		}
	});

	}
}
