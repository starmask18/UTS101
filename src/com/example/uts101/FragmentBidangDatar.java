package com.example.uts101;

import android.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentBidangDatar extends Fragment{
	EditText e1;
	Button bhasil1;
	TextView tvbd;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.layout_bidangdatar, container, false);
		e1 = (EditText)rootView.findViewById(R.id.etbidangdatar);
		bhasil1 = (Button)rootView.findViewById(R.id.btnbidangdatar);
		tvbd = (TextView)rootView.findViewById(R.id.tvdatar);
		
		bhasil1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int hasil1 = Integer.parseInt(e1.getText().toString());
				if(hasil1==12) {
					tvbd.setText("anda benar");
				}else{
					tvbd.setText("anda salah test lagi");
					}
			}
		});
		return rootView;		
	}
}
