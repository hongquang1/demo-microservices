package fpt.edu.microserver.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import fpt.edu.microserver.responses.UserRes;

@Service
public class ProductService {
	@Autowired
	RestTemplate restTemplate;
	public ArrayList<UserRes> getAllUser() {
		ArrayList<UserRes> userList = 
                (ArrayList<UserRes>) restTemplate.getForObject("http://API-GATEWAY/user/",List.class);
		
		return userList;
		
	}
}
