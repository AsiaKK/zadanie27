package pl.jkk.demo.service;

import pl.jkk.demo.repository.CategoryRepository;
import pl.jkk.demo.repository.OfferRepository;

public class CategoryService {

    private final long DEFAULT_CATEGORY_ID = 1;

    private CategoryRepository categoryRepository;
    private OfferRepository offerRepository;

    public CategoryService(CategoryRepository categoryRepository, OfferRepository offerRepository) {
        this.categoryRepository = categoryRepository;
        this.offerRepository = offerRepository;
    }

}