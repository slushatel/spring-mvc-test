package app.config;

//@Configuration
//@EnableWebSecurity
//public class CustomWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user1")
//                .password(passwordEncoder()
//                        .encode("user1Pass"))
//                .authorities("ROLE_USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .anyRequest().permitAll()
////                .authenticated()
////                .and()
////                .httpBasic()
//        ;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
