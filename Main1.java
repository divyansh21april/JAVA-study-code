class Main1
{
public static void main(String...k)
{
System.out.println("This is string main");
main(2);
main('c');
main(1.1);
}
public static void main(int a)
{
System.out.println("This is int main");
}
public static void main(double b)
{
System.out.println("This is float main");
}
public static void main(char c)
{
System.out.println("This is char main");
}
}