package com.halilkuru.ulkeleruygulamasi.service

import com.halilkuru.ulkeleruygulamasi.model.Country
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class CountryAPIService {

    //https://raw.githubusercontent.com/hhalilkuru/UlkelerListesi/master/UlkeVeri.json
    /* Retrofit URL yi ikiye ayırıyor
     BASE URL: https://raw.githubusercontent.com
     EXTENSİON: "hhalilkuru/UlkelerListesi/master/UlkeVeri.json"  */

    private val BASE_URL = "https://raw.githubusercontent.com/"
    private val api =  Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(CountryAPI::class.java)

    fun getData() : Single<List<Country>>{

        return api.getCountries()
    }
}