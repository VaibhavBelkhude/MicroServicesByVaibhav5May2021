package com.HaloTechnoServe;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;

public class MyTestEndpoint {
	@ReadOperation
    public Map<String,String> myCustomDataA() {
            Map<String,String> m = new HashMap<>();
            m.put("T1", "S1");
            m.put("T2", "S2");
            m.put("T3", "S3");
            return m;
    }
    
    @WriteOperation
    public String myCustomDataB(@Selector String code) {
            
            return "DUMMY SERVICE FROM POST!" + code;
    }
    
    
    @DeleteOperation
    public String myCustomDataC(String id) {
            
            return "DUMMY SERVICE FROM DELETE!" + id;
    }
}


