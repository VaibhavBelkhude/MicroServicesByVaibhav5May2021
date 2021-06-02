package com.HaloTechnoServe.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import org.springframework.cloud.client.discovery.DiscoveryClient;
@Component
public class ProfileRestConsumer {
	@Autowired
private DiscoveryClient client;
	 public String getProfileData() {
         //get List<SI> using Profile ServiceId
         List<ServiceInstance> list = client.getInstances("PROFILE-SERVICE");
         
         //read single instance from index#0
         ServiceInstance si = list.get(0);
         
         //read URI and Path
         String url = si.getUri() + "/profile/data";
         
         //use RestTemplate obj
         RestTemplate rt = new RestTemplate();
         
         //make call and get response
         ResponseEntity<String> response = rt.getForEntity(url, String.class);
         
         //return back to Employee RestController
         return response.getBody();
 }
}

