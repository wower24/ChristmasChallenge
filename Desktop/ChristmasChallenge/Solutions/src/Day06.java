/*
    TODO: Display a shopping list based on recipes.
    Sum up products (they all are of the same unit).
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day06 {

    public static void main (String[] args)
    {
        List<Recipe> recipes = prepareRecipes();
        Map<String, Integer> shoppingList = new HashMap<>();

        for(int i = 0; i < recipes.size(); i++)
        {
            for(String ingredient: recipes.get(i).getIngredients().keySet())
            {
                if(shoppingList.isEmpty() || !shoppingList.containsKey(ingredient))
                {
                    shoppingList.put(ingredient, recipes.get(i).getIngredients().get(ingredient));
                }
                else
                {
                    //if the ingredient is on the shopping list already - add what we have and what more is needed
                    int oldValue = shoppingList.get(ingredient);
                    int updatedValue = oldValue + recipes.get(i).getIngredients().get(ingredient);

                    shoppingList.replace(ingredient, oldValue, updatedValue);
                }
            }
        }

        System.out.println(shoppingList);
    }

    //method by wswieciekodu
    private static List<Recipe> prepareRecipes() {
        return List.of(
                new Recipe(
                        "Murzynek",
                        Map.of(
                                "Maka", 300,
                                "Cukier", 100,
                                "Jajka", 3,
                                "Czekolada", 200,
                                "Maslo", 200
                        ),
                        "Piekarnik nagrzać do temp. 160 stopni [...]"),
                new Recipe(
                        "Piernik",
                        Map.of(
                                "Maka", 500,
                                "Cukier", 180,
                                "Miod", 250,
                                "Jajka", 1,
                                "Mleko", 80,
                                "Maslo", 150
                        ),
                        "Piekarnik nagrzać do temp. 180 stopni [...]"),
                new Recipe(
                        "Sernik",
                        Map.of(
                                "Maka", 100,
                                "Cukier", 200,
                                "Jajka", 6,
                                "Ser", 1000,
                                "Maslo", 200
                        ),
                        "Piekarnik nagrzać do temp. 160 stopni [...]"),
                new Recipe(
                        "Uszka",
                        Map.of(
                                "Maka", 300,
                                "Woda", 100,
                                "Jajka", 1,
                                "Sol", 1,
                                "Maslo", 200,
                                "Grzyby", 150,
                                "Cebula", 1
                        ),
                        "Zarobić ciasto z mąki, wody, soli i jajka [...]"),
                new Recipe(
                        "Barszcz",
                        Map.of(
                                "Buraki", 1000,
                                "Bulion", 1500,
                                "Zakwas", 200,
                                "Sol", 1
                        ),
                        "Buraki rozdrobnić i zagotować z bulionem [...]"),
                new Recipe(
                        "Pierogi",
                        Map.of(
                                "Maka", 300,
                                "Woda", 100,
                                "Jajka", 1,
                                "Kapusta", 500,
                                "Grzyby", 50,
                                "Cebula", 1
                        ),
                        "Zarobić ciasto z mąki, wody, soli i jajka [...]"),
                new Recipe(
                        "Karp",
                        Map.of(
                                "Karp", 1000,
                                "Maka", 50,
                                "Mleko", 500,
                                "Sol", 1,
                                "Olej", 500
                        ),
                        "Rybę umyć i pokroić w dzwonki [...]")
        );
    }
}
