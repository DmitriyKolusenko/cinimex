package com.cinimex.test.service.impl;

import com.cinimex.test.model.InputString;
import com.cinimex.test.model.OutputString;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.cinimex.test.service.StringService;
import org.springframework.stereotype.Service;

@Service
public class StringServiceImpl implements StringService {
    @Override
    public OutputString getOutputString(InputString inputString) {
        String outputString = inputString.getInputString().replaceAll("\\s+", " ");
        outputString = outputString.toLowerCase();
        return new OutputString(outputString);
    }
}
