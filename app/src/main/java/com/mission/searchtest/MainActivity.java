package com.mission.searchtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    FragmentFirst fragmentFirst;
    FragmentSecond fragmentSecond;
    private Button first;
    private Button second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void initView(){
        first = (Button)findViewById(R.id.first);
        second = (Button)findViewById(R.id.second);

        first.setOnClickListener(this);
        second.setOnClickListener(this);
    }

    int i = 0;
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.first:
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction transaction = fm.beginTransaction();
//                transaction.replace(R.id.id_content, mWeixin);
//                transaction.commit();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,getFragmentFirst(),"1").commit();
                Log.d("log","-------->"+(i++));
                break;
            case R.id.second:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,getFragmentSecond(),"2").commit();
                break;
            default:
                break;
        }
    }

    public FragmentFirst getFragmentFirst(){
        if (fragmentFirst == null){
            fragmentFirst = new FragmentFirst();
        }
        return fragmentFirst;
    }

    public FragmentSecond getFragmentSecond(){
        if (fragmentSecond == null){
            fragmentSecond = new FragmentSecond();
        }
        return fragmentSecond;
    }
}
