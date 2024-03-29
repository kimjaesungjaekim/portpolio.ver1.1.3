package com.inno.portpolio.security.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        System.out.println("로그인 성공");
        System.out.println("권한"+ SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        
//        response.sendRedirect("redirect:/users/login");
        response.sendRedirect(request.getContextPath() + "/main/main");
    }
}