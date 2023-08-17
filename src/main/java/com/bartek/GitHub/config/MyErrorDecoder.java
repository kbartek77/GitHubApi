package com.bartek.GitHub.config;

import com.bartek.GitHub.exceptions.DataNotFoundException;
import feign.FeignException;
import feign.Response;
import feign.RetryableException;
import feign.codec.ErrorDecoder;

public class MyErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        FeignException exception = feign.FeignException.errorStatus(methodKey, response);
        int status = response.status();
        if (status >= 500) {
            return new RetryableException(
                    response.status(),
                    exception.getMessage(),
                    response.request().httpMethod(),
                    exception,
                    null,
                    response.request());
        }
        if (status == 404) {
            return new DataNotFoundException("Data not found");
        }
        return exception;
    }
}