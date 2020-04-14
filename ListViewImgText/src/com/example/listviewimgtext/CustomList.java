package com.example.listviewimgtext;



import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {
	private String[] names;
	private String[] desc;
	private Integer[] imageid;
	private Activity context;

public CustomList(Activity context,String[] names,String[] desc,Integer[] imageid){
	super(context,R.layout.list_layout,names);
	this.context=context;
	this.names=names;
	this.desc=desc;
	this.imageid=imageid;
}
@Override
public View getView(int position, View convertView, ViewGroup parent) {
	// TODO Auto-generated method stub
	LayoutInflater inflater=context.getLayoutInflater();
	View listViewItem=inflater.inflate(R.layout.list_layout,null,true);
	TextView textViewDesc=(TextView) listViewItem.findViewById(R.id.textViewDesc);
   TextView textViewName= (TextView) listViewItem.findViewById(R.id.textViewName);
   ImageView image=(ImageView) listViewItem.findViewById(R.id.imageView);
   textViewName.setText(names[position]);
   textViewDesc.setText(desc[position]);
   image.setImageResource(imageid[position]);
	
	return listViewItem;
}

}