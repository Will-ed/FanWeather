package com.ed.will.fanweather.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ed.will.fanweather.R;

import java.util.List;

/**
 * Created by Win10 on 2016/3/3.
 */
public class NextWeatherAdapter extends RecyclerView.Adapter<NextWeatherAdapter.ViewHolder> {

    public static interface OnRecyclerViewListener{
        void onItemClick(int position);
        boolean onItemLongClick(int position);
    }

    private OnRecyclerViewListener onRecyclerViewListener;

    public void setOnRecyclerViewListener(OnRecyclerViewListener onRecyclerViewListener){
        this.onRecyclerViewListener=onRecyclerViewListener;
    }

    private static final String TAG =NextWeatherAdapter.class.getSimpleName();
    private List<WeatherOneDay> list;

    public NextWeatherAdapter(List<WeatherOneDay> list){
        this.list=list;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log.d(TAG, "onCreateViewHolder, i: " + i);
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.next_item,viewGroup,false);
        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        ViewHolder vh= new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(NextWeatherAdapter.ViewHolder viewHolder, int position) {
        viewHolder.temp.setText(list.get(position).getTemp());
        viewHolder.type.setText(list.get(position).getType());
        viewHolder.wind.setText(list.get(position).getWind());
        viewHolder.week.setText(list.get(position).getWeek());
        viewHolder.date.setText(list.get(position).getDate());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{

        public TextView temp,type,wind,date,week;
        public int position;

        public ViewHolder(View itemView) {
            super(itemView);
            temp= (TextView) itemView.findViewById(R.id.next_item_maxmin);
            type= (TextView) itemView.findViewById(R.id.next_item_cond);
            wind= (TextView) itemView.findViewById(R.id.next_item_wind);
            date= (TextView) itemView.findViewById(R.id.next_item_date);
            week= (TextView) itemView.findViewById(R.id.next_item_week);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (null != onRecyclerViewListener) {
                onRecyclerViewListener.onItemClick(position);
            }
        }

        @Override
        public boolean onLongClick(View v) {
            if (null!=onRecyclerViewListener){
                return onRecyclerViewListener.onItemLongClick(position);
            }
            return false;
        }
    }
}
