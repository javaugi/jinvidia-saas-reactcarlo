/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jvidia.reactcloan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wfproducts")
public class ProductWebFluxController {
    /*
    @Autowired
    private WebFluxProductRepository productRepo;

    @GetMapping("/products")
    public Flux<RWFProduct> getAllProducts() {
        return productRepo.findAll();
    }

    @PostMapping("/product")
    public Mono<RWFProduct> addProduct(@RequestBody RWFProduct product) {
        return productRepo.save(product);
    }    
    
    @PostMapping
    public Mono<RWFProduct> create(@RequestBody RWFProduct product) {
        return productRepo.save(product);
    }
    // */
}
