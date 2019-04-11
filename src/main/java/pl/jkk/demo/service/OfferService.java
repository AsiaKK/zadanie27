package pl.jkk.demo.service;

import pl.jkk.demo.repository.CategoryRepository;
import pl.jkk.demo.repository.OfferRepository;

public class OfferService {

        private final long DEFAULT_CATEGORY_ID = 1;

        private OfferRepository offerRepository;
        private CategoryRepository categoryRepository;

        public OfferService(OfferRepository offerRepository, CategoryRepository categoryRepository) {
            this.offerRepository = offerRepository;
            this.categoryRepository = categoryRepository;
        }
}