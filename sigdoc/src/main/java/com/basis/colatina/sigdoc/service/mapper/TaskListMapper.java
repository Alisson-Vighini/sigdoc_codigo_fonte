package com.basis.colatina.sigdoc.service.mapper;

import com.basis.colatina.sigdoc.domain.Task;
import com.basis.colatina.sigdoc.service.dto.TaskListDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ResponsibleTaskmapper.class})
public interface TaskListMapper extends EntityMapper<TaskListDTO, Task>{
}
