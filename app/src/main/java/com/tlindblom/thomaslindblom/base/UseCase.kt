package com.tlindblom.thomaslindblom.base

abstract class UseCase<T: Arguments, S, V: Values>(private val repository: DataRepository<T, V>) {

    suspend fun execute(args: T?): S? {
        return processValues(repository.getValues(args))
    }
    abstract suspend fun processValues(values: V): S?
}