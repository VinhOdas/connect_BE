package com.codegym.service.impl;

import com.codegym.model.LoaiXe;
import com.codegym.repository.ILoaiXeRepository;
import com.codegym.service.ILoaiXeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiXeService implements ILoaiXeService {
    @Autowired
    private ILoaiXeRepository loaiXeRepository;

    @Override
    public List<LoaiXe> getAll() {
        return loaiXeRepository.getAll();

    }
}
