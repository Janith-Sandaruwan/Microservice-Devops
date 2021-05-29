package com.demo.movie_catalog_service.controllers;

import com.demo.movie_catalog_service.models.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/catalog")
public class ResourceController {
    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId){
        return Collections.singletonList(
                new CatalogItem("After","After movie",8)
        );
    }
}
