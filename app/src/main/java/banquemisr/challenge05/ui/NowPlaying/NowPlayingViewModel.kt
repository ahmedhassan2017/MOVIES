package banquemisr.challenge05.ui.NowPlaying

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NowPlayingViewModel : ViewModel()
{

    private val _text = MutableLiveData<String>().apply {
        value = "This is now playing Fragment"
    }
    val text: LiveData<String> = _text
}