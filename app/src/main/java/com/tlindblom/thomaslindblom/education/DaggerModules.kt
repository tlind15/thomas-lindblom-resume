package com.tlindblom.thomaslindblom.education

import androidx.lifecycle.MutableLiveData
import dagger.Module
import dagger.Provides

@Module
class EducationUIStateModule {

    private val undergraduate: MutableLiveData<Education> = MutableLiveData()
    private val masters: MutableLiveData<Education> = MutableLiveData()

    @Provides
    fun getUIState(): EducationUIState {
        return object : EducationUIState {
            override val undergradEduLiveData: MutableLiveData<Education> = undergraduate
            override val mastersEduLiveData: MutableLiveData<Education> = masters
        }
    }
}