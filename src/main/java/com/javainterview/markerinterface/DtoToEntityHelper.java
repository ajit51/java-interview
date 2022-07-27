package com.javainterview.markerinterface;

public class DtoToEntityHelper {
    public static <T> void entityConverter(T t) throws EntityMarkerException {
        if (t instanceof EntityMarkerInterface) {
            System.out.println("DTO has been converted into entity"); // special code here
        } else {
            throw new EntityMarkerException("This is not support to save...");
        }
    }
}
