package com.basis.colatina.sigdoc.service.mapper;

import com.basis.colatina.sigdoc.domain.Responsible;
import com.basis.colatina.sigdoc.service.dto.ResponsibleTaskDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ResponsibleTaskmapper extends EntityMapper<ResponsibleTaskDTO, Responsible>{

}
