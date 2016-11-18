package com.example.android.tourguide;

/**
 * Created by alvesleo on 07/11/16.
 */

public class Place {

    //Name of the place
    private int mPlaceNameId;

    //Description of the place
    private int mPlaceSummaryId;

    //Image of the place
    private int mImagePlaceId;

    public Place (int placeNameId, int placeSummaryId, int imagePlaceId){
        mPlaceNameId = placeNameId;
        mPlaceSummaryId = placeSummaryId;
        mImagePlaceId = imagePlaceId;
    }

    //Get the name of the place
    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    //Get the description of the place
    public int getPlaceSummaryId() {
        return mPlaceSummaryId;
    }

    //Get the image of the place
    public int getImagePlaceId() {
        return mImagePlaceId;
    }
}
