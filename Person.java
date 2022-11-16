record Person (String name, String color, double height, int weight)
{
Person(){
this("Sai", "White", 5.8 , 65);}

public static void main(String[]args)
{
Person a= new Person("Sai", "White", 5.8, 65);
System.out.println(a);
}
}
