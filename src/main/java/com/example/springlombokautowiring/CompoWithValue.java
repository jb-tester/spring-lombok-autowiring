package com.example.springlombokautowiring;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@RequiredArgsConstructor
@Component
public class CompoWithValue {

    @Value("${value.id}")
    String id;

    @Override
    public String toString() {
        return "CompoWithValue{" +
                "id='" + id + '\'' +
                '}';
    }
}
