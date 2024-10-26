package com.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderEntityRepo extends JpaRepository<OrderEntity, Integer>
{
	@Query(value="select order_entity.pincode,product_tab.pname from entityrelationship_db.order_entity join entityrelationship_db.product_tab on order_entity.id=product_tab .order_fkey",nativeQuery = true)
	public List<Object> getPin();
	
}
