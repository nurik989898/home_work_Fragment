package com.example.home_work_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FifthFragment extends Fragment {

    TextView textView;


    public FifthFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fifth, container, false);
        textView = v.findViewById(R.id.Textview_fife);
        Bundle bundle = getArguments();
        String data = bundle.getString("key");
        textView.setText(data);
        return v;
    }

}