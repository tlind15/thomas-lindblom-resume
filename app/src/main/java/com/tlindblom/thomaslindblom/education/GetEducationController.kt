package com.tlindblom.thomaslindblom.education

import androidx.lifecycle.MutableLiveData
import com.tlindblom.thomaslindblom.base.Controller
import dagger.Module
import dagger.Provides
import javax.inject.Inject

class GetEducationController @Inject constructor(useCase: GetEducationUseCase, private val uiState: EducationUIState):
    Controller<GetEducationArgs, Map<Degree, Education>,
            GetEducationDataRepository.GetEducationDataRepoValues>(useCase) {

    override fun processResult(value: Map<Degree, Education>?) {
        uiState.undergradEduLiveData.postValue(value?.get(Degree.BS))
        uiState.mastersEduLiveData.postValue(value?.get(Degree.MS))
    }
}



