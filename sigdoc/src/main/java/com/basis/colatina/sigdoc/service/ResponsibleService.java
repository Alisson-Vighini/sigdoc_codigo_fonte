package com.basis.colatina.sigdoc.service;

import com.basis.colatina.sigdoc.repository.ResponsibleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ResponsibleService {

    private final ResponsibleRepository repository;

}
