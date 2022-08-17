package com.halilkuru.ulkeleruygulamasi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.halilkuru.ulkeleruygulamasi.model.Country

class CountryViewModel : ViewModel() {

    val countryLiveData = MutableLiveData<Country>()

    fun roomdanDataAl() {

        val country =  Country("Türkiye","Asya","Ankara","TRY","Türkçe","www.ss.com")
        countryLiveData.value = country

    }



}