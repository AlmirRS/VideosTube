package com.tech.ng.videostube.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tech.ng.videostube.R;
import com.tech.ng.videostube.adapter.AdapterVideo;
import com.tech.ng.videostube.model.Video;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerVideos;
    private List<Video> videos = new ArrayList<>();
    private AdapterVideo adapterVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //iniciar componentes
        recyclerVideos = findViewById(R.id.recyclerVideos);


        //configurar toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("VideosTube");
        getSupportActionBar().hide();

        //configurar recyclerview
        recuperarVideos();
        adapterVideo = new AdapterVideo(videos, this);
        recyclerVideos.setHasFixedSize(true);
        recyclerVideos.setLayoutManager(new LinearLayoutManager(this));
        recyclerVideos.setAdapter(adapterVideo);



    }

    private void recuperarVideos() {

        Video video1 = new Video();
        video1.setTitulo("Video 1 interessante");
        videos.add( video1 );

        Video video2 = new Video();
        video2.setTitulo("Video 2 interessante");
        videos.add( video2 );

    }
}