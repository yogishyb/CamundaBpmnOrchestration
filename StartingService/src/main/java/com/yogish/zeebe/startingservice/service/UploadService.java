package com.yogish.zeebe.startingservice.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadService {

    public long processAndStartInstance(String workflowName, MultipartFile file) throws IOException;

    public long processAndStartInstance(String workflowName) throws IOException;

}
