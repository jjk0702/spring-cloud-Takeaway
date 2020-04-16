package com.jjk.shopping.config;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class TokenFilter extends OncePerRequestFilter {



    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

         if (httpServletRequest.getMethod().contains("OPTIONS")){
             httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
             httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST,GET,PUT,OPTIONS,DELETE");
             httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
             httpServletResponse.setHeader("Access-Control-Allow-Headers", "Origin,X-Requested-With,Content-Type,Accept,Authorization,token,uid");
             return;
         }

         if (httpServletRequest.getHeader("token") != null){
             BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
             UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(new User("admin",bCryptPasswordEncoder.encode("admin"), AuthorityUtils.createAuthorityList("admin")), null,AuthorityUtils.createAuthorityList("admin"));
             SecurityContextHolder.getContext().setAuthentication(authenticationToken);
         }

        doFilter(httpServletRequest,httpServletResponse,filterChain);
    }


}
