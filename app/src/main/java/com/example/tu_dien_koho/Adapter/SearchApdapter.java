package com.example.tu_dien_koho.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tu_dien_koho.Model.translate;
import com.example.tu_dien_koho.R;

import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{

    public TextView tuTV, nghiaKho;
    public RecyclerView recycler;

    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);
        tuTV = (TextView) itemView.findViewById(R.id.tv_tuTV);
        nghiaKho = (TextView) itemView.findViewById(R.id.tv_NghiaKHo);
        recycler = (RecyclerView)itemView.findViewById(R.id.recycleView_search);
    }
}
public class SearchApdapter  extends RecyclerView.Adapter<SearchViewHolder>{

    private Context context;
    private List<translate> translateList;
//    private RecycleViewCLickListener listener;

    public SearchApdapter(Context context, List<translate> translateList) {
        this.context = context;
        this.translateList = translateList;
    }
//    public SearchApdapter(Context context, List<translate> translateList, RecycleViewCLickListener listener ) {
//        this.context = context;
//        this.translateList = translateList;
//        this.listener = listener;
//    }
public class MyViewHOlder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView tugoctxt;

    public MyViewHOlder(final View view) {
        super(view);
        tugoctxt = view.findViewById(R.id.TuGoc_TextView);
        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        listener.RecycleOnclick(view, getAdapterPosition());
    }
}
    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_search,parent,false);
        return new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        holder.tuTV.setText(translateList.get(position).getTuTV());
        holder.nghiaKho.setText(translateList.get(position).getNghiakho());
    }

    @Override
    public int getItemCount() {
        return translateList.size();
    }
    public interface ItemRecycleViewClickListener{
        void ItemOnCLick(int position);
    }
//    public interface RecycleViewCLickListener{
//        void RecycleOnclick(View v,int position);
//    }
}
