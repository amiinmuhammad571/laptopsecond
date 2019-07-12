package com.madev.laptopsecond;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public String PHOTO = "PHOTO";
    public String NAME ="NAME";
    public String PRICE ="Price";
    public String DESCRIPTION ="DESCRIPTION";
    ImageView photo;
    TextView name,price,description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//        getIncomingIntent();
    }
    private void getIncomingIntent(){
        String imgPath = getIntent().getStringExtra(PHOTO);
        String nama = getIntent().getStringExtra(NAME);
        String harga = getIntent().getStringExtra(PRICE);
        String description = getIntent().getStringExtra(DESCRIPTION);
        photo = (ImageView) findViewById(R.id.img_item_photo);
        name = (TextView) findViewById(R.id.tv_item_name);
        price = (TextView) findViewById(R.id.tv_item_price);

        if(imgPath.isEmpty()){
            photo.setVisibility(View.GONE);
        }else {
            Glide.with(this)
                    .load(imgPath)
                    .into(photo);
        }
    }
    private void setImage(){

    }
}
