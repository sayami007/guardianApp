package com.example.bibesh.guardianapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bibesh.guardianapp.Listener.ClickListener;
import com.example.bibesh.guardianapp.Model.Headline;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Callback;

/**
 * Created by Bibesh on 7/14/17.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    LayoutInflater inflater;
    Context ctx;
    List<Headline.ResponseBean.ResultsBean> result;
    ClickListener listener;

    public CustomAdapter(Context ctx, List<Headline.ResponseBean.ResultsBean> result, ClickListener callback) {
        this.inflater = LayoutInflater.from(ctx);
        this.result = result;
        this.ctx = ctx;
        this.listener = callback;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_headline, parent, false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Picasso.with(ctx).load(result.get(position).getFields().getThumbnail()).into(holder.ivItemImage);
        holder.tvItemHeadline.setText(result.get(position).getFields().getHeadline());
        holder.ivItemImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onCardViewClick(position, result.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvItemHeadline;
        ImageView ivItemImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvItemHeadline = itemView.findViewById(R.id.tv_item_headline);
            ivItemImage = itemView.findViewById(R.id.iv_item_image);
        }
    }
}
