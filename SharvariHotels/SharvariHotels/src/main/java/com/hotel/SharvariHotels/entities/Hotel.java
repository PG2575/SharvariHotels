package com.hotel.AnaghaHotels.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Hotel {


    @Id
    private String Id;

    private String name;

    private String location;

    private String about;



}
