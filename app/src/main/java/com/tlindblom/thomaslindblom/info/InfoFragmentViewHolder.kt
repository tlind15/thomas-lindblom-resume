package com.tlindblom.thomaslindblom.info

import androidx.lifecycle.LifecycleOwner
import com.tlindblom.thomaslindblom.databinding.InfoFragmentBinding

class InfoFragmentViewHolder (private val binding: InfoFragmentBinding,
                              private val viewModel: InfoViewModel,
                              private val fragmentLifecycleOwner: LifecycleOwner) {

    init {
        binding.viewModel = viewModel
        binding.lifecycleOwner = fragmentLifecycleOwner
    }
}