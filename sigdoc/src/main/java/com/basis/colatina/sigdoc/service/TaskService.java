package com.basis.colatina.sigdoc.service;

import com.basis.colatina.sigdoc.repository.TaskRepository;
import com.basis.colatina.sigdoc.service.dto.TaskListDTO;
import com.basis.colatina.sigdoc.service.mapper.TaskListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    private final TaskListMapper taskListMapper;

    public List<TaskListDTO> findAllTasks(){
        return taskListMapper.toDto(taskRepository.findAll());
    }

}
