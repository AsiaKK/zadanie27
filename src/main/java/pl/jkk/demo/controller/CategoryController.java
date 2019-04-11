package pl.jkk.demo.controller;

import pl.jkk.demo.entity.Category;
import pl.jkk.demo.service.CategoryService;

import java.util.List;

public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/names")
    public List<String> getCatgoriesNames() {
        List<String> categoriesNames = categoryService.findAllCategoryNames();
        return categoriesNames;
    }

    @GetMapping("")
    public List<Category> getAllCategories() {
        List<Category> categories = categoryService.findAll();

        return categories;
    }

}
