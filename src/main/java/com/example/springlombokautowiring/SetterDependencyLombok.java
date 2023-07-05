package com.example.springlombokautowiring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class SetterDependencyLombok {
    @Setter(onMethod=@__({@Autowired}))
    private CompoWithValue compoWithValue;

    @Override
    public String toString() {
        return "SetterDependencyLombok{" +
                "compoWithValue=" + compoWithValue +
                '}';
    }
}
