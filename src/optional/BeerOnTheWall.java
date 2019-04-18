package optional;

/* 
 * Print the lyrics to the song "99 Bottles of Beer on the wall"
 * 99 bottles of beer on the wall, 99 bottles of beer.
Take one down and pass it around, 98 bottles of beer on the wall.
 * http://99-bottles-of-beer.net/lyrics.html
 */

public class BeerOnTheWall {
	public static void main(String[] args) {

		System.out.println("99 Bottles of Beer on the wall");
		
		for (int i = 99; i >=1; i--) {
				
		
			if (i==2 && (i-1)==1) {
				System.out.println("2 bottles of beer on the wall, 2 bottles of beer.\r\n" + 
						"Take one down and pass it around, 1 bottle of beer on the wall.");
			}else if(i==1&&(i-1)==0) {
					System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\r\n" + 
							"Take one down and pass it around, no more bottles of beer on the wall.");
				}else{
					System.out.println(i+ " bottles of beer on the wall,"+ i+" bottles of beer.\n"
						+ "Take one down and pass it around, "+(i-1)+" bottles of beer on the wall.");
			}
		}
			System.out.println("No more bottles of beer on the wall, no more bottles of beer.\r\n" + 
					"Go to the store and buy some more, 99 bottles of beer on the wall.");
		}
		
	}

