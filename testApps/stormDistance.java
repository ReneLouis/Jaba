/* FUNCTION TO ESTIMATE HOW FAR THUNDER IS
*/

public class stormDistance {
	public static void main (String[] args) {
		float time;  // Time is sec between lightning and thunder.
		float dist;  // Dist in m thunder is at.

		time = 6.7f;
		dist = (float) time * 344;
		System.out.println("The storm is " + dist + "m away.");
	}
}
