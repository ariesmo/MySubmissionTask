package com.example.mysubmissiontask;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewSubmissionAdapter extends RecyclerView.Adapter<CardViewSubmissionAdapter.CardViewViewHolder> {

    private Context context;
    private ArrayList<Submission> listSubmission;

//    public CardViewSubmissionAdapter(Context context, ArrayList<Submission> listSubmission) {
//        this.context = context;
//        this.listSubmission = listSubmission;
//    }

    public CardViewSubmissionAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Submission> getListSubmission() {
        return listSubmission;
    }

    public void setListSubmission(ArrayList<Submission> listSubmission) {
        this.listSubmission = listSubmission;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        Submission p = getListSubmission().get(position);
        Glide.with(context)
                .load(p.getFoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvNama.setText(p.getNama());
        holder.tvRemarks.setText(p.getKeterangan());
        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback(){
            public void onItemClicked(View view, int position) {
                //Toast.makeText(context, "Favorite " +getListSubmission().get(position).getNama(), Toast.LENGTH_SHORT).show();
//                Context context = view.getContext();
                Intent detailIntent = new Intent(context, DetailSubmission.class);
                detailIntent.putExtra(DetailSubmission.EXTRA_NAMA, getListSubmission().get(position).getNama());
                detailIntent.putExtra(DetailSubmission.EXTRA_DETAIL, getListSubmission().get(position).getDetail());
                detailIntent.putExtra(DetailSubmission.EXTRA_FOTO, getListSubmission().get(position).getFoto());
                context.startActivity(detailIntent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return listSubmission.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvRemarks;
        Button btnDetail;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
            tvNama = (TextView) itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView) itemView.findViewById(R.id.tv_item_remarks);
            btnDetail = (Button) itemView.findViewById(R.id.btn_set_favorite);
        }
    }
}
