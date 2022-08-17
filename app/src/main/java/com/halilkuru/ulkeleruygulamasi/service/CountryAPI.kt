package com.halilkuru.ulkeleruygulamasi.service

import com.halilkuru.ulkeleruygulamasi.model.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountryAPI {

    //GET, POST

    //https://raw.githubusercontent.com/hhalilkuru/UlkelerListesi/master/UlkeVeri.json
    /* Retrofit URL yi ikiye ayırıyor
     BASE URL: https://raw.githubusercontent.com
     EXTENSİON: "hhalilkuru/UlkelerListesi/master/UlkeVeri.json"  */

    @GET("hhalilkuru/UlkelerListesi/master/UlkeVeri.json")
    fun getCountries():Single<List<Country>>


}