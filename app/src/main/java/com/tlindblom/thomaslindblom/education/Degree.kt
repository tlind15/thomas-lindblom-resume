package com.tlindblom.thomaslindblom.education

enum class Degree {

    BS {
        override fun fullName() = "Bachelor's of Science"
    },
    MS {
        override fun fullName() = "Master's of Science"
    },

    PhD {
        override fun fullName() = "Doctor of Philosophy"
    };

    abstract fun fullName(): String
}