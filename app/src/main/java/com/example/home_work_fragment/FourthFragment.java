package com.example.home_work_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FourthFragment extends Fragment {

    TextView textView;
    Button button;


    public FourthFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fourth, container, false);
        textView = v.findViewById(R.id.Textview_four);
        button = v.findViewById(R.id.Button_four);
        Bundle bundle = getArguments();
        String data = bundle.getString("key");
        textView.setText(data);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("key",textView.getText().toString());
                FifthFragment fragment = new FifthFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mail_container,fragment).commit();
            }
        });
        return v;
    }

}