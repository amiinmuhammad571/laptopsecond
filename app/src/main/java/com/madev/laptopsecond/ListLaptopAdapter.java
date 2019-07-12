package com.madev.laptopsecond;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListLaptopAdapter extends RecyclerView.Adapter<ListLaptopAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Laptop> listLaptop;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback=onItemClickCallback;
    }

    public ListLaptopAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<Laptop> getListLaptop() {
        return listLaptop;
    }
    public void setListLaptop(ArrayList<Laptop> listLaptop) {
        this.listLaptop = listLaptop;
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_laptopsecond,viewGroup,false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder categoryViewHolder, final int position) {
        final Laptop l =getListLaptop().get(position);
        categoryViewHolder.tvName.setText(getListLaptop().get(position).getName());
        categoryViewHolder.tvPrice.setText(getListLaptop().get(position).getPrice());
        Glide.with(context)
                .load(getListLaptop().get(position).getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(categoryViewHolder.imgPhoto);
        categoryViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listLaptop.get(categoryViewHolder.getAdapterPosition()));
//                Intent intent = new Intent(context, DetailActivity.class);
//                intent.putExtra("Url_Photo",l.getPhoto());
//                intent.putExtra("Name",l.getName());
//                intent.putExtra("Price",l.getPrice());
//                context.startActivity(intent);
                onItemClickCallback.onItemClicked(listLaptop.get(categoryViewHolder.getAdapterPosition()));

            }
        });
    }
    public interface OnItemClickCallback{
        void onItemClicked(Laptop data);
    }
    @Override
    public int getItemCount() {
        return getListLaptop().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvPrice;
        TextView tvDeskripsi;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
