package com.basis.colatina.sigdoc.repository;

import com.basis.colatina.sigdoc.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
