package com.androidminang.hello;

import com.androidminang.hello.R;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button button,button1,button2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addListenerOnButton();
    }

    private void addListenerOnButton() {
    	button = (Button) findViewById(R.id.btnButton1);
    	button1 = (Button) findViewById(R.id.btnButton2);
    	button2 = (Button) findViewById(R.id.btnButton3);
    	button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent browserIntent =
						new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.androidminang.com"));
				startActivity(browserIntent);
				
			}
		});
    	button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent browserIntent =
						new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com/androidminang"));
				startActivity(browserIntent);
				
			}
		});
    	button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent browserIntent = 
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/groups/androidminang"));
		    startActivity(browserIntent);
				
			}
		});
		
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
