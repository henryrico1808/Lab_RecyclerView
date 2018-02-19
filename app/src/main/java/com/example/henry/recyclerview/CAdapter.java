package com.example.henry.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CAdapter extends RecyclerView.Adapter<CAdapter.ViewHolder> {
    private ArrayList<Personas> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
     static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
         TextView headerCode;
         TextView nombre;
         TextView headerDate;


        public ViewHolder(View v) {
            super(v);
            headerCode = v.findViewById(R.id.headerCode);
            nombre = v.findViewById(R.id.nombre);
            headerDate = v.findViewById(R.id.headerDate);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CAdapter(ArrayList<Personas> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);


        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.headerCode.setText(mDataset.get(position).getHeaderCode());
        holder.headerDate.setText(mDataset.get(position).getHeaderDate());
        holder.nombre.setText(mDataset.get(position).getNombre());


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
