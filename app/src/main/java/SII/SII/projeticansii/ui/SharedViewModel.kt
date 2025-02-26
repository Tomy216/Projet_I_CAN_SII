package SII.SII.projeticansii.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val _phoneNumber = MutableLiveData<String>()
    val phoneNumber: LiveData<String> get() = _phoneNumber

    fun setPhoneNumber(number: String) {
        _phoneNumber.value = number
    }
}