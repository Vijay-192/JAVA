public class Type_casting {
  public static void main(String[] args) {
    // The two (2) type of type_casting
    // 1. impleside type_casting
    // 2. expliside type_casting

    // 1. Impleside type_casting
    int var1 = 1900; // 4 byte
    double var2 = var1; // 8 byte
    System.out.println(var2);

    // 2. Expliside type_casting
    double variable1 = 190.8; // 8 byte
    int variable2 = (int) variable1; // 4 byte
    System.out.println(variable2);




  }
}
