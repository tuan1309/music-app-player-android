package com.khanhleis11.appnghenhac_nhom3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.khanhleis11.appnghenhac_nhom3.R;
import com.khanhleis11.appnghenhac_nhom3.models.Song;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private List<Song> songList; // Use List<Song> instead of List<String[]>

    public SongAdapter(List<Song> songList) {
        this.songList = songList;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_song, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        Song song = songList.get(position); // Get Song object at the given position
        holder.songName.setText(song.getTitle() + " - " + song.getArtist()); // Set Song title and artist
        holder.songArt.setImageResource(song.getImageResource());  // Set the image resource
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    public static class SongViewHolder extends RecyclerView.ViewHolder {

        CardView songCard;
        TextView songName;
        ImageView songArt;
        ImageView moreIcon;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            songCard = itemView.findViewById(R.id.song_card);  // Reference the CardView by ID
            songName = itemView.findViewById(R.id.song_name);
            songArt = itemView.findViewById(R.id.song_art);
            moreIcon = itemView.findViewById(R.id.more_icon);
        }
    }
}
