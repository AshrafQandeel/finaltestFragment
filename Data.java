package com.example.ashraf.finaltestfragment;

public class Data {
    private int mTitleId;
    private int mParagraphId;
    private int mImageResourceId = N0_IMAGE_PROVIDED;
    private static final int N0_IMAGE_PROVIDED = -1;

    public Data(int titleId, int paragraphId, int imageResourceId) {
        mTitleId = titleId;
        mParagraphId = paragraphId;
        mImageResourceId = imageResourceId;
    }

    public int getTitleId() {
        return mTitleId;
    }

    public int getParagraphId() {
        return mParagraphId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != N0_IMAGE_PROVIDED;
    }
}
