package com.mor.service.oauth.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "permission", schema = "netflix_db")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PermissionEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "netflix_db.permission_id_seq")
    private Integer id;
    @Column(name = "name")
    private String name;
}
