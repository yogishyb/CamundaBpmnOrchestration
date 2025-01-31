package com.yogish.zeebe.paymentprocessor.reusable.entity;


import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;

import static com.yogish.zeebe.paymentprocessor.reusable.constants.Constants.ZeebeConstants.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZeebeWorkerMessage {


    @JsonSetter(INSTANCE_ID)
    private long instanceId;

    @JsonSetter(PROCESS_ID)
    private String processId;

    @JsonSetter(INPUT_FILE_PATH)
    private String inputFilePath;

    @JsonSetter(CORRELATION_KEY)
    private String correlationKey;

    @JsonSetter(RAW)
    private String raw;

}
