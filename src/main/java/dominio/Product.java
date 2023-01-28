package dominio;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Product {
    Integer id;
    String name;
    Integer cost;
    String supplier;



}
