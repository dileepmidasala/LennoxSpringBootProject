package com.lennox.outdoor.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lennox.outdoor.model.OutdoorUnit;

@RestController
public class OutdoorController {
	
	@GetMapping("/getOutdoor")
	public ResponseEntity<OutdoorUnit> getOutDoorData(){
		OutdoorUnit out=new OutdoorUnit();
		out.setId(11);
		out.setOutdoorUnitName("AC");
		out.setTonnage(2);		
		return new ResponseEntity<OutdoorUnit>(out,HttpStatus.OK);
	}

}
