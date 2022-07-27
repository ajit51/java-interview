package com.javainterview.markerinterface;

public class MarketInterfaceTest {
    public static void main(String[] args) throws EntityMarkerException {
        EmployeeDto dto = new EmployeeDto();
        dto.setContactNo("784645465");
        dto.setId(1L);
        dto.setName("XYZ");
        DtoToEntityHelper.entityConverter(dto);
    }
}
