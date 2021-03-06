package com.jelly.front_end;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button rotate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		rotate = (Button)findViewById(R.id.rotation);
		rotate.setOnClickListener(myClick);
	}

	OnClickListener myClick = new OnClickListener() {
		private Intent intent;
		@Override
		public void onClick(View v) {
			switch(v.getId()){
			case R.id.rotation:intent = new Intent(MainActivity.this, RotationActivity.class);break;
			}
			MainActivity.this.startActivity(intent);
		}
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
