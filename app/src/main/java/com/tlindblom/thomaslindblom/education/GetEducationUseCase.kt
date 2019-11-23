package com.tlindblom.thomaslindblom.education

import androidx.recyclerview.widget.SortedList
import com.tlindblom.thomaslindblom.base.UseCase
import java.util.*
import javax.inject.Inject

class GetEducationUseCase @Inject constructor(repository: GetEducationDataRepository):
    UseCase<GetEducationArgs, Map<Degree, Education>,
        GetEducationDataRepository.GetEducationDataRepoValues>(repository) {

    override suspend fun processValues(values: GetEducationDataRepository.GetEducationDataRepoValues): Map<Degree, Education> {
        val educationMap: MutableMap<Degree, Education> = mutableMapOf()
        for (education in values.education) {
           educationMap[education.degree] = education
        }
        return educationMap
    }
}