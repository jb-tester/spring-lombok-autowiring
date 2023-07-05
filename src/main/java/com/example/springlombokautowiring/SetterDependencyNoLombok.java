package com.example.springlombokautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterDependencyNoLombok {

    private CompoWithValue compoWithValue;

    @Autowired
    public void setCompoWithValue(CompoWithValue compoWithValue) {
        this.compoWithValue = compoWithValue;
    }

    public CompoWithValue getCompoWithValue() {
        return compoWithValue;
    }

    @Override
    public String toString() {
        return "SetterDependencyNoLombok{" +
                "compoWithValue=" + compoWithValue +
                '}';
    }
}
