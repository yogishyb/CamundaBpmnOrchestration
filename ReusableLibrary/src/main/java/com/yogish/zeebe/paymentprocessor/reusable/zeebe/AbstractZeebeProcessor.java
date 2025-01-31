package com.yogish.zeebe.paymentprocessor.reusable.zeebe;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;

public abstract class AbstractZeebeProcessor {

    private final  String jobType;

    public void handle(JobClient client, ActivatedJob job) throws Exception {

    }

    public AbstractZeebeProcessor(String jobtype){
        this.jobType=jobtype;
    }

    public void preProcess(JobClient client, ActivatedJob job){
        //do some preprocessing or manipulating data

        processServiceLogic();


    }

    public abstract void processServiceLogic();

    public void PostProcess(){
        // do some post-processing like
        // end zeebe process instance
        // send data to elastic search or any other dashboard tools for business and tech analysis

    }

}
