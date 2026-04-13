package com.AI.Interior.Assistant.Gms.Service;

import com.AI.Interior.Assistant.Gms.Response.DesignResponse;
import com.AI.Interior.Assistant.Gms.dto.DesignRequest;
import org.springframework.stereotype.Service;

@Service
public class DesignService {

    public DesignResponse generateDesign(DesignRequest request) {
        DesignResponse response=new DesignResponse();
        response.setStyle("Modern");
        response.setFurniture("Sofa + TV Unit");
        response.setColour("White + Grey");
        response.setEstimatedCost("2 lakh");
        return response;

    }
}
