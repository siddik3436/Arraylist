package com.example.holder;

import android.app.Activity;
import com.example.model.ContactList;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.arraylistsetget.R;

public class GetContactList extends Activity {
	EditText add_id, add_name, add_email, add_mobile;
	Button save_btn;
	String valid_mob_number = null, valid_email = null, valid_name = null,
			    Toast_msg = null, valid_user_id = "";
	ContactList contactList;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactlist);
        add_contact_screen();
        
       
        
        save_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				valid_user_id = add_id.getText().toString();
				valid_name = add_name.getText().toString();
				valid_email = add_email.getText().toString();
				valid_mob_number = add_mobile.getText().toString();
			}
		});
    }

	public void add_contact_screen() {
		add_id = (EditText)findViewById(R.id.edit_id);
		add_name = (EditText)findViewById(R.id.edit_name);
		add_email = (EditText)findViewById(R.id.edit_email);
		add_mobile = (EditText)findViewById(R.id.edit_mobile);
		save_btn = (Button)findViewById(R.id.save);
	}
	
	public void Reset() {
		add_id.getText().clear();
		add_name.getText().clear();
		add_email.getText().clear();
		add_mobile.getText().clear();
	}
	
}
