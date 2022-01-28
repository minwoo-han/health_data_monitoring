package com.minu.health.domain.usercase

import com.minu.health.domain.model.GoogleFitData
import com.minu.health.domain.repository.HealthDataRepository

class GetGoogleDataUseCase(private val repository: HealthDataRepository) {

    suspend fun invoke(): GoogleFitData {
        return repository.getDataFromGoogle()
    }

}