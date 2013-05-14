package saxion.persistent.luministodo;

import com.example.luministodo.R;
import com.example.luministodo.R.layout;
import com.example.luministodo.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GenericListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_generic_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_generic_list, menu);
		return true;
	}

}
