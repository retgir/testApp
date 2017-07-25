package pckg; /**
 * Created by vincent on 25.07.2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientController {

    @RequestMapping(value = "/ingredients")
    public Ingredient getIngridients() {
        return new Ingredient(1, "Pasta");
    }
}
