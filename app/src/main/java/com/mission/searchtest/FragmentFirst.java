package com.mission.searchtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by KevenTao on 2016/12/15.
 */

public class FragmentFirst extends Fragment implements View.OnClickListener{
    View view = null;
    private TextView textView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (null == view) {

            view = inflater.inflate(R.layout.fragment, null);

        }

        ViewGroup parent = (ViewGroup)view.getParent();
        if (parent != null) {
            parent.removeView(view);
        }

        return view;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        initView();
    }

    public void initView(){
        textView = (TextView) getView().findViewById(R.id.text);
        textView.setText("First");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

        }
    }
}
