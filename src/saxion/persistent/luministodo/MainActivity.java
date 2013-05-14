package saxion.persistent.luministodo;

import com.example.luministodo.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost tabHost = getTabHost();
		
		if (tabHost != null) {
			
			TabSpec werkSpec = tabHost.newTabSpec("Werk");
			if(werkSpec != null)
			{
				werkSpec.setIndicator("Werk");
				Intent intent = new Intent(this, GenericListActivity.class);
				werkSpec.setContent(intent);
				tabHost.addTab(werkSpec);
			}
			
			TabSpec overigSpec = tabHost.newTabSpec("Overig");
			if(overigSpec != null)
			{
				overigSpec.setIndicator("Overig");
				Intent intent = new Intent(this, GenericListActivity.class);
				overigSpec.setContent(intent);
				tabHost.addTab(overigSpec);
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
