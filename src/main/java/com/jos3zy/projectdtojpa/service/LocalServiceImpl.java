package com.jos3zy.projectdtojpa.service;

import com.jos3zy.projectdtojpa.dto.closed.ProductClosedView;
import com.jos3zy.projectdtojpa.dto.open.LocalOpenView;
import com.jos3zy.projectdtojpa.entity.Local;
import com.jos3zy.projectdtojpa.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocalServiceImpl implements LocalService{

    @Autowired
    LocalRepository localRepository;

    @Override
    public List<Local> findAll() {
        return localRepository.findAll();
    }

    @Override
    public List<LocalOpenView> findBy() {
        return localRepository.findBy();
    }


}
