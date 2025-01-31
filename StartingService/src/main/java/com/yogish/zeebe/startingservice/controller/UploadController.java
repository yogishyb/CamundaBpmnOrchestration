package com.yogish.zeebe.startingservice.controller;


import com.yogish.zeebe.startingservice.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController()
@RequestMapping("upload")
public class UploadController {


    @Autowired
    UploadService uploadService;

    @PostMapping()
    public long processAndStartInstance(@RequestParam String workflowName
           // ,@RequestParam MultipartFile file
    ) throws IOException {
        return uploadService.processAndStartInstance(workflowName);
    }

    @GetMapping("/list")
    public String get(){
        return "hello";
    }
}
