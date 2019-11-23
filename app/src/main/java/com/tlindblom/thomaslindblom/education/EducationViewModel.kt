package com.tlindblom.thomaslindblom.education

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.tlindblom.thomaslindblom.base.CleanViewModel
import dagger.Component
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Job
import javax.inject.Singleton

class EducationViewModel(): CleanViewModel<EducationUIState>() {

    private val educationUIStateModule = EducationUIStateModule()
    private val educationController = DaggerGetEducationControllerComponent.builder()
        .educationUIStateModule(educationUIStateModule)
        .build()
        .educationController()

    override val uiState: EducationUIState = educationUIStateModule.getUIState()

    fun fetchEducation(): Job {
        val args = object : GetEducationArgs {}
        return educationController.executeUseCase(viewModelScope, args)
    }
}

