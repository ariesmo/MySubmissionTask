package com.example.mysubmissiontask;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailSubmission extends AppCompatActivity {
    public static final String EXTRA_NAMA= "extra_name";
    public static final String EXTRA_KETERANGAN= "extra_keterangan";
    public static final String EXTRA_FOTO= "extra_foto";
    public static final String EXTRA_DETAIL= "extra_detail";
    TextView tvNamaSubmission, tvDetailSubmission;
    ImageView fotoSubmission;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_detail);
        tvNamaSubmission = findViewById(R.id.tv_item_nama_submission);
        tvDetailSubmission = findViewById(R.id.tv_item_detail_submission);
        fotoSubmission = findViewById(R.id.img_item_photo_det);

        String namaSubmission = getIntent().getStringExtra(EXTRA_NAMA);
        String detailSubmission = getIntent().getStringExtra(EXTRA_DETAIL);
        String foto = getIntent().getStringExtra(EXTRA_FOTO);

        tvNamaSubmission.setText(namaSubmission);
        tvDetailSubmission.setText(detailSubmission);
        Glide.with(DetailSubmission.this)
                .load(foto).apply(new RequestOptions()
                .override(350, 550))
                .into(fotoSubmission);
        }
}
