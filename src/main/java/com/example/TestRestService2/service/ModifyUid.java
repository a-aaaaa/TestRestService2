package com.example.TestRestService2.service;

import com.example.TestRestService2.model.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("ModifyUid")
public class ModifyUid implements MyModifyService {
    public Response modify(Response response) {
        response.setUid("New Uid");
        return response;
    }
}
