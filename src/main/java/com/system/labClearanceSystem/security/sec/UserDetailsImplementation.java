//package com.system.labClearanceSystem.security.sec;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//public class UserDetailsImplementation implements UserDetails {
//
//    private String email;
//    private String password;
//    private List<GrantedAuthority> authorities;
//
////    public UserDetailsImplementation(Users user){
////        email  = user.getEmail();
////        password = user.getPassword();
////        authorities = Stream.of(user.getRole()).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
////    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return email;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}