package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Set;


@Data
//@Document
@Entity
@Table(name = "std")
@AllArgsConstructor
@NoArgsConstructor
public class Student implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "student_role", joinColumns = @JoinColumn(name = "student_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> authorities;

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
