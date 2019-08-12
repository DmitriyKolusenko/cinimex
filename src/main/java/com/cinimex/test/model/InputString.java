package com.cinimex.test.model;

public class InputString {
    private String inputString;

    public InputString() {}

    public InputString(String inputString) {
        this.inputString = inputString;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof InputString)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        InputString inputString = (InputString)object;
        return this.inputString.equals(inputString.inputString);
    }
}
