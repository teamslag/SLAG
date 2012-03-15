package usc.slag;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class HomeActivity extends Activity {
	
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new GridView.OnItemClickListener() 
        {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) 
            {           
            	Intent intent = null;
            	if(parent.getItemIdAtPosition(position) == R.drawable.athletics) {
            		intent = new Intent(v.getContext(), AthleticsActivity.class);
            	}
            	else if(parent.getItemIdAtPosition(position) == R.drawable.bus) {
            		intent = new Intent(v.getContext(), BusActivity.class);
            	}
            	else if(parent.getItemIdAtPosition(position) == R.drawable.dining) {
            		intent = new Intent(v.getContext(), DiningActivity.class);
            	}
            	else if(parent.getItemIdAtPosition(position) == R.drawable.tutoring) {
            		intent = new Intent(v.getContext(), TutoringActivity.class);
            	}
            	else if(parent.getItemIdAtPosition(position) == R.drawable.map) {
            		intent = new Intent(Intent.ACTION_VIEW, 
            				Uri.parse("http://www.sc.edu/cgi-bin/uscmap/uscmap.cgi?type=number&data=112"));
            	}
            	else if(parent.getItemIdAtPosition(position) == R.drawable.email) {
            		intent = new Intent(Intent.ACTION_VIEW, 
            				Uri.parse("https://outlook.com/email.sc.edu"));
            	}
                startActivity(intent);
            }
        });        
    }

}