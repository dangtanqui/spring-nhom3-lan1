package com.tanqui.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;

import com.tanqui.DOMHelper;
import com.tanqui.model.Lop;
import com.tanqui.xml.LopDOM;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/")
public class LopController {
	private static String PATH = "src\\main\\resources\\lop.xml";

	private LopDOM lopDOM = new LopDOM();
	
	@GetMapping("/lops")
	public List<Lop> layTatCaLop() {
		return lopDOM.layTatCaLop();
	}
	
	@GetMapping("/lop/{maLop}")
	public Lop layLopBangMaLop(@PathVariable("maLop") String maLop) {
		Document document = DOMHelper.getDocument(PATH);
		return lopDOM.layLopBangMaLop(document, maLop);
	}
	
	@PostMapping("/lop")
	public ResponseEntity<Void> themLop(@RequestBody Lop lop) {
		lopDOM.themLop(lop);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/lop/{maLop}")
	public ResponseEntity<Void> capNhatLopBangMaLop(@PathVariable("maLop") String maLop, @RequestBody Lop lop) {
		lopDOM.capNhatTenLop(maLop, lop);	
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("/lop/{maLop}")
	public ResponseEntity<Void> xoaSinhVienBangMasv(@PathVariable("maLop") String maLop) {
		lopDOM.xoaLopBangMaLop(maLop);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
