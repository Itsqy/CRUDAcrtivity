package com.syatria.crud.api

import com.syatria.crud.model.ResponseGetKategori
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("kategori")
    fun getKategori(): Call<ResponseGetKategori>

}