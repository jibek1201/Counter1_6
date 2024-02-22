package com.example.counter1_6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var count = 0
    private val _counterLv = MutableLiveData<Int>()
    val counterLv: LiveData<Int>
        get() = _counterLv

    fun inc() {
        _counterLv.value = count++
    }

    fun dec() {
        _counterLv.value = count--
    }

}