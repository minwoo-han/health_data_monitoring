package com.minu.health.domain.repository

import com.minu.health.domain.model.GoogleFitData
import com.minu.health.domain.model.SamsungHealthData

interface HealthDataRepository {

    suspend fun getDataFromGoogle(): GoogleFitData

    suspend fun getDataFromSamsung(): SamsungHealthData

}