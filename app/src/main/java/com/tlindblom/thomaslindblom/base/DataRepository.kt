package com.tlindblom.thomaslindblom.base

interface DataRepository<T: Arguments, S: Values> {
    suspend fun getValues(args: T?): S
}