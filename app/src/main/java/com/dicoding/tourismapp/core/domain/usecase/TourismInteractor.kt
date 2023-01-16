package com.dicoding.tourismapp.core.domain.usecase

import com.dicoding.tourismapp.core.domain.model.Tourism
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import javax.inject.Inject

class TourismInteractor @Inject constructor(private val repository: ITourismRepository) : TourismUseCase {
    override fun getAllTourism() = repository.getAllTourism()

    override fun getFavoriteTourism() = repository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) = repository.setFavoriteTourism(tourism, state)
}