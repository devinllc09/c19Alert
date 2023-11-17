package com.devin.c19_alert;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.leo.simplearcloader.SimpleArcLoader;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
     TextView cases,recoverde,active,totalDeaths,todayDeaths,affcountry,critical,todayCase;
     ScrollView scrollView;
     SimpleArcLoader simpleArcLoader;
     PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cases=findViewById(R.id.casesTv);
        recoverde=findViewById(R.id.recovered);
        active=findViewById(R.id.activeTv);
        totalDeaths=findViewById(R.id.totaldeathTv);
        todayDeaths=findViewById(R.id.todaydeathTv);
        todayCase=findViewById(R.id.todaycaseTv);
        affcountry=findViewById(R.id.affectcntryTv);
        critical=findViewById(R.id.criticaltv);

        scrollView=findViewById(R.id.scroolstta);
        simpleArcLoader=findViewById(R.id.loader);
        pieChart=findViewById(R.id.piechart);

    }


    public void track(View view) {
    }
}