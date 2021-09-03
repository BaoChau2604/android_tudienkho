package com.example.tu_dien_koho;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordCustomListAdapter extends BaseAdapter {
    private List<TuDaTra> tuDaTraList;
    private LayoutInflater layoutInflater;
    private Context context;


    public WordCustomListAdapter(Context aContext, List<TuDaTra> tuDaTraList) {
        this.tuDaTraList = tuDaTraList;
        this.context = aContext;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return  tuDaTraList.size();
    }

    @Override
    public Object getItem(int position) {
        return tuDaTraList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        WordCustomListAdapter.ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_tudatra, null);
            holder = new ViewHolder();
            holder.countryNameView = (TextView) convertView.findViewById(R.id.textViewTuDaTra);
            holder.populationView = (TextView) convertView.findViewById(R.id.textViewNghia);
            convertView.setTag(holder);
        } else {
            holder = (WordCustomListAdapter.ViewHolder) convertView.getTag();
        }

        TuDaTra tuDaTra = this.tuDaTraList.get(position);
        holder.countryNameView.setText(tuDaTra.getTudatra());
        holder.populationView.setText("" + tuDaTra.getNghia());

        return convertView;
    }
    static class ViewHolder {
        TextView countryNameView;
        TextView populationView;
    }
}
