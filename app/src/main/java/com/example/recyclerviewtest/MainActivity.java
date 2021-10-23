package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//测试一下修改

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class TextItem {

        private int ImageId;
        private String textId;

        public TextItem(int imageId, String textId) {
            ImageId = imageId;
            this.textId = textId;
        }

        public int getImageId() {
            return ImageId;
        }

        public void setImageId(int imageId) {
            ImageId = imageId;
        }

        public String getTextId() {
            return textId;
        }

        public void setTextId(String textId) {
            this.textId = textId;
        }
    }
}