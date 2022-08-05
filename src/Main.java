public class Main {

  public static void main(String[] args) {

    MagicBox<String> box1 = new MagicBox<>(4);
    MagicBox<Integer> box2 = new MagicBox<>(5);

    System.out.println(box1.add("Шляпа"));
    System.out.println(box1.add("Галстук"));
    System.out.println(box1.add("Шарф"));
    System.out.println(box1.add("Зонт"));
    System.out.println(box1.add("Трость"));
    System.out.println(box1.pick());
    System.out.println(box1.pick());
    System.out.println(box1.pick());

    System.out.println(box2.add(0));
    System.out.println(box2.add(1));
    System.out.println(box2.pick());
  }
}
