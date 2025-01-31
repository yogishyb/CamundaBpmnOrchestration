package com.yogish.zeebe.startingservice.service.impl;

import com.yogish.zeebe.paymentprocessor.reusable.entity.ZeebeWorkerMessage;
import com.yogish.zeebe.paymentprocessor.reusable.util.ZeebeUtil;
import com.yogish.zeebe.startingservice.service.UploadService;
import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ProcessInstanceEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;


@Component
public class UploadServiceImpl implements UploadService {


    @Autowired
    ZeebeClient zeebeClient;

    @Override
    public long processAndStartInstance(String workflowName, MultipartFile file) throws IOException {
        ZeebeWorkerMessage zeebeWorkerMessage = ZeebeWorkerMessage.builder()
                .processId(workflowName)
                //.raw(new String(file.getBytes(), StandardCharsets.UTF_8))
                .build();
        ProcessInstanceEvent event = ZeebeUtil.publish(workflowName,zeebeClient, Map.of("name","yogish"));
        zeebeWorkerMessage.setInstanceId(event.getProcessInstanceKey());

        return zeebeWorkerMessage.getInstanceId();
    }

    @Override
    public long processAndStartInstance(String workflowName) throws IOException {
        ZeebeWorkerMessage zeebeWorkerMessage = ZeebeWorkerMessage.builder()
                .processId(workflowName)
                //.raw(new String(file.getBytes(), StandardCharsets.UTF_8))
                .build();
        ProcessInstanceEvent event = ZeebeUtil.publish(workflowName,zeebeClient, Map.of("name","yogish"));
        zeebeWorkerMessage.setInstanceId(event.getProcessInstanceKey());

        return zeebeWorkerMessage.getInstanceId();


    }
}
