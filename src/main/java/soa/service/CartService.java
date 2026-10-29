package soa.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import soa.model.Cart;
import soa.repository.CartRepository;

@Service
public class CartService {
	
	CartRepository CR;
	
	public CartService(CartRepository CR)
	{
		this.CR = CR;
	}
	
	//Get All Cart Items
	public Object getAllCarts()
	{
		Map<String, Object> response = new HashMap<>();
		try
		{
			List<Cart> cart = CR.findAll(); //READ ALL
			response.put("code", 200);
			response.put("cart", cart);
		}catch(Exception e)
		{
			response.put("code", 500);
			response.put("message", e.getMessage());
		}
		return response;
	}
}
