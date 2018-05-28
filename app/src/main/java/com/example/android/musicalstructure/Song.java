package com.example.android.musicalstructure;

public class Song {

    //Artist selected
    private String mArtistSelected;

    //Song selected
    private String mSongSelected;

    /**
     * Create a new Song object.
     *
     * @param artistSelected is the name of the artist of the song
     * @param songSelected is the song that was selected
     */
    public Song(String artistSelected, String songSelected) {
        mArtistSelected = artistSelected;
        mSongSelected = songSelected;
    }

    //Get the artist selected
    public String getArtistSelected() {
        return mArtistSelected;
    }

    //Get the song selected
    public String getSongSelected() {
        return mSongSelected;
    }
}
