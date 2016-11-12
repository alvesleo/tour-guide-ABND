package com.example.android.tourguide;

/**
 * Created by alvesleo on 07/11/16.
 */

public class Place {

    //Name of the place
    private String mPlaceName;

    //Description of the place
    private String mPlaceDescription;

    //Image of the place
    //private int mImagePlaceId;

    public Place (String placeName, String placeDescription){
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
       // mImagePlaceId = imagePlaceId;
    }

    //Get the name of the place
    public String getPlaceName() {
        return mPlaceName;
    }

    //Get the description of the place
    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    //Get the image of the place
//    public int getImagePlaceId() {
//        return mImagePlaceId;
//    }
}
