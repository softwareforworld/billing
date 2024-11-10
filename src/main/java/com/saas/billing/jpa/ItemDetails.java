package com.saas.billing.jpa;

import com.saas.billing.constant.SchemaConstants;
import com.saas.billing.constant.TableConstants;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.io.Serializable;

@Getter
@Setter
@ToString
@Data
@Entity
@Table(name = TableConstants.ITEM_DETAILS, schema = SchemaConstants.PUBLIC)
public class ItemDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(insertable = false)
    @Transient
    String itemName;
    @Column(insertable = false)
    @Transient
    String itemDescription;
    @Column(insertable = false)
    @Transient
    Double itemMrp;
    @Column(insertable = false)
    @Transient
    Double itemPrice;
    @Column(insertable = false)
    @Transient
    int itemQuantity;
    @Column(insertable = false)
    @Transient
    String itemImage;
    @Column(insertable = false)
    @Transient
    String itemCategory;

}
