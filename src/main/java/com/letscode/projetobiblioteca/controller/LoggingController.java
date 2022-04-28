package com.letscode.projetobiblioteca.controller;


import com.letscode.projetobiblioteca.exception.BookNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoggingController {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }

    @ExceptionHandler
    public ResponseEntity treatExcepcion(BookNotFoundException e){
        ResponseEntity response = new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        return response;
    }

    @ExceptionHandler
    public ResponseEntity treatRestrictionBean(MethodArgumentNotValidException e){
        Map<String, String> error = new HashMap<>();

        for (int index = 0; index < e.getBindingResult().getAllErrors().size(); index++){

            String fieldName =  ((FieldError) e.getBindingResult().getAllErrors().get(index)).getField();
            String errorMessage = e.getBindingResult().getAllErrors().get(index).getDefaultMessage();
            String erroFormat = String.format("Error in %s message error %s", fieldName, errorMessage);
            error.put(String.format("Erro %s ",index ), String.format("Erro no campo %s mensagem erro %s", fieldName, errorMessage));
            logger.debug(erroFormat);
        }


        return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
    }
}
