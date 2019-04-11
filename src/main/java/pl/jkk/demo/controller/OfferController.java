package pl.jkk.demo.controller;

import pl.jkk.demo.service.OfferService;

public class OfferController {

    private OfferService offerService;

    @Autowired
    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

}
