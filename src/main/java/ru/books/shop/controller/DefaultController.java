package ru.books.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.books.shop.entity.Product;
import ru.books.shop.entity.ProductType;
import ru.books.shop.repository.ProductRepository;
import ru.books.shop.repository.ProductTypeRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DefaultController {

    @Autowired
    ProductTypeRepository productTypeRepository;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/")
    public String index(Model model) {
        Iterable<ProductType> types = productTypeRepository.findAll();
        Map<ProductType, List<Product>> map = new HashMap<>();
        types.forEach(type -> map.put(type, productRepository.findByProductType(type)));
        model.addAttribute("map", map);
        return "index";
    }

}
