package com.project.erp.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface saleMapper {
	void addSale(Sale sale);
	List<Sale> viewSale();

}
