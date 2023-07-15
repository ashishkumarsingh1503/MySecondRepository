package com.codewithashish.service;

import java.util.List;

import com.codewithashish.entity.Item;
import com.codewithashish.model.ItemData;

public interface ItemService {

	public String upsert(ItemData itemData);

	public Item getById(Integer itemId);

	public List<Item> getAllItem();

	public String deleteById(Integer itemId);

}
