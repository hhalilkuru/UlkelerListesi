package com.halilkuru.ulkeleruygulamasi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.halilkuru.ulkeleruygulamasi.model.Country

class FeedViewModel : ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryError = MutableLiveData<Boolean>()
    val countryLoading = MutableLiveData<Boolean>()

    fun refreshData(){

        val country = Country("Türkiye","Asya","Ankara","TRY","Türkçe","www.ss.com")
        val country2 = Country("Fransa","Avrupa","Paris","Euro","Fransızca","www.ss.com")
        val country3 = Country("Almanya","Avrupa","Berlin","Euro","Almanca","www.ss.com")

        val countryList = arrayListOf(country,country2,country3)

        countries.value = countryList
        countryError.value = false
        countryLoading.value = false

    }

}