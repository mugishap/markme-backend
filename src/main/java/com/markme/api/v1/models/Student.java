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
@Table(name = "students")
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Student extends User {

    public Student(User user) {
        super(user.getEmail(), user.getNames(), user.getTelephone(), user.getGender(), user.getPassword());
    }

}
