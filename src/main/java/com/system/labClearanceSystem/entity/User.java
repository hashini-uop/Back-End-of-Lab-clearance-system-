package com.system.labClearanceSystem.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Data
@Builder
@Entity
@Table(name = "users")
//        uniqueConstraints = {
//        @UniqueConstraint(columnNames = "username"),
//        @UniqueConstraint(columnNames = "email")
//        })
@NoArgsConstructor
@AllArgsConstructor
public class User
//        implements UserDetails
        {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Nonnull
        private String fName;

        @Nonnull
        private String lName;

        @Nonnull
        private String email;

        @Nonnull
        private String password;

//        @Enumerated(EnumType.STRING)
//        private ERole role;




                //        @ManyToMany(fetch = FetchType.LAZY)
//        @JoinTable(	name = "user_roles",
//                joinColumns = @JoinColumn(name = "user_id"),
//                inverseJoinColumns = @JoinColumn(name = "role_id"))
//        private Set<Role> roles = new HashSet<>();


//        @Override
//        public boolean isAccountNonExpired() {
//                return true;
//        }
//
//        @Override
//        public boolean isAccountNonLocked() {
//                return true;
//        }
//
//        @Override
//        public boolean isCredentialsNonExpired() {
//                return true;
//        }
//
//        @Override
//        public boolean isEnabled() {
//                return false;
//        }
//
//        @Override
//        public String getPassword(){
//                return password;
//        }
//
//
//        @Override
//        public Collection<? extends GrantedAuthority> getAuthorities() {
//                return List.of(new SimpleGrantedAuthority(role.name()));
//        }
//
//
//        @Override
//        public String getUsername(){
//                return email;
//        }
//

}

