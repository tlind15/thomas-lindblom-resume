package com.tlindblom.thomaslindblom.education


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders

import com.tlindblom.thomaslindblom.R
import com.tlindblom.thomaslindblom.databinding.FragmentEducationBinding

/**
 * A simple [Fragment] subclass.
 * Use the [EducationFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class EducationFragment : Fragment() {

    private lateinit var binding: FragmentEducationBinding
    private lateinit var viewModel: EducationViewModel
    private lateinit var viewHolder: EducationFragmentViewHolder

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_education, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EducationViewModel::class.java)
        viewHolder = EducationFragmentViewHolder(binding, viewModel, this)
    }

    override fun onStart() {
        super.onStart()
        viewHolder.fetchEducation()
    }

    companion object {
        @JvmStatic
        fun newInstance() = EducationFragment()
    }
}
