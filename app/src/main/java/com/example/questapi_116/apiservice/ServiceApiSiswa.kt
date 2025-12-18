package com.example.questapi_116.apiservice

import com.example.questapi_116.modeldata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa {
    @GET( value="bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>




}