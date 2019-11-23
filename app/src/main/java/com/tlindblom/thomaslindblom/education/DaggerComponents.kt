package com.tlindblom.thomaslindblom.education

import dagger.Component
import javax.inject.Singleton

@Component(modules=[EducationUIStateModule::class])
interface GetEducationControllerComponent {
    fun educationController(): GetEducationController
}