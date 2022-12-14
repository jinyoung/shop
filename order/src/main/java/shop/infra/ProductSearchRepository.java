package shop.infra;

import shop.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="productSearches", path="productSearches")
public interface ProductSearchRepository extends PagingAndSortingRepository<ProductSearch, Long> {

    

    
}
