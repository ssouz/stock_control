package dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Stock {
    Product product;
    Integer amount;
    Integer salePrice;

}
