package com.sexonbeach.demo.mapper;

import com.sexonbeach.demo.model.Emp;
import com.sexonbeach.demo.model.EmpDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper

public interface EmpMapper {

    EmpMapper INSTANCE= Mappers.getMapper(EmpMapper.class);

    EmpDto empToDto(Emp emp);
}
