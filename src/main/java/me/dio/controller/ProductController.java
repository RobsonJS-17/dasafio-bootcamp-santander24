package me.dio.controller;

import me.dio.entities.Department;
import me.dio.entities.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<Products> gerObjects(){
        Department d1 = new Department(1L,"Tech");
        Department d2 = new Department(2L,"Eletro");

        Products p1 = new Products(1L,"Macbook",4000.0,d1);
        Products p2 = new Products(2L,"Pc Gamer",5000.0,d1);
        Products p3 = new Products(3L,"Smart tv 55",3500.0,d2);
        Products p4 = new Products(4L,"Caixa Bomber",1500.0,d2);

        List<Products> list = Arrays.asList(p1,p2,p3,p4);

        return list;
    }
}


