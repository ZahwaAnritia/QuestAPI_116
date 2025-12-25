package com.example.questapi_116.viewmodel

import com.example.questapi_116.modeldata.DataSiswa


sealed interface StatusUIDetail {
    data class Success(val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}
