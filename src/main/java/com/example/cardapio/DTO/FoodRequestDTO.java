package com.example.cardapio.DTO;


import com.example.cardapio.model.Food;

public record FoodRequestDTO(String title, String image, Integer price) {
}
