package com.example.wearcompose.presentation

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.LatLng

class MapViewModel : ViewModel() {
    val pinList = MutableLiveData<ArrayList<LatLng>>(arrayListOf())
    val destination = MutableLiveData("")

    fun addPin(geoCode: LatLng) {
        destination.value = "lat : ${geoCode.latitude}\nlon : ${geoCode.longitude}"

        pinList.value?.let { list ->
            list.add(geoCode)
            pinList.value = list
            Log.e("kwbae", "geo list: ${pinList.value?.size}")
        }
    }
}