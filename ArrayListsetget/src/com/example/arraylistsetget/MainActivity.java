package com.example.arraylistsetget;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.holder.GetContactList;

public class MainActivity extends Activity {

	Button add_btn;
	ListView list;
	ArrayList<GetContactList> contactList = new ArrayList<GetContactList>();
	Contact_Adapter cAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        add_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent add_contact = new Intent(MainActivity.this, GetContactList.class);
				add_contact.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP| Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(add_contact);
				finish();
				
			}
		});
    }
    
    public class Contact_Adapter{
    	
    }
    
    static class ViewHolder{
		TextView txt_id;
		TextView txt_name;
		TextView txt_email;
		TextView txt_mobile;
	}
}
