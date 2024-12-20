package com.amritraj.jobms.job.payloads;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ExceptionResponse {
    private String message;
    private boolean success;
    private HttpStatus status;
}
