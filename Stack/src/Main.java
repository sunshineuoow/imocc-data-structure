public class Main {

  public static void main(String[] args) {
    ArrayStack<Integer> stack = new ArrayStack<>();

    for (int i = 0; i < 7; i++) {
      stack.push(i);
      System.out.println(stack);
    }

    stack.pop();
    System.out.println(stack);
  }
}
