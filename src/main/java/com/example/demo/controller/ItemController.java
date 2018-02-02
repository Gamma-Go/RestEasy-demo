package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author shi.jiake
 * @time 2018/2/2 11:31
 */
@Path("/item")
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @POST
    @Consumes({MediaType.TEXT_PLAIN})
    @Produces({MediaType.APPLICATION_JSON})
    public Item findByName(String data) {
        System.out.println("data->>>>>" + data);
        return itemService.findByName(data);
    }

    @Path("/{id}")
    @GET
    @Consumes({MediaType.TEXT_PLAIN})
    @Produces({MediaType.APPLICATION_JSON})
    public Item findById(@PathParam("id") String data) {
        System.out.println("data->>>>>" + data);
        return itemService.findById(data);
    }

    @PUT
    @Consumes({MediaType.TEXT_PLAIN})
    @Produces({MediaType.APPLICATION_JSON})
    public Item findByIdByPut(String data) {
        System.out.println("data->>>>>" + data);
        return itemService.findById(data);
    }

    @Path("/{id}")
    @DELETE
    @Consumes({MediaType.TEXT_PLAIN})
    @Produces({MediaType.APPLICATION_JSON})
    public String deleteTest(@PathParam("id") String id) {
        System.out.println("data->>>>>>>>>" + id);
        return "delete Successfully";
    }
}
