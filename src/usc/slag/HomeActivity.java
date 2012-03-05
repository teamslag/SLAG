package usc.slag;

import android.app.Activity;
import android.content.Intent;
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
            	if(position == 0) {
            		intent = new Intent(v.getContext(), BusActivity.class);
            	}
            	else if(position == 1) {
            		intent = new Intent(v.getContext(), TutoringActivity.class);
            	}
            	else {
            		
            	}
                startActivity(intent);
            }
        });        
    }

}