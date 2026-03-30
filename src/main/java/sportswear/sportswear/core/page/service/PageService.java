package sportswear.sportswear.core.page.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.page.domain.Page;
import sportswear.sportswear.core.page.rep.PageRep;
import sportswear.sportswear.core.page.web.PageView;
import sportswear.sportswear.core.product.domain.Product;
import sportswear.sportswear.core.product.view.ProductView;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PageService {

    private final PageRep pageRep;

    public Page getBookById(Long id) {
        return pageRep.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Page with id " + id + " not found"));
    }

    public PageView getBook(Long id) {

       return toView (getBookById(id));
    }

    public static PageView toView(Page page) {
        if (page == null) return null;

        PageView view = new PageView();
        view.setId(page.getId());
        view.setPageName(page.getPageName());
        view.setContactInfo(page.getContactInfo());
        view.setFilterParam(page.getFilterParam());

        if (page.getProducts() != null) {
            List<ProductView> products = page.getProducts().stream()
                    .map(PageService::toView)
                    .toList();
            view.setProducts(products);
        }

        return view;
    }

    private static ProductView toView(Product product) {
        if (product == null) return null;

        ProductView view = new ProductView();
        view.setId(product.getId());
        view.setName(product.getName());
        view.setPrice(product.getPrice());
        view.setPath(product.getPath());
        view.setImageUrl(product.getImageUrl());
        return view;
    }

}
