package com.yogish.zeebe.notification.zeebe;

import com.yogish.zeebe.paymentprocessor.reusable.zeebe.AbstractZeebeProcessor;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class NotificationZeebeProcessor extends AbstractZeebeProcessor {


    private  final String jobType;

    public NotificationZeebeProcessor(@Value("${zeebe.jobtype:notification-server}") String jobtype) {
        super(jobtype);
        this.jobType=jobtype;
    }

    @Override
    @JobWorker(name = "notification-server")
    public void preProcess(JobClient client, ActivatedJob job) {
        super.preProcess(client,job);
    }

    @Override
    public void processServiceLogic() {
        //todo this service logic
    }
}
