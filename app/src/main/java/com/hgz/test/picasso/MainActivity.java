package com.hgz.test.picasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.GrayscaleTransformation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        Picasso.with(this)
                .load("https://www.baidu.com/img/bd_logo1.png")
                .placeholder(R.mipmap.ic_launcher)//网络请求还没有完成时显示的图片
                .error(R.mipmap.ic_launcher_round)
                .transform(new GrayscaleTransformation())
                .fit()
                .centerCrop()
                .rotate(60)
                .into(imageView);
    }
}
