package com.flashback.checkboxtest;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

@SuppressLint("NewApi")
public class StartActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
	}

	public void onCheckboxClicked(View view) {
	    // Is the view now checked?
	    boolean checked = ((CheckBox) view).isChecked();
	    
	    // Check which checkbox was clicked
	    switch(view.getId()) {
	        case R.id.checkBox1:
	        	if (checked)
					startActivity(new Intent(getApplicationContext(), Activity_01.class));
	        	else 
					Toast.makeText(getApplicationContext(), "Not checked Box 01", Toast.LENGTH_SHORT).show();
				break;
			case R.id.checkBox2:
				if (checked)
					startActivity(new Intent(getApplicationContext(), Activity_02.class));
				else
					Toast.makeText(getApplicationContext(), "Not checked Box 02", Toast.LENGTH_SHORT).show();
				break;
			case R.id.checkBox3:
				if (checked)
				   startActivity(new Intent(getApplicationContext(), Activity_03.class));
				else
					Toast.makeText(getApplicationContext(), "Not checked Box 03", Toast.LENGTH_SHORT).show();
				break;	
	    }
	}
}
