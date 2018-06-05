package com.example.jam68ty.foodbattle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

//MainActivity.java
//-----------------
public class SearchResultActivity extends Activity
{
    private Spinner mSpn; //宣告 mSpn 為 Spinner 物件

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchresult);

        mSpn = (Spinner) findViewById(R.id.spn);
        mSpn.setOnItemSelectedListener(spnOnItemSelected);
    }

    private AdapterView.OnItemSelectedListener spnOnItemSelected
            = new AdapterView.OnItemSelectedListener()
    {
        @Override
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
        {
            // TODO Auto-generated method stub
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0)
        {
            // TODO Auto-generated method stub
        }
    };
}
