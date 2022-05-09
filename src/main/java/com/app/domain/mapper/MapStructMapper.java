package com.app.domain.mapper;

import com.app.domain.dto.EmpleadoAdminDTO;
import com.app.domain.dto.EmpleadoDTO;
import com.app.domain.dto.EmpleadoGetAllDTO;
import com.app.domain.dto.VacunaDTO;
import com.app.domain.entity.Empleado;
import com.app.domain.entity.Vacuna;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    EmpleadoAdminDTO empleadoAdminDto(Empleado empleado);

    Empleado empleadoAdmin(EmpleadoAdminDTO empleadoAdminDTO);

    EmpleadoDTO empleadoDto(Empleado empleado);

    Empleado empleado(EmpleadoDTO empleadoDTO);

    EmpleadoGetAllDTO empleadoGetAllDTO(Empleado empleado);

    VacunaDTO vacunaDTO(Vacuna vacuna);

    Vacuna vacuna(VacunaDTO vacunaDTO);
}
