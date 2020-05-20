package com.sexonbeach.demo.controller;

import com.sexonbeach.demo.mapper.EmpMapper;
import com.sexonbeach.demo.model.Emp;
import com.sexonbeach.demo.model.EmpDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpControllerTest {

    @Test
    void getEmp() {

        EmpDto dto= EmpMapper.INSTANCE.empToDto(new Emp("test"));
        assertNotNull(dto);
    }
}