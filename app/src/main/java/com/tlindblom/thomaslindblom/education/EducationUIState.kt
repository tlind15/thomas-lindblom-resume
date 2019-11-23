package com.tlindblom.thomaslindblom.education

import androidx.lifecycle.MutableLiveData
import com.tlindblom.thomaslindblom.base.UIState

interface EducationUIState: UIState {
    val undergradEduLiveData: MutableLiveData<Education>
    val mastersEduLiveData: MutableLiveData<Education>
}