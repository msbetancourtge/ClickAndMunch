package com.bestellen.click_munch.chef;

import com.bestellen.click_munch.order.Order;
import com.bestellen.click_munch.order.OrderService;
import com.bestellen.click_munch.order.Status;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

@RestController
@RequestMapping("/api/chef")
public class ChefController {
    private final ChefService chefService;
    private final OrderService orderService;

    public ChefController(ChefService chefService, OrderService orderService) {
        this.chefService = chefService;
        this.orderService = orderService;
    }

    @GetMapping("/{storeId}/{status}")
    public Collection<Order> getOrderByStatus(@PathVariable Status status, @PathVariable Integer storeId){
        if (!chefService.findOrdersByStatus(status, storeId).isEmpty()){
            return chefService.findOrdersByStatus(status, storeId);
        }
        else {
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No Orders Yet");
        }
    }

    @PatchMapping("/{id}")
    public void changeOrderStatus(@PathVariable Integer id, @RequestBody Status status){
        if(orderService.findById(id)!=null) {
            chefService.changeOrderStatus(id, status);
        }
    }

}
