package com.example.tu_dien_koho;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TuDaLuu_Adapter extends RecyclerView.Adapter<TuDaLuu_Adapter.TuDaLuu_View> {
    private Context context;
    private List<TuDaLuu> list;

    public TuDaLuu_Adapter(Context context) {
        this.context = context;
    }
    public void setData(List<TuDaLuu> list){
        this.list=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TuDaLuu_View onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_words,parent,false);
        return new TuDaLuu_View(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TuDaLuu_View holder, int position) {
        TuDaLuu tuDaLuu = list.get(position);
        if(tuDaLuu == null){
            return;
        }
        holder.tuGoc.setText(tuDaLuu.getNghia());
        holder.nghia.setText(tuDaLuu.getNghia());
    }

    @Override
    public int getItemCount() {
        if (list !=null){
            return list.size();
        }
        return 0;
    }

    public class TuDaLuu_View extends RecyclerView.ViewHolder{
        private TextView tuGoc;
        private TextView nghia;
        public TuDaLuu_View(@NonNull View itemView) {
            super(itemView);
            tuGoc = itemView.findViewById(R.id.textView3);
            nghia = itemView.findViewById(R.id.textView4);
        }

    }


}
