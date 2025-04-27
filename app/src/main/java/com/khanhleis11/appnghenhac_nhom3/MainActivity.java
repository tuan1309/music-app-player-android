package com.khanhleis11.appnghenhac_nhom3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.khanhleis11.appnghenhac_nhom3.adapters.PlaylistAdapter;
import com.khanhleis11.appnghenhac_nhom3.adapters.SongAdapter;
import com.khanhleis11.appnghenhac_nhom3.models.Song;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView playlistRecycler;
    private PlaylistAdapter playlistAdapter;
    private RecyclerView songRecycler;
    private SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the RecyclerView for playlist
        playlistRecycler = findViewById(R.id.playlist_recycler);
        playlistRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)); // Horizontal layout for RecyclerView

        // Example playlist data (replace this with real data or Song objects)
        List<Song> playlistItems = new ArrayList<>();
        playlistItems.add(new Song("Playlist 1", "Artist 1", R.drawable.ic_music));
        playlistItems.add(new Song("Playlist 2", "Artist 2", R.drawable.ic_music));
        playlistItems.add(new Song("Playlist 3", "Artist 3", R.drawable.ic_music));
        playlistItems.add(new Song("Playlist 4", "Artist 4", R.drawable.ic_music));
        playlistItems.add(new Song("Playlist 5", "Artist 5", R.drawable.ic_music));

        // Create the adapter with the playlist data
        playlistAdapter = new PlaylistAdapter(playlistItems);
        playlistRecycler.setAdapter(playlistAdapter);

        // Optimize RecyclerView performance
        playlistRecycler.setHasFixedSize(true);

        // Initialize the RecyclerView for song list
        songRecycler = findViewById(R.id.song_list_recycler);
        songRecycler.setLayoutManager(new LinearLayoutManager(this));  // Default vertical layout for RecyclerView

        // Example song list data (replace this with real data or Song objects)
        List<Song> songItems = new ArrayList<>();
        songItems.add(new Song("11086493", "unknown", R.drawable.ic_song));
        songItems.add(new Song("O Maahi", "unknown", R.drawable.ic_song));
        songItems.add(new Song("S22 Ultra", "unknown", R.drawable.ic_song));

        // Create the adapter for song data
        songAdapter = new SongAdapter(songItems);
        songRecycler.setAdapter(songAdapter);

        // Optimize RecyclerView performance
        playlistRecycler.setHasFixedSize(true);
        songRecycler.setHasFixedSize(true);
    }
}
