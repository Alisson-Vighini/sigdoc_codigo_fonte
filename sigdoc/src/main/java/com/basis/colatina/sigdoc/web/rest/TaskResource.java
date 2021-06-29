package com.basis.colatina.sigdoc.web.rest;

import com.basis.colatina.sigdoc.service.TaskService;
import com.basis.colatina.sigdoc.service.dto.TaskListDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/task")
public class TaskResource {

    private final TaskService service;

    @GetMapping()
    public ResponseEntity<List<TaskListDTO>> listAllTasks(){
        return ResponseEntity.ok(service.findAllTasks());
    }

}
