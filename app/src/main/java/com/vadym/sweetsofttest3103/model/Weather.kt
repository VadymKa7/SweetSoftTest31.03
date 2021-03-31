package com.vadym.sweetsofttest3103.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Weather(
        @SerializedName("title") val title : String,
        @SerializedName("location_type") val location_type : String,
        @SerializedName("woeid") val woeid : Int,
        @SerializedName("latt_long") val latt_long : String
): Parcelable
