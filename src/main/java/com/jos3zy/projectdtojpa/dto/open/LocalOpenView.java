package com.jos3zy.projectdtojpa.dto.open;

import org.springframework.beans.factory.annotation.Value;

public interface LocalOpenView {
    @Value("#{target.name + ' de ' + target.floor}")
    String getNameAndFloor();
}
