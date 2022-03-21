package com.felippeneves.kotlin_koin.ui.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.felippeneves.kotlin_koin.data.model.Bitcoin
import com.felippeneves.kotlin_koin.data.repository.MainRepository
import com.felippeneves.kotlin_koin.utils.NetworkHelper
import com.felippeneves.kotlin_koin.utils.Resource
import kotlinx.coroutines.launch

class MainViewModel(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _btc = MutableLiveData<Resource<Bitcoin>>()
    val btc: LiveData<Resource<Bitcoin>>
        get() = _btc

    init {
        fetchBtc()
    }

    private fun fetchBtc() {
        viewModelScope.launch {
            _btc.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepository.getBitcoinDetails().let {
                    if (it.isSuccessful) {
                        _btc.postValue(Resource.success(it.body()))
                    } else _btc.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } else _btc.postValue(Resource.error("No internet connection", null))
        }
    }
}