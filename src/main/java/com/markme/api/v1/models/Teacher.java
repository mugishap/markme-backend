package com.markme.api.v1.models;

import com.markme.api.v1.enums.ERole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "teachers")
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Teacher extends User {

    private ERole role = ERole.TEACHER;

    @Column(name = "nid", nullable = true)
    private String nid;

    public Teacher(User user) {
        super(user.getEmail(), user.getNames(), user.getTelephone(), user.getGender(), user.getPassword());
    }
}
