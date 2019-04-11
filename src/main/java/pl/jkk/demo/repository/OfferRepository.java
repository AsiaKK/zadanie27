package pl.jkk.demo.repository;


import pl.jkk.demo.entity.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

}