//package com.system.labClearanceSystem;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//@Component
//public class JwtAuthFilter extends OncePerRequestFilter {
//    @Autowired
//    private JwtAuthService jwtAuthService;
//
//    @Autowired
//    private CustomUserDetailsService customUserDetailsService;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String authorizationHeader = request.getHeader("Authorization");
//        String token = null;
//        String userName = null;
//        String type = null;
//
//        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//            token = authorizationHeader.substring(7);
//            if (token.equalsIgnoreCase("null") || token.equalsIgnoreCase("undefined")) {
//                filterChain.doFilter(request, response);
//                return;
//            }
//            userName = jwtAuthService.extractUserName(token);
//            type = jwtAuthService.extractType(token);
//
//        }
//
//        if (userName != null && !token.equalsIgnoreCase("null") && !token.equalsIgnoreCase("undefined") && SecurityContextHolder.getContext().getAuthentication() == null) {
//            userName = userName + "//@@//" + type;
//            UserDetails userDetails = customUserDetailsService.loadUserByUsername(userName);
//            if (jwtAuthService.validateToken(token, userDetails)) {
//                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(auth);
//            }
//        }
//
//        filterChain.doFilter(request, response);
//    }
//}
