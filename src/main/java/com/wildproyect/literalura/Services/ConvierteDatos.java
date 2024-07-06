package com.wildproyect.literalura.Services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ConvierteDatos implements IConveritDatos{

    private ObjectMapper objectMapper = new ObjectMapper();

    public <T> T obtenerDatos(String json, Class<T> clase){
        try{
            return objectMapper.readValue(json, clase);
        }catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }

}
