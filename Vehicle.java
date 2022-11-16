record Vehicle (String name, String color, int number)
{
Vehicle(){
this("Mercedes", "Gray", 3045);}

public static void main(String[]args)
{
Vehicle a= new Vehicle("Mercedes", "Gray", 3045);
System.out.println(a);
}
}
