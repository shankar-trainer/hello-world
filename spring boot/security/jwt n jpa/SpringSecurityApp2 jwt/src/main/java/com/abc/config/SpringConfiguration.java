//package com.abc.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SpringConfiguration {
// @Bean
//    public UserDetailsManager detailsManager(){
//        UserDetails build1 = User.withUsername("rahul").password("abcde").authorities("read").build();
//        UserDetails build2 = User.withUsername("aman").password("wxyz").authorities("admin").build();
//
////        InMemoryUserDetailsManager detailsManager=new InMemoryUserDetailsManager(build);
//        InMemoryUserDetailsManager detailsManager=new InMemoryUserDetailsManager();
//        detailsManager.createUser(build1);
//        detailsManager.createUser(build2);
//        return  detailsManager;
//    }
//     @Bean
//    public PasswordEncoder passwordEncoder(){
//     return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {
////     security.httpBasic(Customizer.withDefaults());
//     security.formLogin(Customizer.withDefaults());
////     security.authorizeHttpRequests(a->a.anyRequest().permitAll());
//     security.authorizeHttpRequests(a->a.anyRequest().authenticated());
//     return  security.build();
//    }
//}
