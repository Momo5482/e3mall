package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.pojo.TbItem;
import cn.e3mall.manager.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	
	@RequestMapping("findItemById/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		
		TbItem Item = itemService.findTbItemById(itemId);
		
		return Item;
		
	}
}
