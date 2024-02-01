package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<contactmodel> arrcontacts= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclecontact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrcontacts.add(new contactmodel(R.drawable.image1,"sowmya","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image2,"ram","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image3,"pushpa","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image4,"sandhya","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image5,"harish","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image6,"gayathri","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image7,"saranya","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image8,"sowmya","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image9,"ram","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image10,"pushpa","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image1,"sowmya","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image2,"ram","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image3,"pushpa","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image4,"sandhya","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image5,"harish","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image6,"gayathri","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image7,"saranya","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image8,"sowmya","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image9,"ram","9442085403"));
        arrcontacts.add(new contactmodel(R.drawable.image10,"pushpa","9442085403"));

        recyclercontactadapter adapter= new recyclercontactadapter(MainActivity.this,arrcontacts);
        recyclerView.setAdapter(adapter);


    }
}