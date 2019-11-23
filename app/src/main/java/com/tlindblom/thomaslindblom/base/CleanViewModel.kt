package com.tlindblom.thomaslindblom.base

import androidx.lifecycle.ViewModel

abstract class CleanViewModel<T: UIState>: ViewModel() {
    abstract val uiState: T
}