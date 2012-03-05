package usc.slag;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class BusActivity extends Activity {
	
	public void OnCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bus);
		//adding things below to try to fix no text on screen
		LinearLayout busLayout = (LinearLayout) findViewById(R.id.bus_layout);
		
		
	}
}
