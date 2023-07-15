package com.codewithashish.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.codewithashish.entity.Item;
import com.codewithashish.service.ItemService;

public class ItemRestController {
	@Autowired
	private ItemService itemService;

	@PostMapping("/item")
	public ResponseEntity<String> createItem(@RequestBody Item item) {
		String status = itemService.upsert(item);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/course/{itemId}")
	public ResponseEntity<Item> getItem(@PathVariable Integer itemId) {

		Item item = itemService.getById(itemId);
		return new ResponseEntity<>(item, HttpStatus.OK);

	}

	@GetMapping("/item")
	public ResponseEntity<List<Item>> getAllItem() {
		List<Item> allItem = itemService.getAllItem();
		return new ResponseEntity<>(allItem, HttpStatus.OK);

	}

	@PutMapping("/item")
	public ResponseEntity<String> updateItem(@RequestBody Item item) {
		String status = itemService.upsert(item);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@DeleteMapping("/item/{itemId}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer itemId) {
		String status = itemService.deleteById(itemId);
		return new ResponseEntity<>(status, HttpStatus.OK); 
	}

}
