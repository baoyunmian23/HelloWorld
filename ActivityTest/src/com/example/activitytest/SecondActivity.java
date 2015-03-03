package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		Button button2=(Button)findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent();
				intent.putExtra("returned_data","Hello FirstActivity");
				setResult(RESULT_OK,intent);
				finish();
			}
		});

	}
	
	public boolean onCreateOptionMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main,menu);
		return true;
	}
	
	public boolean onOptionsIntemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this,"you clicked add",Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this,"you clicked remove",Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}

}
