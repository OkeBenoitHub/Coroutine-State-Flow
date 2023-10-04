package com.example.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
//    private var total = MutableLiveData<Int>()
//    val totalData : LiveData<Int>
//        get() = total

      private val _flowTotal = MutableStateFlow<Int>(0)
      val flowTotal : StateFlow<Int> = _flowTotal
      //get() = _flowTotal



    init {
       // total.value = startingTotal
        _flowTotal.value = startingTotal
    }

    fun setTotal(input:Int){
       // total.value =(total.value)?.plus(input)
        _flowTotal.value = (_flowTotal.value).plus(input)
    }
}