package banquemisr.challenge05.ui.Upcoming

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UpcomingViewModel : ViewModel()
{

    private val _text = MutableLiveData<String>().apply {
        value = "This is Upcomming Fragment"
    }
    val text: LiveData<String> = _text
}