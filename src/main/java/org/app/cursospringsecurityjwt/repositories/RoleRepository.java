package org.app.cursospringsecurityjwt.repositories;

import org.app.cursospringsecurityjwt.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
