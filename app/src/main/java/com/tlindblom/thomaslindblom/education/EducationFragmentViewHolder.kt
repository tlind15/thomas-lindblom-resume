package com.tlindblom.thomaslindblom.education

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.tlindblom.thomaslindblom.databinding.FragmentEducationBinding
import kotlinx.coroutines.Job
import java.lang.StringBuilder

class EducationFragmentViewHolder(private val binding: FragmentEducationBinding,
                                  private val viewModel: EducationViewModel,
                                  private val fragmentLifecycleOwner: LifecycleOwner) {

    init {
        binding.educationViewModel = viewModel
        binding.lifecycleOwner = fragmentLifecycleOwner

        viewModel.uiState.undergradEduLiveData.observe(fragmentLifecycleOwner, Observer {
            binding.courselistUndergraduateTextview.text = createCourseworkString(it)
        })

        viewModel.uiState.mastersEduLiveData.observe(fragmentLifecycleOwner, Observer {
            binding.courselistMastersTextview.text = createCourseworkString(it)
        })
    }

    fun fetchEducation() {
        val job = viewModel.fetchEducation()
    }

    private fun createCourseworkString(education: Education): String {
        val stringBuilder = StringBuilder()
        for (courseString in education.courseList) {
            stringBuilder.append("$courseString ")
        }
        return stringBuilder.toString()
    }
}