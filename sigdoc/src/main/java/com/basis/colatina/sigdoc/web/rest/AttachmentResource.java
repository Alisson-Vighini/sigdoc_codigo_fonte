package com.basis.colatina.sigdoc.web.rest;

import com.basis.colatina.sigdoc.service.AttachmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/attachment")
public class AttachmentResource {

    private final AttachmentService service;

}
