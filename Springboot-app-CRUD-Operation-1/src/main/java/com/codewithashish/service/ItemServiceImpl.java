package com.codewithashish.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithashish.entity.Item;
import com.codewithashish.model.ItemData;
import com.codewithashish.respository.ItemRepository;
import com.codewithashish.respository.LocationRepository;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemRepository itemRepo;
	private LocationRepository locationRepo;

	@Override
	public String upsert(ItemData itemData) {
		itemRepo.save(itemData);
		return "Success";
	}

	@Override
	public Item getById(Integer itemId) {
		Optional<Item> findById = itemRepo.findById(itemId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Item> getAllItem() {

		return itemRepo.findAll();
	}

	@Override
	public String deleteById(Integer itemId) {
		if (itemRepo.existsById(itemId)) {
			itemRepo.deleteById(itemId);
			return "Delete Success";
		} else {
			return "no record Found";
		}

	}

}
