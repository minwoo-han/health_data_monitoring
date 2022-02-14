package com.minu.health.domain.usercase

import com.minu.health.domain.model.SamsungHealthData
import com.minu.health.domain.repository.HealthDataRepository

class GetSamsungDataUseCase(private val repository: HealthDataRepository) {

    suspend fun invoke(): SamsungHealthData {
        return repository.getDataFromSamsung()
    }

}