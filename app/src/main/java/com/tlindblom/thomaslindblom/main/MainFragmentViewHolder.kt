package com.tlindblom.thomaslindblom.main

import androidx.fragment.app.Fragment
import com.tlindblom.thomaslindblom.education.EducationFragment
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragmentViewHolder(private val fragment: MainFragment) {

    var viewPagerAdapter: ResumeViewPagerAdapter? = null

    fun initViewPager() {
        val fragmentList = mutableListOf<Fragment>(EducationFragment.newInstance())
        if (fragment.fragmentManager != null) {
            viewPagerAdapter =
                ResumeViewPagerAdapter(
                    fragment.fragmentManager!!,
                    fragment.lifecycle,
                    fragmentList
                )
            fragment.resume_viewpager2.adapter = viewPagerAdapter
        }
    }
}