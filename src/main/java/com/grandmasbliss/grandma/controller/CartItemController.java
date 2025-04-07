package com.grandmasbliss.grandma.controller;


import com.grandmasbliss.grandma.model.CartItem;
import com.grandmasbliss.grandma.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "*")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @PostMapping
    public CartItem addItem(@RequestBody CartItem item) {
        return cartItemService.addItemToCart(item);
    }

    @GetMapping("/user/{userId}")
    public List<CartItem> getUserCart(@PathVariable String userId) {
        return cartItemService.getUserCart(userId);
    }

    @GetMapping("/{id}")
    public Optional<CartItem> getCartItemById(@PathVariable String id) {
        return cartItemService.getCartItemById(id);
    }

    @PutMapping("/{id}")
    public CartItem updateQuantity(@PathVariable String id, @RequestParam int quantity) {
        return cartItemService.updateCartItem(id, quantity);
    }

    @DeleteMapping("/{id}")
    public void removeItem(@PathVariable String id) {
        cartItemService.removeCartItem(id);
    }

    @DeleteMapping("/clear/{userId}")
    public void clearCart(@PathVariable String userId) {
        cartItemService.clearUserCart(userId);
    }
}
