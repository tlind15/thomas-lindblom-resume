package com.tlindblom.thomaslindblom.base

import kotlinx.coroutines.*
import javax.inject.Inject

abstract class Controller<T: Arguments, S, V: Values>(private val useCase: UseCase<T, S,V>) {

    fun executeUseCase(scope: CoroutineScope, args: T?): Job {
        return scope.launch {
            processResult(useCase.execute(args))
        }
    }

    protected abstract fun processResult(value: S?)
}

