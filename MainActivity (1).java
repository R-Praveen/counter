package com.leo.counter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	int i=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView display=(TextView)findViewById(R.id.textView1);
		Button button=(Button)findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener(){
			

			@Override
			public void onClick(View arg0) {
				display.setText(String.valueOf(i));
				i++;
				
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
