package com.example.henry.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CAdapter Cadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<Personas> mDataset = new ArrayList<>();
        mDataset.add(new Personas("0000","Henry Rico","18 de Febrero del 2018"));
        mDataset.add(new Personas("0001","Erick Rico","19 de Febrero del 2018"));
        mDataset.add(new Personas("0002","Juan Carlos","20 de Febrero del 2018"));
        mDataset.add(new Personas("0003","Henry Rico","18 de Febrero del 2018"));
        mDataset.add(new Personas("0004","Erick Rico","19 de Febrero del 2018"));
        mDataset.add(new Personas("0005","Juan Carlos","20 de Febrero del 2018"));
        mDataset.add(new Personas("0006","Henry Rico","18 de Febrero del 2018"));
        mDataset.add(new Personas("0007","Erick Rico","19 de Febrero del 2018"));
        mDataset.add(new Personas("0008","Juan Carlos","20 de Febrero del 2018"));
        mDataset.add(new Personas("0009","Henry Rico","18 de Febrero del 2018"));
        mDataset.add(new Personas("0010","Erick Rico","19 de Febrero del 2018"));
        mDataset.add(new Personas("0011","Juan Carlos","20 de Febrero del 2018"));
        mDataset.add(new Personas("0012","Henry Rico","18 de Febrero del 2018"));
        mDataset.add(new Personas("0013","Erick Rico","19 de Febrero del 2018"));
        mDataset.add(new Personas("0014","Juan Carlos","20 de Febrero del 2018"));
        mDataset.add(new Personas("0015","Henry Rico","18 de Febrero del 2018"));
        mDataset.add(new Personas("0016","Erick Rico","19 de Febrero del 2018"));
        mDataset.add(new Personas("0017","Juan Carlos","20 de Febrero del 2018"));


        Cadapter = new CAdapter(mDataset);
        recyclerView.setAdapter(Cadapter);

    }
}
