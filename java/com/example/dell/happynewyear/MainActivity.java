package com.example.dell.happynewyear;

import com.example.dell.happynewyear.R;
import android.content.Context;
	import android.os.Bundle;
     import android.support.v7.app.AppCompatActivity;
	import android.view.LayoutInflater;
	import android.view.View;
	import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterViewFlipper;
	import android.widget.BaseAdapter;
	import android.widget.ImageView;
	import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

        	    AdapterViewFlipper adapterViewFlipper;

        	    int[] Images = {
                        R.drawable.one,
            	            R.drawable.two,
            	            R.drawable.three,
            	            R.drawable.four
            	    };

        	    String[] Names = {
            	            "Deosai National Park",
            	            "Lake Dudipatsar",
            	            "Rama Meadows",
            	            "Lower Kachura Lake"
            	    };

        	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
        	        super.onCreate(savedInstanceState);
        	        setContentView(R.layout.activity_main);

        	        adapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.adapter);

        	        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Names, Images);

        	        adapterViewFlipper.setAdapter(customAdapter);
        	        adapterViewFlipper.setFlipInterval(2600);
        	        adapterViewFlipper.setAutoStart(true);
        	    }
	}

class CustomAdapter extends BaseAdapter {
	    Context context;
	    int[] images;
	    String[] names;
	    LayoutInflater inflater;

			    public CustomAdapter(Context applicationContext, String[] names, int[] images) {
			        this.context = applicationContext;
			        this.images = images;
			        this.names = names;
			        inflater = (LayoutInflater.from(applicationContext));
			    }

			    @Override
	    public int getCount() {
			        return names.length;
			    }

			    @Override
	    public Object getItem(int position) {
			        return null;
			    }

			    @Override
	    public long getItemId(int position) {
			        return 0;
			    }

			    @Override
	    public View getView(int position, View view, ViewGroup parent) {
			        view = inflater.inflate(R.layout.list_item, null);
			        TextView name = (TextView) view.findViewById(R.id.name);
			        ImageView image = (ImageView) view.findViewById(R.id.image);
			        name.setText(names[position]);
			        image.setImageResource(images[position]);
			        return view;
			    }
	}