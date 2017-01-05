package com.myappflag;

import android.net.Uri;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TestSend.OnFragmentInteractionListener,TestRes.OnFragmentInteractionListener

{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
