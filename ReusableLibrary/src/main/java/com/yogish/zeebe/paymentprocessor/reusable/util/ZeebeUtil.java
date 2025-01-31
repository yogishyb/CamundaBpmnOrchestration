package com.yogish.zeebe.paymentprocessor.reusable.util;

import com.yogish.zeebe.paymentprocessor.reusable.entity.ZeebeWorkerMessage;
import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ProcessInstanceEvent;

import java.util.Map;

public class ZeebeUtil {



    public static ProcessInstanceEvent publish(ZeebeClient client,int version, ZeebeWorkerMessage zeebeWorkerMessage){
            return client.newCreateInstanceCommand()
                    .bpmnProcessId(zeebeWorkerMessage.getProcessId())
                    .version(version)
                    .variables(zeebeWorkerMessage)
                    .send()
                    .join();
    }

    public static ProcessInstanceEvent publish(ZeebeClient client,ZeebeWorkerMessage zeebeWorkerMessage){
        return client.newCreateInstanceCommand()
                .bpmnProcessId(zeebeWorkerMessage.getProcessId())
                .latestVersion()
                .variables(zeebeWorkerMessage)
                .send()
                .join();
    }





    public static <V, K> ProcessInstanceEvent publish(String wfname,ZeebeClient zeebeClient, Map< K, V> of) {
        return zeebeClient.newCreateInstanceCommand()
                .bpmnProcessId(wfname)
                .latestVersion()
                .variables(of)
                .send()
                .join();


    }
}
