import java.util.Random;

public class MagicBox<T> {

  private int maxItems;
  T[] items;

  public MagicBox(int maxItems) {
    this.maxItems = maxItems;
    items = (T[]) new Object[maxItems];
  }

  boolean add(T item) {
    for (int i = 0; i < items.length; i++) {
      if (items[i] == null) {
        items[i] = item;
        return true;
      }
    }
    return false;
  }

  T pick() throws RuntimeException {
    for (int i = 0; i < items.length; i++) {
      if (items[i] == null) {
        throw new RuntimeException(
            "Коробка не полна! Нужно добавить еще " + (items.length - i) + " предметов");
      }
    }
    Random random = new Random();
    int randomInt = random.nextInt(maxItems - 1);
    return items[randomInt];
  }
}
