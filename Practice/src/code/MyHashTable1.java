package code;
public class MyHashTable1
{
	public static void main(String[] args)
	{
		String s1="aaassddfaaaaafdfghaaassddfgffddjjdd";
		int len=s1.length();

		//here I am creating a new array which will count the number of occurrence of a charcater
		//and will act as an hash table because it will map the characters with there ASCII values
		//as there hash key//.
		int arr[]=new int[256];
		for(int i=0;i<len;i++)
		{
			int element=s1.charAt(i);
			if(arr[element]==10)
			{
				System.out.println((char)element);
				break;


				//the code will break when the count of some character in hashtable will reach 10..
			}
			else
			arr[element]=arr[element]+1;
			//System.out.println(element);
		}
	}
}