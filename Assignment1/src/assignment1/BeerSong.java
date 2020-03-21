package assignment1;

public class BeerSong {
	
	public static void main(String[]args) {

	
	
	String word = "bottles";

	//creating for loop between 0 & 99 
for (int beerNumber = 99; beerNumber >= 0; beerNumber --)
//for (int beerNumber = 0; beerNumber < 100; beerNumber ++)
{
	//ensuring 1 bottle is singular
	if (beerNumber ==1)
	{
		word = "bottle";
}
	//for loop 
	System.out.println(beerNumber + " " + word + " of beer on the wall");
	System.out.println(beerNumber + " " + word + " of beer.");
	System.out.println("Take one down.");
	System.out.println("Pass it around.");

	if (beerNumber >0)
	
	{
		System.out.println(beerNumber + " " + word + " of beer on the wall. \n");
	}
	//when there is no bottles left
	else
	{
		System.out.println("\n No more bottles of beer on the wall");
	}

}
}
}
 