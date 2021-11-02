package fridgy.ui;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import fridgy.model.ingredient.ExpiryDate;
import fridgy.model.ingredient.Ingredient;
import fridgy.model.ingredient.Name;
import fridgy.model.ingredient.Quantity;
import fridgy.model.recipe.Recipe;
import fridgy.testutil.IngredientUtil;
import fridgy.testutil.TypicalIndexes;
import fridgy.testutil.TypicalIngredients;
import fridgy.testutil.TypicalRecipes;

class UiStateTest {

    @Test
    public void constructor_nullParam_throwsException() {
        assertThrows(NullPointerException.class, () -> new UiState(null));
    }

    @Test
    public void constructor_validParam_success() {
        assertDoesNotThrow(() -> new UiState(new ObserverStub()));
    }

    @Test
    public void setActive_validIngredient_successs() {
        assertDoesNotThrow(() -> new UiState(new ObserverStub()).setActive(
            TypicalIngredients.ALMOND
        ));
    }

    @Test
    public void setActive_validRecipe_successs() {
        assertDoesNotThrow(() -> new UiState(new ObserverStub()).setActive(
            TypicalRecipes.BURGER
        ));
    }

    @Test
    public void setActive_nullRecipe_throwsException() {
        assertThrows(NullPointerException.class, () -> new UiState(new ObserverStub()).setActive((Recipe)null));
    }

    @Test
    public void setActive_nullIngredient_throwsException() {
        assertThrows(NullPointerException.class, () -> new UiState(new ObserverStub()).setActive((Ingredient) null));
    }

    @Test
    public void setActive_multiSwitch_success() {
        UiState state1 = new UiState(new ObserverStub());
        UiState state2 = new UiState(new ObserverStub());

        state1.setActive(TypicalRecipes.BURGER);
        state2.setActive(TypicalIngredients.ALMOND);
        assertNotEquals(state1, state2);

        state1.setActive(TypicalIngredients.ALMOND);
        assertEquals(state1, state2);

        state2.setActive(TypicalRecipes.BURGER);
        assertNotEquals(state1, state2);
    }


    class ObserverStub implements Observer {

        @Override
        public void update(Ingredient newItem) {

        }

        @Override
        public void update(Recipe newItem) {

        }

        @Override
        public void update(TabEnum tab) {

        }

        @Override
        public boolean equals(Object other) {
            return other instanceof ObserverStub;
        }
    }
}