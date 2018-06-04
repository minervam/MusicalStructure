package com.example.android.musicalstructure;

public class Song {

    //Artist selected
    private String mArtistSelected;

    //Song selected
    private String mSongSelected;

    //Image resource ID for the song selected
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //Image for the play button for the song
    private int mPlayButton;

    /**
     * Created a Song object
     *
     * @param artistSelected  is the name of the artist of the song
     * @param songSelected    is the song that was selected
     * @param imageResourceId is the drawable resource ID for the image associated with the song selected
     * @param playButton      to play the selected song
     */
    public Song(String artistSelected, String songSelected, int imageResourceId, int playButton) {
        mArtistSelected = artistSelected;
        mSongSelected = songSelected;
        mImageResourceId = imageResourceId;
        mPlayButton = playButton;
    }

    //Get the artist selected
    public String getArtistSelected() {
        return mArtistSelected;
    }

    //Get the song selected
    public String getSongSelected() {
        return mSongSelected;
    }

    //Get the image of the song selected
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Play Button
    public int getPlayButton() {
        return mPlayButton;
    }

    //Returns whether or not there is an image for this song
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
