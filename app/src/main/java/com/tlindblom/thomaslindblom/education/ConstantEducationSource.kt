package com.tlindblom.thomaslindblom.education

import com.tlindblom.thomaslindblom.base.Arguments
import com.tlindblom.thomaslindblom.base.DataOperation
import javax.inject.Inject

class ConstantEducationSource @Inject constructor(): DataOperation<ConstantEducationSource.ConstantEducationArgs, List<Education>> {

    override suspend fun doOperation(args: ConstantEducationArgs?): List<Education>? {
       return listOf(getUndergrad(), getGradSchool())
    }

    private fun getUndergrad(): Education {
        val undergrad = Education("University of California, Los Angeles",
            "Biochemistry and Computing", Degree.BS, 2015)
        undergrad.courseList.add("Principles of Java Language with Applications")
        undergrad.courseList.add("Intermediate Programming (C++)")
        return undergrad
    }

    private fun getGradSchool(): Education {
        val gradSchool = Education("California State University, Long Beach",
            "Computer Science", Degree.MS, 2018)
        gradSchool.courseList.add("Advanced Analysis of Algorithms")
        gradSchool.courseList.add("Advanced Software Engineering")
        gradSchool.courseList.add("Database Architecture")
        gradSchool.courseList.add("Requirements Engineering")
        gradSchool.courseList.add("Advanced Artificial Intelligence (with focus on Deep Learning)")
        gradSchool.courseList.add("Advanced Operating Systems")
        gradSchool.courseList.add("Advanced Topics in Programming Languages")
        return gradSchool
    }

    interface ConstantEducationArgs: Arguments {}
}