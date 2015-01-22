package com.example.multilevelexpandableview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

public class MainActivity extends Activity {
	ExpandableListView explvlist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		explvlist = (ExpandableListView) findViewById(R.id.ParentLevel);
		explvlist.setAdapter(new ParentLevel(MainActivity.this));
	}
}
