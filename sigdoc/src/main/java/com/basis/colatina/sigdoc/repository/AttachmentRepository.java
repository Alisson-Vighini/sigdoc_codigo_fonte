package com.basis.colatina.sigdoc.repository;


import com.basis.colatina.sigdoc.domain.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
