package com.example.turecorrido;
import com.example.turecorrido.SegundoActivity;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.primero);//primero es el nombre de la variable del 1er layout
		
		// desde aca empiezo
		
		Button botonText = (Button) findViewById(R.id.textEliminarCuenta);
		botonText.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// importo solo cuando me da error en new OnClickListener()
				Intent intent= new Intent(MainActivity.this,SegundoActivity.class);
				int PASARPANTALLA = 0;
				Intent i = null;
				startActivityForResult(i,PASARPANTALLA);
			
			
			}
		});
		
		
		
		
		
		
		
		/////////////////////////////////////

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	//////////////////////////////////////hasta no hice yo, ya estaba
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.Primero, container,
					false);
			return rootView;
		}
	}

}
