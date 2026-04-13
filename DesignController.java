package com.AI.Interior.Assistant.Gms.Controller;

import com.AI.Interior.Assistant.Gms.Response.DesignResponse;
import com.AI.Interior.Assistant.Gms.Service.DesignService;
import com.AI.Interior.Assistant.Gms.dto.DesignRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("design")
public class DesignController {

    @Autowired
    private DesignService service;

    @PostMapping("/generate")
    public DesignResponse designRequest(@RequestBody DesignRequest request) {


        return service.generateDesign(request);

    }
}