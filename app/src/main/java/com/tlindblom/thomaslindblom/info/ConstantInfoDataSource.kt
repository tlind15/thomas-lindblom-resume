package com.tlindblom.thomaslindblom.info

import com.tlindblom.thomaslindblom.base.Arguments
import com.tlindblom.thomaslindblom.base.DataOperation
import javax.inject.Inject

class ConstantInfoDataSource @Inject constructor() :
    DataOperation<ConstantInfoDataSource.ConstantInfoArguments, Info> {

    override suspend fun doOperation(args: ConstantInfoArguments?): Info? {
        return Info("tlindblomjr@gmail.com", "linkedin.com/in/thomas-lindblom-jr/",
            "@tlind15")
    }

    interface ConstantInfoArguments: Arguments {}
}