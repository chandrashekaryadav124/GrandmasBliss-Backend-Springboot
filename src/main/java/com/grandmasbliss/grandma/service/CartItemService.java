package com.grandmasbliss.grandma.service;



import com.grandmasbliss.grandma.model.CartItem;
import com.grandmasbliss.grandma.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public CartItem addItemToCart(CartItem item) {
        return cartItemRepository.save(item);
    }

    public List<CartItem> getUserCart(String userId) {
        return cartItemRepository.findByUserId(userId);
    }

    public Optional<CartItem> getCartItemById(String id) {
        return cartItemRepository.findById(id);
    }

    public CartItem updateCartItem(String id, int quantity) {
        return cartItemRepository.findById(id)
                .map(item -> {
                    item.setQuantity(quantity);
                    return cartItemRepository.save(item);
                }).orElse(null);
    }

    public void removeCartItem(String id) {
        cartItemRepository.deleteById(id);
    }

    public void clearUserCart(String userId) {
        cartItemRepository.deleteByUserId(userId);
    }
}
