package com.basis.colatina.sigdoc.web.rest;

import com.basis.colatina.sigdoc.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/task")
public class TaskResource {

    private final TaskService service;

}
