package com.mgoenka.fragmentplay;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {
	TextView tvDemo;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
      // Defines the xml file for the fragment
      View view = inflater.inflate(R.layout.fragment_second, container, false);
      // Setup handles to view objects here
      tvDemo = (TextView) view.findViewById(R.id.textView1);
      // etFoo = (EditText) v.findViewById(R.id.etFoo);
      return view;
    }
}
