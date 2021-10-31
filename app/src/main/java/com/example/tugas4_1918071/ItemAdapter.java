package com.example.tugas4_1918071;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
    private ArrayList<Item> dataList;
    public ItemAdapter(ArrayList<Item> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public ItemViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        return new ItemViewHolder(view);
    }
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txt_team.setText(dataList.get(position).getNamatim());
        holder.txt_leader.setText(dataList.get(position).getLeader());
        holder.txt_negara.setText(dataList.get(position).getNegara());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_team, txt_leader, txt_negara;
        private ImageView Logo;
        public ItemViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txt_team = (TextView)
                    itemView.findViewById(R.id.txt_team);
            txt_leader = (TextView)
                    itemView.findViewById(R.id.txt_leader);
            txt_negara = (TextView)
                    itemView.findViewById(R.id.txt_negara);
        }
    }
}
