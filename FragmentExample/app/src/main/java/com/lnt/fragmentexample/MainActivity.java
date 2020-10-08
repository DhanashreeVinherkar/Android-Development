package com.lnt.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = (Button) findViewById(R.id.firstFragment);
        secondFragment = (Button) findViewById(R.id.secondfragment);

        final Bundle bundle = new Bundle();
        bundle.putString("message", "From Activity to fragment");

        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FirstFragment());
            }
        });
        secondFragment.setOnClickListener((v) -> {
            loadFragment(new SecondFragment());
            //FirstFragment fragobj = new FirstFragment();
            //fragobj.setArguments(bundle);
            //Log.d("From main activity", bundle.toString());
        });
    }
    private void loadFragment(Fragment fragment) {
        //set Fragmentclass Arguments
        // create a FragmentManager
        FragmentManager fm = getFragmentManager();
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}