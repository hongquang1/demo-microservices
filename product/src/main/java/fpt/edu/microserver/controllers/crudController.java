package fpt.edu.microserver.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fpt.edu.microserver.responses.UserRes;
import fpt.edu.microserver.services.ProductService;

@RestController
@RequestMapping("/product")
public class crudController {
	@Autowired
	ProductService productService;
	@GetMapping("")
	public ArrayList<UserRes> getAllProduct() {
		return productService.getAllUser();
	}

}
