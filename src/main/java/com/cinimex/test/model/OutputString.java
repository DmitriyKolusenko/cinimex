package com.cinimex.test.model;

public class OutputString {
    private String outputString;

    public OutputString() {}

    public OutputString(String string) {
        this.outputString = string;
    }

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof OutputString)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        OutputString outputString = (OutputString)object;
        return this.outputString.equals(outputString.outputString);
    }
}
