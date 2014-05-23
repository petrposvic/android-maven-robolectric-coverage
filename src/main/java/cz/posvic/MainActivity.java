package cz.posvic;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	private static final String TAG = MainActivity.class.getName();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(cz.posvic.R.menu.main, menu);
		return true;
	}

	public int negative(int num) {
		Log.d(TAG, "-- negative(" + num + ") --");
		return -num;
	}
}

