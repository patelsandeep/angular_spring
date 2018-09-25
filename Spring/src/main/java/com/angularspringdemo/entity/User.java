package com.angularspringdemo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author shruti
 */
@Entity
@Getter
@Setter
@Table(indexes = {
    @Index(name = "email", columnList = "email")
        },
        uniqueConstraints = {
            @UniqueConstraint(columnNames = "email")
        })
public class User implements Serializable {

    private static final long serialVersionUID = 1959237682919401992L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

}
