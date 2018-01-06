package cn.e3mall.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

	/**
	 * 根据id查询商品信息
	 * 参数 id  Long
	 * 返回值 tb_item
	 */
	public TbItem findTbItemById(Long itemId);
}
