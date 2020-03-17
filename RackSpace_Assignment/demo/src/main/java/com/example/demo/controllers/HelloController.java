package com.example.demo.controllers;

import com.example.demo.services.HelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;
import java.util.HashMap;

@RestController
public class HelloController {

    @Autowired
   private HelperService helperService;

    @GetMapping(value="/api/{input}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HashMap<String,String> getMyReverseMessage(@PathVariable("input") String inputString) {

        HashMap<String, String> map = new HashMap<>();
        String reversedString = helperService.getReverseString(inputString);
        map.put("reversed", reversedString);
        return map;
    }

}
