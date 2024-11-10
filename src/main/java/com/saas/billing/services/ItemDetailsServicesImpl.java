package com.saas.billing.services;

import com.saas.billing.repository.QueryRepository;
import com.saas.billing.jpa.ItemDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemDetailsServicesImpl implements ItemDetailsServices{

    @Autowired
    QueryRepository queryRepository;


    @Override
    public List<ItemDetails> getItemDetails() {
        List<ItemDetails> itemDetailsResponseList = queryRepository.getItemDetails();
        return itemDetailsResponseList;
    }
}
