package com.saas.billing.jpa;

import com.saas.billing.constant.SchemaConstants;
import com.saas.billing.constant.TableConstants;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@ToString
@Data
@Table(name = TableConstants.LOGIN_DETAILS, schema = SchemaConstants.PUBLIC)
public class Login implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "user_name")
    String username;
    String password;
    String organizationName;
    String address;
    String contactNo;
    String emailId;
    String organizationGroupId;
    int isActive = 1;
}
