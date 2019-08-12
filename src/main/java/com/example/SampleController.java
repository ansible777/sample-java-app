package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("sample/{name}")
    public ResponseEntity<String> sample(@PathVariable("name") String name){
        return ResponseEntity.ok("welcome to my world    :     "+name);
    }
    @GetMapping("sample/job/{job}")
    public ResponseEntity<String> sampleJob(@PathVariable("job") String job){
       System.out.println("job");
       return ResponseEntity.ok("your job  :     "+job);
    }
}
