package com.saas.billing.repository;

import com.saas.billing.jpa.ItemDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QueryRepository extends JpaRepository<ItemDetails, Long> {

    @Query(nativeQuery = true, value = "select ic.id,ic.category_name,ic.category_type,id.item_name,id.item_description,id.item_image," +
            " iad.no_of_item - iad.no_of_item_sale item_quantity, iad.base_price item_mrp, iad.discounted_price item_price" +
            " from " +
            " item_category ic " +
            " inner join" +
            " item_details id" +
            " on " +
            " ic.id = id.item_category_id" +
            " and " +
            " ic.is_active=1" +
            " and " +
            " id.is_active=1" +
            " inner join " +
            " item_availability_details iad" +
            " on " +
            " id.id = iad.item_details_id" +
            " and " +
            " iad.is_active=1")
    List<ItemDetails> getItemDetails();
}
