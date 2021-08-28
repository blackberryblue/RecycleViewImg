package com.com.recycleviewimg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHodler> {

    Context mContext;
    List<item> mData;


    public Adapter(Context mContext, List<item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHodler onCreateViewHolder( ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.card_time,parent,false);
        return new myViewHodler(view);
    }

    @Override
    public void onBindViewHolder(Adapter.myViewHodler holder, int position) {
        holder.profiePhoto.setImageResource(mData.get(position).getProfilePhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHodler extends RecyclerView.ViewHolder{

        ImageView profiePhoto;



        public myViewHodler( View itemView) {
            super(itemView);

            profiePhoto = itemView.findViewById(R.id.imageView);
        }


    }
}
