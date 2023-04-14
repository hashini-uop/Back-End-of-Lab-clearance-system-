package com.system.labClearanceSystem.security.jwt;
//import java.io.IOException;
//
//
//import com.system.labClearanceSystem.security.services.UserDetailsServiceImpl;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.FilterChain;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.util.StringUtils;



//import jakarta.annotation.Nonnull;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//@Component
//@RequiredArgsConstructor
//public class AuthTokenFilter extends OncePerRequestFilter{
//
//    private final JwtService jwtService;
//    private final UserDetailsService userDetailsService;
//    @Override
//    protected void doFilterInternal(
//            @Nonnull HttpServletRequest request,
//            @Nonnull HttpServletResponse response,
//            @Nonnull FilterChain filterChain
//    ) throws ServletException, IOException {
//        final String authHeader = request.getHeader("Authorization");
//        final String jwt;
//        final String userEmail;
//        if(authHeader == null || !authHeader.startsWith("Bearer")){
//            filterChain.doFilter(request,response);
//            return;
//        }
//        jwt = authHeader.substring(7);
//        userEmail = jwtService.extractUsername(jwt);// extract the userEmail from JWT token;
//        if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null){
//            //If already in the database
//            UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail);
//            if (jwtService.isTokenValid(jwt , userDetails)) {
//                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
//                        userDetails,
//                        null, // no credentials
//                        userDetails.getAuthorities()
//
//                );
//                authToken.setDetails(
//                        new WebAuthenticationDetailsSource().buildDetails(request)
//                );
//                SecurityContextHolder.getContext().setAuthentication(authToken);
//            }
//        }
//        filterChain.doFilter(request , response);
//    }
//
//    }





//    @Autowired
//    private JwtUtils jwtUtils;
//
//    @Autowired
//    private UserDetailsServiceImpl userDetailsService;
//
//    private static final Logger logger = LoggerFactory.getLogger(AuthTokenFilter.class);
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws ServletException, IOException {
//        try {
//            String jwt = parseJwt(request);
//            if (jwt != null && jwtUtils.validateJwtToken(jwt)) {
//                String username = jwtUtils.getUserNameFromJwtToken(jwt);
//
//                UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
//                        userDetails, null, userDetails.getAuthorities());
//                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//
//                SecurityContextHolder.getContext().setAuthentication(authentication);
//            }
//        } catch (Exception e) {
//            logger.error("Cannot set user authentication: {}", e);
//        }
//
//        filterChain.doFilter(request, response);
//    }
//
//    private String parseJwt(HttpServletRequest request) {
//        String headerAuth = request.getHeader("Authorization");
//
//        if (StringUtils.hasText(headerAuth) && headerAuth.startsWith("Bearer ")) {
//            return headerAuth.substring(7, headerAuth.length());
//        }
//
//        return null;
//
//    }
//}
