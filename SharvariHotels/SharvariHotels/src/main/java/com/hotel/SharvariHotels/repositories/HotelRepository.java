package com.hotel.AnaghaHotels.repositories;

import com.hotel.AnaghaHotels.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}