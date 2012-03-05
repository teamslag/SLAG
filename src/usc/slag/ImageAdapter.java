package usc.slag;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {

	private Context mContext;
	
	public ImageAdapter(Context c) {
		mContext = c;
	}
	
	public int getCount() {
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see android.widget.Adapter#getView(int, 
	 *      android.view.View, android.view.ViewGroup)
	 * Create a new ImageView for each item referenced by the Adapter
	 */
	public View getView(int position, View convertView, ViewGroup parent) {
		//ImageView imageView;
		View view = convertView;
		if(convertView == null) {
			LayoutInflater inflater = ((Activity)mContext).getLayoutInflater();
			view = inflater.inflate(R.layout.grid_item, null);
			TextView text = (TextView)view.findViewById(R.id.grid_item_text);
			text.setText(iconNames[position]);
			ImageView image = (ImageView)view.findViewById(R.id.grid_item_image);
			image.setImageResource(mThumbIds[position]);
			
		}
		/*else {
			imageView = (ImageView) convertView;
		}
		imageView.setImageResource(mThumbIds[position]);
		*/
		return view;
	}
	
	//references to the images
	private Integer[] mThumbIds = {
			R.drawable.bus, R.drawable.tutoring};
	
	private String[] iconNames = {
			"Bus Schedule", "Tutoring"};

}