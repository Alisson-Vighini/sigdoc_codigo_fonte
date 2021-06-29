package com.basis.colatina.sigdoc.web.rest;

import com.basis.colatina.sigdoc.service.ResponsibleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/responsible")
public class ResponsibleResource {

    private final ResponsibleService service;

}
