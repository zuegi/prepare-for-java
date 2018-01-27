import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping { SCHINKEN, PILZE, ZWIEBELN, PFEFFER, SAUCE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        // Subclasses must override this method to return this
        protected abstract T self();

        abstract Pizza build();

    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}
