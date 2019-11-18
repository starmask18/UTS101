package com.example.uts101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentMiniQuestion extends Fragment{
	EditText ea;
	EditText eb;
	EditText ec;
	Button bsubmit;
	TextView thasil1;
	TextView thasil2;
	TextView thasil3;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_miniquestion, container, false);
		ea = (EditText)rootView.findViewById(R.id.etmini1);
		eb = (EditText)rootView.findViewById(R.id.etmini2);
		ec = (EditText)rootView.findViewById(R.id.etmini3);
		bsubmit = (Button)rootView.findViewById(R.id.btnmini);
		thasil1 = (TextView)rootView.findViewById(R.id.tvjawab1);
		thasil2 = (TextView)rootView.findViewById(R.id.tvjawab2);
		
		thasil3 = (TextView)rootView.findViewById(R.id.tvjawab3);
		
		bsubmit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String result1 = ea.getText().toString();
				if(result1.equals("YES") || result1.equals("Yes") || result1.equals("yes")) {
					thasil1.setText("apakah anda bercanda");
				} else if (result1.equals("NO") || result1.equals("No") || result1.equals("no")){
					thasil1.setText("benar sekali");
				}
				
				String result2 = eb.getText().toString();
				if(result2.equals("YES") || result2.equals("Yes") || result2.equals("yes")) {
					thasil2.setText("we are in the same boat");
				} else if (result2.equals("NO") || result2.equals("No") || result2.equals("no")){
					thasil2.setText("we are not in the same boat");
				}
				
				String result3 = ec.getText().toString();
				if(result3.equals("YES") || result3.equals("Yes") || result3.equals("yes")) {
					thasil3.setText("i know right");
				} else if(result3.equals("NO") || result3.equals("No") || result3.equals("no")){
					thasil3.setText("apakah anda serius?");
				}
			}
		});
		return rootView;
	}
}

