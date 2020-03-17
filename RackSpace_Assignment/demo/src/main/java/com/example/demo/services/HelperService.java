package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelperService {

    public String getReverseString(String inputString){
        StringBuilder sb = new StringBuilder();
        try {
            String[] stringArray = inputString.split(" ");

            for (int i = stringArray.length; i >= 1; i--) {
                sb.append(stringArray[i - 1]).append(" ");
            }
            sb.deleteCharAt(sb.lastIndexOf(" "));
        }catch (Exception e){

        }
        return sb.toString();
    }
}
