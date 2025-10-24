package com.coffeedelivery.coffee_delivery_api.services;

import com.coffeedelivery.coffee_delivery_api.models.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {

    public List<Coffee> getCoffees() {

        Coffee c1 = new Coffee();
        c1.setId(1L);
        c1.setTags(List.of("tradicional"));
        c1.setName("Expresso Tradicional");
        c1.setDescription("O tradicional café feito com água quente e grãos moídos");
        c1.setPhoto("tradicional.png");
        c1.setPrice(9.9);

        Coffee c2 = new Coffee();
        c2.setId(2L);
        c2.setTags(List.of("tradicional"));
        c2.setName("Expresso Americano");
        c2.setDescription("Expresso diluído, menos intenso que o tradicional");
        c2.setPhoto("americano.png");
        c2.setPrice(9.9);

        Coffee c3 = new Coffee();
        c3.setId(3L);
        c3.setTags(List.of("tradicional"));
        c3.setName("Expresso Cremoso");
        c3.setDescription("Café expresso tradicional com espuma cremosa");
        c3.setPhoto("cremoso.png");
        c3.setPrice(10.5);

        Coffee c4 = new Coffee();
        c4.setId(4L);
        c4.setTags(List.of("tradicional", "gelado"));
        c4.setName("Expresso Gelado");
        c4.setDescription("Bebida preparada com café expresso e cubos de gelo");
        c4.setPhoto("gelado.png");
        c4.setPrice(10.5);

        Coffee c5 = new Coffee();
        c5.setId(5L);
        c5.setTags(List.of("tradicional", "com leite"));
        c5.setName("Café com Leite");
        c5.setDescription("Meio a meio de expresso tradicional com leite vaporizado");
        c5.setPhoto("leite.png");
        c5.setPrice(9.90);

        Coffee c6 = new Coffee();
        c6.setId(6L);
        c6.setTags(List.of("tradicional", "com leite"));
        c6.setName("Latte");
        c6.setDescription("Uma dose de café expresso com o dobro de leite e espuma cremosa");
        c6.setPhoto("latte.png");
        c6.setPrice(11.5);

        Coffee c7 = new Coffee();
        c7.setId(7L);
        c7.setTags(List.of("tradicional", "com leite"));
        c7.setName("Capuccino");
        c7.setDescription("Bebida com canela feita de doses iguais de café, leite e espuma");
        c7.setPhoto("capuccino.png");
        c7.setPrice(11.5);

        Coffee c8 = new Coffee();
        c8.setId(8L);
        c8.setTags(List.of("tradicional", "com leite"));
        c8.setName("Macchiato");
        c8.setDescription("Café expresso misturado com um pouco de leite quente e espuma");
        c8.setPhoto("macchiato.png");
        c8.setPrice(12.0);

        Coffee c9 = new Coffee();
        c9.setId(9L);
        c9.setTags(List.of("tradicional", "com leite"));
        c9.setName("Mocaccino");
        c9.setDescription("Café expresso com calda de chocolate, pouco leite e espuma");
        c9.setPhoto("mocaccino.png");
        c9.setPrice(12.0);

        Coffee c10 = new Coffee();
        c10.setId(10L);
        c10.setTags(List.of("especial", "com leite"));
        c10.setName("Chocolate Quente");
        c10.setDescription("Bebida feita com chocolate dissolvido no leite quente e café");
        c10.setPhoto("chocolate.png");
        c10.setPrice(10.0);

        Coffee c11 = new Coffee();
        c11.setId(11L);
        c11.setTags(List.of("especial", "alcoólico", "gelado"));
        c11.setName("Cubano");
        c11.setDescription("Drink gelado de café expresso com rum, creme de leite e hortelã");
        c11.setPhoto("cubano.png");
        c11.setPrice(12.9);

        Coffee c12 = new Coffee();
        c12.setId(12L);
        c12.setTags(List.of("especial"));
        c12.setName("Havaiano");
        c12.setDescription("Bebida adocicada preparada com café e leite de coco");
        c12.setPhoto("havaiano.png");
        c12.setPrice(12.9);

        Coffee c13 = new Coffee();
        c13.setId(13L);
        c13.setTags(List.of("especial"));
        c13.setName("Árabe");
        c13.setDescription("Bebida preparada com grãos de café árabe e especiarias");
        c13.setPhoto("arabe.png");
        c13.setPrice(13.0);

        Coffee c14 = new Coffee();
        c14.setId(14L);
        c14.setTags(List.of("especial", "alcoólico"));
        c14.setName("Irlandês");
        c14.setDescription("Bebida a base de café, uísque irlandês, açúcar e chantilly");
        c14.setPhoto("irlandes.png");
        c14.setPrice(13.5);

        return List.of(
                c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14
        );
    }
}
