package com.example.listviewimgtext;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ListViewImgActivity extends Activity {
private ListView listview;
private String names[]={
			"html",
			"CSS",
			"Java Script",
			"WordPress"
};
private String desc[]=
{
		"The powerful hyper text markup language 5",
		"Cascading Style Sheet",
		"Code with javascript",
		"manage your content with wordpress"
};
private Integer imageid[]=
{
		R.drawable.html,
		R.drawable.css,
		R.drawable.javascript,
		R.drawable.wordpress
		
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_img);
        CustomList customList=new CustomList(this,names,desc,imageid);
        listview=(ListView) findViewById(R.id.ListView);
        listview.setAdapter(customList);
        listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i,
					long l) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "you clicked "+names[i], Toast.LENGTH_LONG).show();
			}
		});
    }


    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
    	int id=item.getItemId();
    	if(id==R.id.action_settings){
    		return true;
    	}
		return super.onOptionsItemSelected(item);
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list_view_img, menu);
        return true;
    }
    
}
