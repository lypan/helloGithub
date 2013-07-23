package com.example.takephoto2;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class ImageActivity extends Activity {

	private ImageView imageIndicator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image);
		imageIndicator = (ImageView) findViewById(R.id.imageView1);
		if(getIntent().hasExtra("imageByteArray")) {
		    Bitmap b = BitmapFactory.decodeByteArray(
		        getIntent().getByteArrayExtra("imageByteArray"),0,getIntent().getByteArrayExtra("imageByteArray").length);        
		    imageIndicator.setImageBitmap(b);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.image, menu);
		return true;
	}

}
