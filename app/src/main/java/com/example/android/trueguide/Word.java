package com.example.android.trueguide;
public class Word {
    private String mDefaultTranslation;

    /** Music resource ID for the word */
    private int mImageResourceId =NO_IMAGE_PROVIDED;


    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(String defaultTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId + '\'' +
                '}';
    }

}