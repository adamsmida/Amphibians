package com.example.amphibians.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.amphibians.data.AmphibiansRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AmphibiansViewModel : ViewModel() {
    private val repository = AmphibiansRepository()

    private val _amphibians = MutableStateFlow<List<Amphibian>>(emptyList())
    val amphibians: StateFlow<List<Amphibian>> = _amphibians.asStateFlow()

    init {
        loadAmphibians()
    }

    private fun loadAmphibians() {
        _amphibians.value = repository.getAmphibians()
    }
}