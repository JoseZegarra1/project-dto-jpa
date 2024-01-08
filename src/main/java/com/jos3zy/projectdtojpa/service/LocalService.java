package com.jos3zy.projectdtojpa.service;

import com.jos3zy.projectdtojpa.dto.open.LocalOpenView;
import com.jos3zy.projectdtojpa.entity.Local;

import java.util.List;

public interface LocalService {

    List<Local> findAll();

    List<LocalOpenView> findBy();



}
