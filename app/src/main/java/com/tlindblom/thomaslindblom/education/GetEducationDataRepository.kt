package com.tlindblom.thomaslindblom.education

import com.tlindblom.thomaslindblom.base.DataRepository
import com.tlindblom.thomaslindblom.base.Values
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetEducationDataRepository @Inject constructor(private val constantEducationSourceSource: ConstantEducationSource): DataRepository<GetEducationArgs,
        GetEducationDataRepository.GetEducationDataRepoValues> {

    override suspend fun getValues(args: GetEducationArgs?): GetEducationDataRepoValues {
        val education: List<Education> = constantEducationSourceSource.doOperation(null)!!
        return object : GetEducationDataRepoValues {
            override val education: List<Education>
                get() = education
        }
    }

    interface GetEducationDataRepoValues: Values {
        val education: List<Education>
    }
}