package com.tlindblom.thomaslindblom.base

interface DataOperation<T: Arguments, S> {
    suspend fun doOperation(args: T?): S?
}