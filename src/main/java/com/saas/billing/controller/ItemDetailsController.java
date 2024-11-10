package com.saas.billing.controller;

import com.saas.billing.generic.GenericResponse;
import com.saas.billing.jpa.ItemDetails;
import com.saas.billing.services.ItemDetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/billing/item-details")
public class ItemDetailsController {
    @Autowired
    private ItemDetailsServices itemDetailsServices;

    @GetMapping("/get-item-details")
    public GenericResponse getItemDetails() {
        List<ItemDetails> itemDetailsResponseList = itemDetailsServices.getItemDetails();
        GenericResponse<ItemDetails> genericResponse = new GenericResponse<>("get-item-details", 1, "1",
                1, 1, itemDetailsResponseList);
        return genericResponse;
    }
}
