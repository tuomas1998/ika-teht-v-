public class App {
    public static void main(String[] args) throws Exception {
        
        int ika = 51;



if (ika >= 0 && ika < 18)

{

System.out.println("Olet alaikäinen");
if (ika >= 15)
{
    System.out.println("Saat ajaa mopoa");
}
if (ika >= 16)
{
    System.out.println("Saat ajaa kevaria");
}
}
else if (ika == 18)
{
    System.out.println("Olet juuri täyttänyt 18 ja saat ajaa autoa");
}
else if (ika % 10 == 0){
    System.out.println("Onnittelut tasavuosikymmenestä!");
}
else if (ika == 58)
{
    System.out.println("Voit halutessasi jäädä varhaiseläkkeelle");
}
if (ika >= 40 && ika <= 50) 
{
    System.out.println("Parasta keski-ikää!");
}

else if (ika >= 65)
{ 
    System.out.println("Olet eläkeläinen"); 
    if (ika == 65)
{
    System.out.println("Hyviä eläkepäiviä!");
}
}
else if (ika == 100)
{
    System.out.println("Onnittelut 100-vuotiaalle");
    System.out.println("Olet elänyt pitkään!");
    System.out.println("Onnittelut pitkästä elämästä");
}


else
{
System.out.println("Olet aikuinen");
}
    }
}
