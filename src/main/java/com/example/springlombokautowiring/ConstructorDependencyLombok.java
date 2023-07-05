package com.example.springlombokautowiring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConstructorDependencyLombok {

    private final CompoWithValue compoWithValue;

    @Override
    public String toString() {
        return "ConstructorDependencyLombok{" +
                "compoWithValue=" + compoWithValue +
                '}';
    }
}
