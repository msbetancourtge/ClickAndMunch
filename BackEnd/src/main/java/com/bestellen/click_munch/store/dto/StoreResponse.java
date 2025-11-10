package com.bestellen.click_munch.store.dto;

import com.bestellen.click_munch.menu.Dessert;
import com.bestellen.click_munch.menu.Drink;
import com.bestellen.click_munch.menu.Plate;
import java.util.List;

public record StoreResponse(
    Integer id,
    String name,
    String alias,
    String email,
    String address,
    Double latitude,
    Double longitude,
    List<Plate> plates,
    List<Drink> drinks,
    List<Dessert> desserts
) {}