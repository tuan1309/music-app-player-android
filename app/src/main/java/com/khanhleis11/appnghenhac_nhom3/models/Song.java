package com.khanhleis11.appnghenhac_nhom3.models;

public class Song {
    private String title;
    private String artist;
    private int imageResource;

    public Song(String title, String artist, int imageResource) {
        this.title = title;
        this.artist = artist;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getImageResource() {
        return imageResource;
    }
}
