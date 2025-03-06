package com.example.mini.service;


import com.example.mini.DTO.ITypeDTO;
import com.example.mini.model.Type;

public interface ITypeService extends IGenerateService<Type>{
Iterable<ITypeDTO> getAllTypes();
}
