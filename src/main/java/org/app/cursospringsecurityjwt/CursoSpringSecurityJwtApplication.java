package org.app.cursospringsecurityjwt;

import org.app.cursospringsecurityjwt.model.ERole;
import org.app.cursospringsecurityjwt.model.RoleEntity;
import org.app.cursospringsecurityjwt.model.UserEntity;
import org.app.cursospringsecurityjwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@SpringBootApplication
public class CursoSpringSecurityJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(CursoSpringSecurityJwtApplication.class, args);
    }


//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    @Autowired
//    UserRepository userRepository;
//    @Bean
//    CommandLineRunner init() {
//        return args -> {
//            UserEntity userEntity = UserEntity.builder()
//                    .email("santiago@mail.com")
//                    .username("santiago")
//                    .password(passwordEncoder.encode("1234"))
//                    .roles(Set.of(
//                            RoleEntity.builder()
//                                    .name(ERole.ADMIN) // O usar ERole.valueOf("ADMIN") si prefieres
//                                    .build()
//                    ))
//                    .build();
//
//            // Aquí puedes agregar el código para guardar la entidad, por ejemplo:
//            userRepository.save(userEntity);
//        };
//    }

}
