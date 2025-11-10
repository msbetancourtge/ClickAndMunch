package com.bestellen.click_munch.store.dto;

import java.util.List;

public record StoreRequest(
        Integer storeId,
        List<PlateRequest> plates,
        List<DrinkRequest> drinks,
        List<DessertRequest> desserts
) {
}
