package com.example.TestRestService2.service;

import com.example.TestRestService2.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService {
    public Response modify(Response response) {
        response.setErrorMessage("error");
        return response;
    }
}
