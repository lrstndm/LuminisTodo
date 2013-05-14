package saxion.persistent.luministodo;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class GenericListActivity extends Activity {
	MyAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_generic_list);
		
		adapter = new MyAdapter(this, R.layout.todo_item, tasks);
		ListView listView = (ListView) findViewById(R.id.listView1);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new MyListener());
	}

	private class MyListener implements OnItemClickListener
	{
		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long arg3) {
			// TODO Auto-generated method stub
			Log.d("MyListener.onItemClick", arg0 + " " + arg1 + " " + position + " " + arg3);
			
//			Intent i = new Intent(MainActivity.this, DetailsActivity.class);
//			Task task = adapter.getItem(position);
//			i.putExtra("Task", task);
//			startActivityForResult(i, code);
			
			
		}
		
	}
	
	private class MyAdapter extends ArrayAdapter<Task>
	{
		private LayoutInflater inflater;
		
		public MyAdapter(Context context, int textViewResourceId,
				List<tasks> objects) {
			super(context, textViewResourceId, objects);
			inflater = LayoutInflater.from(context);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public View getView(int p, View v, ViewGroup g) {
			
			// TODO Auto-generated method stub
			if (v == null) {
				v = inflater.inflate(R.layout.todo_item, null);
			}
//			Task o = getItem(p); 
			
//			if (o != null) {
//				
//			}
			return v;
		}
		
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_generic_list, menu);
		return true;
	}

}
